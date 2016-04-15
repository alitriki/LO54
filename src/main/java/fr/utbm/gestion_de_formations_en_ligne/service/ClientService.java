/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.service;

import fr.utbm.gestion_de_formations_en_ligne.entity.Client;
import fr.utbm.gestion_de_formations_en_ligne.repository.HibernateClientDAO;

/**
 *
 * @author Ali
 */
public class ClientService {

    public void insertClientService(Client client) {
        HibernateClientDAO hcd = new HibernateClientDAO();
        hcd.insertClientHibernate(client);
    }

}
