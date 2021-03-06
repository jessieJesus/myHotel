package com.lisichenko.entities;

public enum Role {
    ADMIN, CUSTOMER;

    public static Role getRole(Account account) {
        int roleId = account.getRoleId();
        return Role.values()[roleId - 1];
    }

    public String getName() {
        return name().toLowerCase();
    }
}
