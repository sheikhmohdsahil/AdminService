package com.PWS.AdminService.configuration;

public class SwaggerLogsConstants {
   public static final String USER_SAVED_200_SUCCESSFULL ="{\n" +
           "    \"id\": 10,\n" +
           "    \"firstName\": \"abc123\",\n" +
           "    \"lastName\": \"abc123\",\n" +
           "    \"dateOfBirth\": \"2004-04-06T00:00:00.000+00:00\",\n" +
           "    \"email\": \"abc123@gmail.com\",\n" +
           "    \"phoneNumber\": 99887799,\n" +
           "    \"password\": \"$2a$08$A/0rFuq79d0f//9kvOoJWuhQHrstvbHBCL4L/kUoOl1Mn7pG8ct16\",\n" +
           "    \"resetToken\": null,\n" +
           "    \"isActive\": true,\n" +
           "    \"username\": \"abc123@gmail.com\",\n" +
           "    \"authorities\": null\n" +
           "}";
    public static final String USER_SAVE_500_FAILURE="{\n" +
            "    \"timestamp\": \"2023-03-14T17:37:51.196+00:00\",\n" +
            "    \"status\": 500,\n" +
            "    \"error\": \"Internal Server Error\",\n" +
            "    \"path\": \"/public/user\"\n" +
            "}";


    public static final String  USER_SAVE_400_FAILURE="{\n" +
            "    \"timestamp\": \"2023-03-15T04:42:37.796+00:00\",\n" +
            "    \"status\": 400,\n" +
            "    \"error\": \"Bad Request\",\n" +
            "    \"path\": \"/public/user\"\n" +
            "}";


    public static final String USERS_SAVED_200_SUCCESSFULL="[\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"firstName\": \"mohd\",\n" +
            "        \"lastName\": \"sahi\",\n" +
            "        \"dateOfBirth\": null,\n" +
            "        \"email\": \"sheikhmohdsahil456@gmail.com\",\n" +
            "        \"phoneNumber\": 99887799,\n" +
            "        \"password\": \"S@hil06052000\",\n" +
            "        \"resetToken\": null,\n" +
            "        \"isActive\": true,\n" +
            "        \"authorities\": null,\n" +
            "        \"username\": \"sheikhmohdsahil456@gmail.com\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"firstName\": \"mohd\",\n" +
            "        \"lastName\": \"sahil\",\n" +
            "        \"dateOfBirth\": null,\n" +
            "        \"email\": \"sheikhmohdsahil@gmail.com\",\n" +
            "        \"phoneNumber\": 99887799,\n" +
            "        \"password\": \"S@hil0605200\",\n" +
            "        \"resetToken\": null,\n" +
            "        \"isActive\": true,\n" +
            "        \"authorities\": null,\n" +
            "        \"username\": \"sheikhmohdsahil@gmail.com\"\n" +
            "    }\n" +
            "]";

 public static final String USER_FETCHED_WITH_ID_200_SUCCESSFULL ="{\n" +
         "    \"id\": 4,\n" +
         "    \"firstName\": \"mohd\",\n" +
         "    \"lastName\": \"sahi\",\n" +
         "    \"dateOfBirth\": null,\n" +
         "    \"email\": \"sheikhmohdsahil456@gmail.com\",\n" +
         "    \"phoneNumber\": 99887799,\n" +
         "    \"password\": \"S@hil06052000\",\n" +
         "    \"resetToken\": null,\n" +
         "    \"isActive\": true,\n" +
         "    \"authorities\": null,\n" +
         "    \"username\": \"sheikhmohdsahil456@gmail.com\"\n" +
         "}" ;
 public static final String FETCHING_USERDETAIL_WITH_ID_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T07:41:02.181+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/getUser\"\n" +
         "}";
 public static final String FETCHING_USERDETAIL_WITH_ID_500_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-21T07:50:43.955+00:00\",\n" +
         "    \"status\": 500,\n" +
         "    \"error\": \"Internal Server Error\",\n" +
         "    \"path\": \"/user/4\"\n" +
         "}";
 public static final String PERMISSION_UPDATED_200_SUCCESSFULL ="Data Saved " ;
 public static final String PERMISSION_UPDATED_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T07:24:37.608+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/updatePermission\"\n" +
         "}";


