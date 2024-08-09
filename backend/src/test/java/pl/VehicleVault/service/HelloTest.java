package pl.VehicleVault.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void helloTest() {
        HelloService helloService = new HelloService();
        assertEquals("Hello World", helloService.getHello());
    }
}