package com.alienworkspace.ems.ch04.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CachedItem {

    private String stock;

    private Duration duration;

    @Override
    public String toString() {
        return "stock=" + stock;
    }
}
