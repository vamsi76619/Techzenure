package com.techzenure.vamsi.day5;


public class TicketPriceCalculation{
private int ticketid;
private int price;
private static int availableTickets;

public void setTicketid(int ticket) //setter
{
    ticketid = ticket;
}
public int getTicketid() //getter
{
    return ticketid;
}


public int getPrice() //getter
{                       
    return price; 
}
public void setPrice(int prc) //setter
{
    price = prc;
    
}

public static int getAvailableTickets() //getter
{                  
        return availableTickets;
}
public static void setAvailableTickets(int availTicket) //setter
{
    if(availTicket > 0)
        availableTickets = availTicket;
}

public int calculateTicketCost(int nooftickets)//Check ticket availability
{
    int tik = getAvailableTickets();
    if(nooftickets > tik)
        return -1;
    
 
    tik -=  nooftickets;
    setAvailableTickets(tik);
    return price * nooftickets;
    
}
}
