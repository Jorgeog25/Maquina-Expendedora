package main.core;

public class UnhealthyFood extends Product {

        private final double weight;

        public UnhealthyFood(double price, String name, int id, int quantity) {
            super(price, name, id, quantity);
            this.weight = 100;
        }

        @Override
        public boolean isAvailable() {
            return false;
        }

        @Override
        public void replanishStock(int elements) {

        }

        @Override
        public void upPrice(int percentage) {

        }
}