package menu;

public class ShowAvailableTickets implements MenuItem {
    @Override
    public void execute() {
        System.out.print("""
                    \tAvailable operations:
                    \t1. Choose ticket\t2. Add filters
                    \t3. Reset filters\t4. Sort tickets by cost
                    \t5. Reset sorting\t6. ExitChoice
                    \tChoice:\s""");
    }
}
