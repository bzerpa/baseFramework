package com.myproject.utilities;

public class Utility {

    public enum Device {
        CHROME("chrome"), FIREFOX("firefox"), SAFARI("safari"), EDGE("edge");

        private String name;

        private Device(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}
