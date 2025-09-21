package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.Desktop;
import java.net.URI;

@RestController
    public class GoogleController {

        @GetMapping("/open-google")
        public String openGooglePage() {
            try {
                // Check if Desktop is supported
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(new URI("https://www.google.com"));
                    return "Google page opened in your browser!";
                } else {
                    return "Desktop is not supported on this system.";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "Failed to open Google: " + e.getMessage();
            }
        }
    }