 public static final String PERMISSION_DELETED_200_SUCCESSFULL = "PermissionId 1is deleted";
 public static final String PERMISSION_DELETED_400_FAILURE ="{\n" +
         "    \"timestamp\": \"2023-03-14T07:24:37.608+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/deletePermission/\"\n" +
         "}";


 public static final String PERMISSION_FETCHED_WITH_ID_200_SUCCESSFULL = "{\n" +
         "    \"permId\": 4,\n" +
         "    \"isActive\": true,\n" +
         "    \"isView\": true,\n" +
         "    \"isAdd\": true,\n" +
         "    \"isUpdate\": true,\n" +
         "    \"isDelete\": true,\n" +
         "    \"model\": {\n" +
         "        \"id\": 1,\n" +
         "        \"name\": \"employee\",\n" +
         "        \"isActive\": true\n" +
         "    },\n" +
         "    \"role\": {\n" +
         "        \"id\": 1,\n" +
         "        \"name\": \"coFounder\",\n" +
         "        \"isActive\": true\n" +
         "    }\n" +
         "}";

 public static final String FETCHING_PERMISSION_ID_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T07:20:50.315+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/fetchPermissionId\"\n" +
         "}";

 public static final String CREATED_PERMISSION_200_SUCCESSFULL = "Data Saved ";
 public static final String PERMISSION_CREATING_500_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-21T07:58:07.500+00:00\",\n" +
         "    \"status\": 500,\n" +
         "    \"error\": \"Internal Server Error\",\n" +
         "    \"path\": \"/permission\"\n" +
         "}";
 public static final String PERMISSION_CREATING_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T07:13:04.027+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/permission\"\n" +
         "}";
 //public static final String MODEL_UPDATED_500_FAILURE = "";
 public static final String MODEL_UPDATED_200_SUCCESSFULL = "\"Data Saved successfully\"";
 public static final String MODEL_UPDATED_400_FAILURE ="{\n" +
         "    \"timestamp\": \"2023-03-14T06:58:46.910+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/update/Model\"\n" +
         "}";
 public static final String MODEL_DELETED_200_SUCCESSFULL ="Model Deleted Succcessfully";
// public static final String MODEL_DELETED_500_FAILURE ="" ;
 public static final String MODEL_DELETED_400_FAILURE = "{\n" +
        "    \"timestamp\": \"2023-03-14T07:02:07.674+00:00\",\n" +
        "    \"status\": 400,\n" +
        "    \"error\": \"Bad Request\",\n" +
        "    \"path\": \"/private/deleteModel\"\n" +
        "}";
 public static final String MODEL_FETCHED_WITH_ID_200_SUCCESSFULL = "{\n" +
         "    \"id\": 1,\n" +
         "    \"name\": \"employee\",\n" +
         "    \"isActive\": true\n" +
         "}";

 public static final String FETCHING_MODEL_WITH_ID_400_FAILURE = "\"timestamp\": \"2023-03-14T07:05:11.667+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/models\"\n" +
         "}";
 public static final String CREATED_MODEL_200_SUCCESSFULL = "{\n" +
         "    \"id\": 2,\n" +
         "    \"name\": \"admin\",\n" +
         "    \"isActive\": true\n" +
         "}";

 public static final String MODEL_CREATING_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T06:53:44.713+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/model\"\n" +
         "}";


 public static final String USER_ROLE_REF_DELETED_200_SUCCESSFULL = "UserRoleRef  is deleted";
 public static final String USER_ROLE_REF_DELETED_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T06:53:44.713+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/deleteUserRole\"\n" +
         "}";



 public static final String USER_ROLE_REF_UPDATED_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T06:53:44.713+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/update/userRoleRef\"\n" +
         "}";

