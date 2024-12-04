/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.dsm.pictwin.web.routes;

import cl.ucn.disc.dsm.pictwin.web.Route;

// The home route
public class Home extends Route {

    // The constructor
    public Home() {
        super(Method.GET, "/");

        this.handler =
                ctx -> {
                    ctx.result("Welcome to PicTwin");
                };
    }
}
