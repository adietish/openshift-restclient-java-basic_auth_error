/*******************************************************************************
 * Copyright (c) 2020 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package com.openshift.restclient.java.test;

import com.openshift.restclient.ClientBuilder;
import com.openshift.restclient.IClient;
import com.openshift.restclient.ResourceKind;
import com.openshift.restclient.model.template.ITemplate;

public class BasicAuthTest {

    public static void main(String[] args) {
        IClient client = new ClientBuilder("https://192.168.64.171:8443")
                .withUserName("developer")
                .withPassword("badpw")
                .build();
        ITemplate template = client.get(ResourceKind.TEMPLATE, "eap64-basic-s2i", "mynamespace");
        System.out.println(template);
    }

}