 public static final String USER_ROLE_REF_UPDATED_200_SUCCESSFULL = "UserRoleXref Data Saved Successfully";


 public static final String USER_ROLE_REF_FETCHED_WITH_ID_200_SUCCESSFULL ="{\n" +
         "    \"refId\": 2,\n" +
         "    \"user\": {\n" +
         "        \"id\": 1,\n" +
         "        \"firstName\": \"Visnu\",\n" +
         "        \"lastName\": \"dfg\",\n" +
         "        \"dob\": \"1970-01-01T00:00:00.000+00:00\",\n" +
         "        \"email\": \"a@gmail.com\",\n" +
         "        \"phoneNumber\": 999999999122349999,\n" +
         "        \"password\": \"$2a$08$Mb699MyKIPa7RP9oj3sHN.l1P9S5MIKAhmhtwlBDSA8CyT.QrZ8zC\",\n" +
         "        \"isActive\": true,\n" +
         "        \"enabled\": true,\n" +
         "        \"authorities\": [],\n" +
         "        \"username\": \"a@gmail.com\",\n" +
         "        \"accountNonExpired\": true,\n" +
         "        \"accountNonLocked\": true,\n" +
         "        \"credentialsNonExpired\": true\n" +
         "    },\n" +
         "    \"role\": {\n" +
         "        \"id\": 1,\n" +
         "        \"name\": \"emp\",\n" +
         "        \"isActive\": true\n" +
         "    },\n" +
         "    \"isActive\": true\n" +
         "} ";
 public static final String FETCHING_USER_ROLE_REF_ID_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T07:38:11.867+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/fetchUserRoleRef\"\n" +
         "}";


 public static final String USER_ROLE_REF_200_SUCCESSFULL ="UserRoleXref Data Saved Successfully";
 public static final String USER_ROLE_REF_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T07:38:11.867+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/userXref\"\n" +
         "}";



 public static final String ROLE_UPDATED_200_SUCCESSFULL ="updated the role successfully";
 public static final String ROLE_UPDATED_400_FAILURE ="   \n" +
         "    \"timestamp\": \"2023-03-14T06:27:46.959+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/update/role\"\n" +
         "}";


 public static final String ROLE_DELETED_200_SUCCESSFULL = "role has been deleted ";
 public static final String ROLE_DELETED_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-14T08:35:56.269+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/deleteRole\"\n" +
         "}";

 public static final String ROLE_FETCHED_WITH_ID_200_SUCCESSFULL ="{\n" +
         "    \"id\": 1,\n" +
         "    \"name\": \"coFounder\",\n" +
         "    \"isActive\": true\n" +
         "}" ;
 public static final String FETCHING_ROLE_WITH_ID_400_FAILURE ="{\n" +
         "    \"timestamp\": \"2023-03-14T08:35:56.269+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/role\"\n" +
         "}";


 public static final String CREATED_ROLE_200_SUCCESSFULL ="{\n" +
         "    \"id\": 2,\n" +
         "    \"name\": \"tester\",\n" +
         "    \"isActive\": true\n" +
         "}" ;

 public static final String ROLE_CREATING_400_FAILURE = "{\n" +
         "    \"timestamp\": \"2023-03-21T08:19:24.213+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/roles\"\n" +
         "}";



 public static final String USER_DELETED_200_SUCCESSFULL = "user with '5' has been deleted " ;
 public static final String DELETE_USER_400_FAILURE ="{\n" +
         "    \"timestamp\": \"2023-03-21T08:19:24.213+00:00\",\n" +
         "    \"status\": 400,\n" +
         "    \"error\": \"Bad Request\",\n" +
         "    \"path\": \"/private/deleteUser\"\n" +
         "}";

 public static final String DELETE_USER_500_FAILURE = "    \"timestamp\": \"2023-03-21T07:43:33.325+00:00\",\n" +
         "    \"status\": 500,\n" +
         "    \"error\": \"Internal Server Error\",\n" +
         "    \"path\": \"/deleteUser/5\"\n" +
         "}";

}