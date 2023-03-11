package com.PWS.AdminService.controller;

import com.PWS.AdminService.dto.PermissionDto;
import com.PWS.AdminService.dto.LoginDto;
import com.PWS.AdminService.dto.SignUpDto;
import com.PWS.AdminService.dto.UserRoleRefDto;
import com.PWS.AdminService.entity.*;
//import com.PWS.AdminService.sevice.AdminService.AdminService;
import com.PWS.AdminService.jwtconfig.JwtUtil;
import com.PWS.AdminService.sevice.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody LoginDto loginDto) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(),loginDto.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(loginDto.getEmail());
    }


//    @PostMapping
//   public ResponseEntity createUser (@RequestBody UserDto userDto) {
//        jwtUserDetailsService.loadUserByUsername(userDto);
//        return ResponseEntity.ok().build();
//   }


    //user
    @PostMapping("/public/user")
    public User userSignUp(@RequestBody SignUpDto signupDTO) throws Exception{
        return adminService.userSignUp(signupDTO);

    }

    @PostMapping("/saveUsers")
    public List<User> saveAllUser(@RequestBody List<User> user) {return adminService.saveUsers(user);}

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) {
        adminService.delete(id);
        return new ResponseEntity<String>("user with '" + id + "' has been deleted ", HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getById(@PathVariable("id") Integer id) {return adminService.findById(id);}

    @GetMapping("/alluser")
    public List<User> getAll() {return adminService.findAll();}

    @PutMapping("/update/user")
    public ResponseEntity<Object> updateUser(@RequestBody User user) throws Exception {
        adminService.updateUser(user);
        return ResponseEntity.ok("Data Saved successfully");
    }
















    //role
    @PostMapping("/roles")
    public Role addRole(@RequestBody Role role) {return adminService.saveRole(role);}

    @GetMapping("/role/{id}")
    public Optional<Role> getRoleById(@PathVariable("id") Integer id) {return adminService.findRoleById(id);}

    @GetMapping("/allRole")
    public List<Role> getAllRole() {return adminService.findAllRole();}

    @DeleteMapping("deleteRole/{id}")
    public ResponseEntity<String> deleteRole(@PathVariable("id") Integer id) {
        adminService.deleteRole(id);
        return new ResponseEntity<String>("user with '" + id + "' has been deleted ", HttpStatus.OK);
    }

    @PostMapping("/saveAllRoles")
    public List<Role> saveRoles(@RequestBody List<Role> role) {return adminService.saveRoles(role);}

    @PutMapping("/update/role")
    public ResponseEntity<Object> updateRole(@RequestBody Role role) throws Exception {
        adminService.updateRole(role);
        return ResponseEntity.ok("Data Saved successfully");
    }





    //user Role Ref
    @PostMapping("/userXref")
    public String saveOrUpdateUserRoleXref(@RequestBody UserRoleRefDto userRoleRefDto) throws Exception {
        adminService.saveOrUpdateUserRoleXref(userRoleRefDto);
        return "UserRoleXref Data Saved Successfully";
    }

    @GetMapping("/fetchUserRoleRef/{id}")
    public Optional<UserRoleRef> fetchUserRoleRefById(@PathVariable("id") Integer id) {
        return adminService.fetchUserRoleRefId(id);
    }

    @GetMapping("/fetchAllUserRoleRef")
    public List<UserRoleRef> fetchAllUserRole() {return adminService.fetchAllUserRoleRef();}

    @DeleteMapping("/deleteUserRole/{id}")
    public String deleteUserRole(@PathVariable("id") Integer id) throws Exception {
        adminService.deleteUserRoleById(id);
        return "UserRoleRef id is deleted";
    }

    @PutMapping("/update/userRoleRef")
    public String updateUserRoleXref(@RequestBody UserRoleRefDto userRoleRefDto) throws Exception {
        adminService.updateUserRoleRef(userRoleRefDto);
        return "UserRoleXref Data updated Successfully";
    }


    //models
    @PostMapping("/model")
    public Model addModel(@RequestBody Model model) {return adminService.saveModel(model);}

    @GetMapping("/models/{id}")
    public Optional<Model> findModelById(@PathVariable("id") Integer id) {return adminService.findModelById(id);}

    @GetMapping("/allModel")
    public List<Model> findAllModel() {return adminService.findAllModel();}

    @DeleteMapping("deleteModel/{id}")
    public ResponseEntity<String> deleteModel(@PathVariable("id") Integer id) {
        adminService.deleteModel(id);
        return new ResponseEntity<String>("user with '" + id + "' has been deleted ", HttpStatus.OK);
    }

    @PostMapping("/saveAllModels")
    public List<Model> saveModels(@RequestBody List<Model> model) {return adminService.saveModels(model);}

    @PutMapping("/update/Model")
    public ResponseEntity<Object> updateModel(@RequestBody Model model) throws Exception {
        adminService.updateModel(model);
        return ResponseEntity.ok("Data Saved successfully");

    }


    @PostMapping("/permission")
    public ResponseEntity<Object> addPermission(@RequestBody PermissionDto permissionDto) throws Exception {
        adminService.addOrUpdatePermission(permissionDto);
        return ResponseEntity.ok("Data Saved ");
    }

    @GetMapping("/fetchPermissionId/{id}")
    public Optional<Permission> fetchPermissionId(@PathVariable("id") Integer id) {return adminService.fetchByPermissionId(id);}

    @GetMapping("/fetchAllPermission")
    public List<Permission> fetchAllPermission() {return adminService.fetchAllPermission();}

    @DeleteMapping("/deletePermission/{id}")
    public String deletePermissionById(@PathVariable("id") Integer id) throws Exception {
        adminService.deletePermissionById(id);
        return "PermissionId " + id + "is deleted";
    }

    @PutMapping("/updatePermission")
    public ResponseEntity<Object> updatePermission(@RequestBody PermissionDto permissionDto) throws Exception {
        adminService.updatePermission(permissionDto);
        return ResponseEntity.ok("Data Saved ");
    }

}







