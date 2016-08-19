package io.uniplore.entity;

public class RolePermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_permissions.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_permissions.role_name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_permissions.permission
     *
     * @mbggenerated
     */
    private String permission;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_permissions.id
     *
     * @return the value of roles_permissions.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_permissions.id
     *
     * @param id the value for roles_permissions.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_permissions.role_name
     *
     * @return the value of roles_permissions.role_name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_permissions.role_name
     *
     * @param roleName the value for roles_permissions.role_name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_permissions.permission
     *
     * @return the value of roles_permissions.permission
     *
     * @mbggenerated
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_permissions.permission
     *
     * @param permission the value for roles_permissions.permission
     *
     * @mbggenerated
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}