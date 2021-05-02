package FactoryMethodPattern.idcard;

import java.util.ArrayList;
import java.util.List;

import FactoryMethodPattern.framework.Factory;
import FactoryMethodPattern.framework.Product;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        this.owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return this.owners;
    }
}
