package org.example;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.statistics.Histogram;
import net.jqwik.api.statistics.Statistics;
import net.jqwik.api.statistics.StatisticsReport;
import org.junit.jupiter.api.Assertions;

public class Homework3Test {

    Homework3 homework3 = new Homework3();

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format= Histogram.class)
    public void pass(@ForAll @IntRange(min = -50, max = 50) int a, @ForAll @IntRange(min = -50, max = 50) int b) {
        Assume.that(b !=0);
        int result = a/b;
        Assertions.assertEquals(result, homework3.divisione(a,b));

        Statistics.collect(a, "/", b, "=", homework3.divisione(a,b));
    }

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format= Histogram.class)
    public void fail(@ForAll @IntRange(min = -50, max = 50) int a) {
        int b=0;
        Assertions.assertThrows(ArithmeticException.class,()-> homework3.divisione(a,b));

        Statistics.collect(a, "/", b, "= impossibile");
    }

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format= Histogram.class)
    public void invalid(@ForAll("invalidNumbers") int a, @ForAll("invalidNumbers") int b) {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework3.divisione(a,b));

        Statistics.collect(a, "/", b, "= out of range");
    }

    @Provide
    public Arbitrary<Integer> invalidNumbers(){
        return Arbitraries.oneOf(
                Arbitraries.integers().lessOrEqual(-51),
                Arbitraries.integers().greaterOrEqual(51)
        );
    }
}

