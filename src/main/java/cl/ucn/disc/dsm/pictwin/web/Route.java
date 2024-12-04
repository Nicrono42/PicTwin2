/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.dsm.pictwin.web;

import lombok.Getter;
import lombok.NonNull;

import java.lang.reflect.Method;
//import java.util.logging.Handler;
import io.javalin.http.Handler;

@Getter
public abstract class Route {

    // the method
    protected Method method;

    // the path
    protected String path;

    // the handler
    protected Handler handler;

    // the constructor
    protected Route(@NonNull final Method method, @NonNull final String path) {
        this.method = method;
        this.path = path;
    }

    // methods
    public enum Method {
        GET,
        POST,
        Put,
    }
}
