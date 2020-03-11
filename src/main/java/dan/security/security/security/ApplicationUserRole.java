package dan.security.security.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static dan.security.security.security.ApplicationUserPermission.PERSON_READ;
import static dan.security.security.security.ApplicationUserPermission.PERSON_WRITE;

public enum ApplicationUserRole {

    DOCTOR_ROLE(Sets.newHashSet()),
    ADMIN_ROLE(Sets.newHashSet(PERSON_READ, PERSON_WRITE));


    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
