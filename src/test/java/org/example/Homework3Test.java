package org.example;

import net.jqwik.api.*;
import net.jqwik.api.constraints.FloatRange;
import net.jqwik.api.statistics.Histogram;
import net.jqwik.api.statistics.Statistics;
import net.jqwik.api.statistics.StatisticsReport;
import org.junit.jupiter.api.Assertions;

public class Homework3Test {

    Homework3 homework3 = new Homework3();

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format= Histogram.class)
    public void pass(@ForAll @FloatRange(min = -50.0f, max = 50.0f) float a, @ForAll @FloatRange(min = -50.0f, max = 50.0f) float b) {
        Assume.that(b !=0);
        float result = a/b;
        Assertions.assertEquals(result, homework3.divisione(a,b));

        Statistics.collect(a, "/", b, "=", homework3.divisione(a,b));
    }

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format= Histogram.class)
    public void fail(@ForAll @FloatRange(min = -50.0f, max = 50.0f) float a) {
        float b=0;
        Assertions.assertThrows(ArithmeticException.class,()-> homework3.divisione(a,b));

        Statistics.collect(a, "/", b, "= impossibile");
    }

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format= Histogram.class)
    public void invalid(@ForAll("invalidNumbers") float a, @ForAll("invalidNumbers") float b) {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework3.divisione(a,b));

        Statistics.collect(a, "/", b, "= out of range");
    }

    @Provide
    public Arbitrary<Float> invalidNumbers(){
        return Arbitraries.oneOf(
                Arbitraries.floats().lessOrEqual(-51.0f),
                Arbitraries.floats().greaterOrEqual(51.0f)
        );
    }
}

