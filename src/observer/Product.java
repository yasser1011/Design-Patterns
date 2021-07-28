package observer;

import java.util.ArrayList;

public class Product implements Subject{
    private String productName;
    private boolean isAvailable;
    private ArrayList<Observer> listOfObservers = new ArrayList<>();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ArrayList<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(ArrayList<Observer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
        if(available)
            notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: listOfObservers) {
            observer.update(productName);
        }
    }
}
