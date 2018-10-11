package com.rsrit.maps.dao;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.rsrit.maps.model.Combination;
import com.rsrit.maps.model.RecoveryData;

@Repository
public class RecoveryDao {

    private static final String[] names = { "All Other Combinations", "Group, Group", "Group, Individual", "Group, Medicaid", "Group, Medicare", "Individual, Group", "Individual, Medicaid",
            "Individual, Medicare", "Medicaid, Group", "Medicaid, Individual", "Medicaid, Medicare", "Medicare, Group", "Medicare, Individual", "Medicare, Medicaid" };

    Random rand = new Random();

    public RecoveryData getRecoveryData() {
        RecoveryData rd = new RecoveryData();
        rd.setTotalRecoverableAmount(3100000.54);
        List<Combination> combinations = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);
        for (int i = 0; i < names.length; i++) {
            Double d = (rand.nextInt(10) + 1) * (rand.nextDouble() * 1_000_000);
            d = (double) Math.round(d * 100d) / 100d;
            combinations.add(new Combination(names[i], d));
        }
        rd.setCombinations(combinations);
        return rd;
    }

}
