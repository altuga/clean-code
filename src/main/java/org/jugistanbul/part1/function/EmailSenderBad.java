package org.jugistanbul.part1.function;

import java.util.List;

public class EmailSenderBad {

    Repository repository = new Repository();

    public void emailClients(List<Client> clients) {
        for (Client client : clients) {
            Client clientRecord = repository.findOne(client.getId());
            if (clientRecord.isActive()) {
                email(client);
            }
        }
    }

    private void email(Client client) {
        // send email...
    }
}
