/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.dsm.pictwin;

import cl.ucn.disc.dsm.pictwin.model.Persona;
import cl.ucn.disc.dsm.pictwin.model.PicTwin;
import cl.ucn.disc.dsm.pictwin.services.Controller;
import cl.ucn.disc.dsm.pictwin.utils.FileUtils;

import io.ebean.DB;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.List;

//The main
@Slf4j
public class Main {


    //Starting point
    public static void main(String[] args) {

        log.info("Starting Main ..");

        //the controller
        Controller c = new Controller(DB.getDefault());

        //seed the datebase
        if (c.seed()){
            log.debug("Seeded the database.");
        }

        log.debug("Registering Persona ..");
        Persona p = c.register("durrutia@ucn.cl","durrutia123");
        log.debug("Persona: {}",p);

        File file = FileUtils.getResourceFile("antofagata.jpg");
        log.debug("PicTwin:{}",file);

        PicTwin pt = c.addPic(p.getUlid(),-23.6509,-70.3975,file);
        log.debug("PicTwin: {}",pt);

        Persona p2 = c.login("durrutia@ucn.cl","durrutia123");
        log.debug("Persona: {}",p2);

        List<PicTwin> pts = c.getPicTwins(p.getUlid());
        for (PicTwin ptt: pts){
            log.debug("PicTwin: {}",pt);
        }

        log.debug("Done.");
    }
}