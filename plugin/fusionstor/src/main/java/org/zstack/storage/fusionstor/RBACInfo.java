package org.zstack.storage.fusionstor;

import org.zstack.header.identity.rbac.RBACDescription;

/**
 * Created by kayo on 2018/7/10.
 */
public class RBACInfo implements RBACDescription {
    @Override
    public void permissions() {
        permissionBuilder()
                .adminOnlyAPIs("org.zstack.storage.fusionstor.**")
                .build();
    }

    @Override
    public void contributeToRoles() {

    }

    @Override
    public void roles() {

    }

    @Override
    public void globalReadableResources() {

    }
}
