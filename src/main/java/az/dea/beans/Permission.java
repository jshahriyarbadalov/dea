package az.dea.beans;

import az.dea.util.PermissionType;

public class Permission {
    private long permissionId;
    private PermissionType permission;

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public PermissionType getPermission() {
        return permission;
    }

    public void setPermission(PermissionType permission) {
        this.permission = permission;
    }
}
