/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkinglot;

public class DisplayBoard {
    public Status status;

    public DisplayBoard() {
        this.status = Status.AVAILABLE;
    }

    public void update(Status newStatus){
        this.status = newStatus;
    }
}