package oscarblancarte.ipd.state.states;

import oscarblancarte.ipd.state.Server;

public class SafeShutDownState extends AbstractServerState{
    @Override
    public void handleMessage(Server server, String message) {
        System.out.println("The server is stopping, no more messages will be send");
    }
    public SafeShutDownState(final Server server) {
        new Thread(() -> {
            try {
                System.out.println("Server is shutding down");
                Thread.sleep(7000 * 10);
                System.out.println("Message on Queue: "+server.getMessageProcess().countMessage());
                if (server.getMessageProcess().countMessage() < 1) {
                    System.out.println("No more message on Queue");
                    System.out.println("Server is shutdown");
                    server.setState(new StopServerState(server));

                }

            } catch (Exception e) {
            }
        }
        ).start();
    }
}
