package org.jugistanbul.part1.function;

import java.util.List;

public class EmailSenderGood {

    Repository repository = new Repository();

    public void emailClients(List<Client> clients) {
        for (Client client : clients) {
            if (isActiveClient(client)) {
                email(client);
            }
        }
    }


    private boolean isActiveClient(Client client) {
        Client clientRecord = repository.findOne(client.getId());
        return clientRecord.isActive();
    }

    private void email(Client client) {
    }

}
