package org.howard.edu.lsp.midterm.question3;
/**
 * The VotingMachineDriver class is used to test the VotingMachine class.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        System.out.println(vm); // Print out the candidates and number of votes
    }
}
