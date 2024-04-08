package org.huawei.optionallong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        long long6 = optionalLong1.getAsLong();
        long long8 = optionalLong1.orElse((long) ' ');
        boolean boolean9 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        boolean boolean10 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElseThrow();
        long long12 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = optionalLong0.equals(obj4);
        java.lang.String str6 = optionalLong0.toString();
        long long8 = optionalLong0.orElse(100L);
        boolean boolean9 = optionalLong0.isPresent();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        boolean boolean10 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        boolean boolean15 = optionalLong13.isEmpty();
        boolean boolean17 = optionalLong13.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream18 = optionalLong13.stream();
        boolean boolean20 = optionalLong13.equals((java.lang.Object) 0);
        long long21 = optionalLong13.getAsLong();
        boolean boolean22 = optionalLong13.isEmpty();
        java.lang.String str23 = optionalLong13.toString();
        java.util.OptionalLong optionalLong25 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream26 = optionalLong25.stream();
        java.util.function.LongSupplier longSupplier27 = null;
        long long28 = optionalLong25.orElseGet(longSupplier27);
        java.util.function.LongSupplier longSupplier29 = null;
        long long30 = optionalLong25.orElseGet(longSupplier29);
        java.util.OptionalLong optionalLong32 = java.util.OptionalLong.of((long) 0);
        long long33 = optionalLong32.orElseThrow();
        long long34 = optionalLong32.orElseThrow();
        long long35 = optionalLong32.orElseThrow();
        java.util.stream.LongStream longStream36 = optionalLong32.stream();
        boolean boolean37 = optionalLong25.equals((java.lang.Object) longStream36);
        boolean boolean38 = optionalLong13.equals((java.lang.Object) longStream36);
        boolean boolean39 = optionalLong1.equals((java.lang.Object) boolean38);
        java.lang.String str40 = optionalLong1.toString();
        java.lang.String str41 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalLong[0]" + "'", str23, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong25);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(optionalLong32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "OptionalLong[0]" + "'", str40, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "OptionalLong[0]" + "'", str41, "OptionalLong[0]");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(35L);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long3 = optionalLong1.orElse((long) (byte) 100);
        boolean boolean4 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean2 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong10.isEmpty();
        long long17 = optionalLong10.orElse(10L);
        long long18 = optionalLong10.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) long18);
        boolean boolean20 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        long long8 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong11);
        boolean boolean13 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream14 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        boolean boolean12 = optionalLong1.isEmpty();
        boolean boolean13 = optionalLong1.isPresent();
        java.lang.String str14 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        boolean boolean12 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse(97L);
        long long10 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) (short) -1);
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        long long10 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.util.stream.LongStream longStream17 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        java.util.function.LongConsumer longConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong0.ifPresentOrElse(longConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 1);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[1]" + "'", str2, "OptionalLong[1]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        long long3 = optionalLong0.orElse((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long4 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        java.util.stream.LongStream longStream5 = optionalLong0.stream();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        long long8 = optionalLong7.orElseThrow();
        long long9 = optionalLong7.orElseThrow();
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        long long11 = optionalLong7.getAsLong();
        java.lang.String str12 = optionalLong7.toString();
        boolean boolean13 = optionalLong0.equals((java.lang.Object) optionalLong7);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass12 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        boolean boolean12 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) 0);
        java.util.function.LongSupplier longSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = optionalLong0.orElseGet(longSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isPresent();
        java.lang.String str6 = optionalLong0.toString();
        java.util.function.LongConsumer longConsumer7 = null;
        optionalLong0.ifPresent(longConsumer7);
        java.util.function.LongConsumer longConsumer9 = null;
        optionalLong0.ifPresent(longConsumer9);
        java.lang.Class<?> wildcardClass11 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) '#');
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long9 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        boolean boolean6 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.getAsLong();
        boolean boolean9 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        java.lang.String str17 = optionalLong11.toString();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) optionalLong11);
        java.util.OptionalLong optionalLong20 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream21 = optionalLong20.stream();
        java.util.function.LongSupplier longSupplier22 = null;
        long long23 = optionalLong20.orElseGet(longSupplier22);
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong20.orElseGet(longSupplier24);
        java.util.OptionalLong optionalLong27 = java.util.OptionalLong.of((long) 0);
        long long28 = optionalLong27.orElseThrow();
        long long29 = optionalLong27.orElseThrow();
        long long30 = optionalLong27.orElseThrow();
        java.util.stream.LongStream longStream31 = optionalLong27.stream();
        boolean boolean32 = optionalLong20.equals((java.lang.Object) longStream31);
        boolean boolean33 = optionalLong11.equals((java.lang.Object) optionalLong20);
        java.util.stream.LongStream longStream34 = optionalLong11.stream();
        java.lang.Class<?> wildcardClass35 = longStream34.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(optionalLong20);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(optionalLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong7.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong7.getClass();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) wildcardClass11);
        long long13 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        java.util.stream.LongStream longStream21 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass22 = longStream21.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.String str7 = optionalLong1.toString();
        java.lang.String str8 = optionalLong1.toString();
        java.lang.String str9 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream12);
        long long15 = optionalLong1.orElse(1L);
        boolean boolean16 = optionalLong1.isEmpty();
        long long17 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) 0);
        boolean boolean9 = optionalLong0.isEmpty();
        long long11 = optionalLong0.orElse((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long12 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass10 = longStream9.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long11 = optionalLong1.orElse((long) (short) 10);
        long long12 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = optionalLong0.equals(obj4);
        java.util.function.LongConsumer longConsumer6 = null;
        optionalLong0.ifPresent(longConsumer6);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) 0);
        boolean boolean9 = optionalLong0.isEmpty();
        java.util.function.LongSupplier longSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = optionalLong0.orElseGet(longSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        long long11 = optionalLong4.orElse((long) (byte) 1);
        long long12 = optionalLong4.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) 1);
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        long long8 = optionalLong4.getAsLong();
        boolean boolean9 = optionalLong4.isPresent();
        long long11 = optionalLong4.orElse((long) 0);
        boolean boolean12 = optionalLong4.isEmpty();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean14 = optionalLong4.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[-1]" + "'", str2, "OptionalLong[-1]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isPresent();
        long long4 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElse((long) (byte) -1);
        boolean boolean5 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        long long11 = optionalLong1.orElse((long) 1);
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        long long8 = optionalLong1.getAsLong();
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        long long3 = optionalLong0.orElse((long) 1);
        java.lang.String str4 = optionalLong0.toString();
        boolean boolean5 = optionalLong0.isPresent();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong.empty" + "'", str4, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        boolean boolean13 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long9 = optionalLong1.orElse((long) (byte) 100);
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[10]" + "'", str11, "OptionalLong[10]");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.lang.String str11 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) 97L);
        boolean boolean12 = optionalLong1.isPresent();
        long long14 = optionalLong1.orElse((long) 0);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        boolean boolean5 = optionalLong1.isEmpty();
        java.lang.String str6 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong7.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        java.util.stream.LongStream longStream11 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong7.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long15 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong17 = java.util.OptionalLong.of((long) 0);
        long long18 = optionalLong17.getAsLong();
        java.lang.String str19 = optionalLong17.toString();
        java.util.stream.LongStream longStream20 = optionalLong17.stream();
        boolean boolean21 = optionalLong17.isEmpty();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream24 = optionalLong23.stream();
        boolean boolean25 = optionalLong23.isEmpty();
        boolean boolean27 = optionalLong23.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream28 = optionalLong23.stream();
        boolean boolean29 = optionalLong23.isEmpty();
        long long30 = optionalLong23.orElseThrow();
        boolean boolean31 = optionalLong17.equals((java.lang.Object) optionalLong23);
        java.util.stream.LongStream longStream32 = optionalLong17.stream();
        java.lang.String str33 = optionalLong17.toString();
        java.util.OptionalLong optionalLong35 = java.util.OptionalLong.of((long) 'a');
        long long36 = optionalLong35.getAsLong();
        long long37 = optionalLong35.getAsLong();
        boolean boolean38 = optionalLong17.equals((java.lang.Object) optionalLong35);
        boolean boolean39 = optionalLong1.equals((java.lang.Object) optionalLong35);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(optionalLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalLong[0]" + "'", str19, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(longStream32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OptionalLong[0]" + "'", str33, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse(97L);
        long long10 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        java.util.stream.LongStream longStream7 = optionalLong5.stream();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) (short) 1);
        boolean boolean10 = optionalLong5.isEmpty();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.orElseThrow();
        long long14 = optionalLong12.orElseThrow();
        long long15 = optionalLong12.orElseThrow();
        boolean boolean16 = optionalLong5.equals((java.lang.Object) long15);
        boolean boolean17 = optionalLong1.equals((java.lang.Object) boolean16);
        java.lang.String str18 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[10]" + "'", str18, "OptionalLong[10]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong7.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        java.util.stream.LongStream longStream11 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong7.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long15 = optionalLong1.getAsLong();
        long long16 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        boolean boolean13 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream14 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong7.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        java.util.stream.LongStream longStream11 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong7.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long15 = optionalLong7.getAsLong();
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong7.orElseGet(longSupplier16);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long10 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong1.orElseGet(longSupplier12);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.getAsLong();
        java.lang.String str14 = optionalLong12.toString();
        java.util.stream.LongStream longStream15 = optionalLong12.stream();
        java.lang.String str16 = optionalLong12.toString();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) str16);
        java.lang.Class<?> wildcardClass18 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        boolean boolean5 = optionalLong3.isEmpty();
        boolean boolean7 = optionalLong3.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream8 = optionalLong3.stream();
        boolean boolean10 = optionalLong3.equals((java.lang.Object) 0);
        boolean boolean11 = optionalLong3.isPresent();
        boolean boolean12 = optionalLong3.isEmpty();
        long long14 = optionalLong3.orElse((long) (short) 0);
        long long15 = optionalLong3.getAsLong();
        long long16 = optionalLong3.orElseThrow();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) long16);
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        long long20 = optionalLong19.getAsLong();
        boolean boolean21 = optionalLong19.isPresent();
        boolean boolean22 = optionalLong19.isPresent();
        java.lang.String str23 = optionalLong19.toString();
        long long24 = optionalLong19.getAsLong();
        java.util.function.LongSupplier longSupplier25 = null;
        long long26 = optionalLong19.orElseGet(longSupplier25);
        java.util.stream.LongStream longStream27 = optionalLong19.stream();
        java.util.stream.LongStream longStream28 = optionalLong19.stream();
        java.util.function.LongSupplier longSupplier29 = null;
        long long30 = optionalLong19.orElseGet(longSupplier29);
        boolean boolean31 = optionalLong1.equals((java.lang.Object) longSupplier29);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalLong[0]" + "'", str23, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        long long3 = optionalLong0.orElse((long) 1);
        java.util.function.LongConsumer longConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong0.ifPresentOrElse(longConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        java.lang.String str8 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.lang.String str10 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[10]" + "'", str6, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[10]" + "'", str10, "OptionalLong[10]");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong9.isPresent();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong9);
        java.util.OptionalLong optionalLong15 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean16 = optionalLong15.isEmpty();
        boolean boolean17 = optionalLong15.isEmpty();
        long long18 = optionalLong15.getAsLong();
        long long19 = optionalLong15.getAsLong();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong15);
        java.util.OptionalLong optionalLong22 = java.util.OptionalLong.of((long) 0);
        long long23 = optionalLong22.getAsLong();
        long long24 = optionalLong22.getAsLong();
        long long26 = optionalLong22.orElse((long) 10);
        java.lang.String str27 = optionalLong22.toString();
        long long28 = optionalLong22.getAsLong();
        java.util.stream.LongStream longStream29 = optionalLong22.stream();
        boolean boolean30 = optionalLong1.equals((java.lang.Object) longStream29);
        boolean boolean31 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(optionalLong15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalLong[0]" + "'", str27, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.String str7 = optionalLong1.toString();
        boolean boolean8 = optionalLong1.isEmpty();
        long long9 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.lang.String str12 = optionalLong11.toString();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream15 = optionalLong14.stream();
        boolean boolean16 = optionalLong14.isEmpty();
        long long17 = optionalLong14.getAsLong();
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong14.orElseGet(longSupplier18);
        boolean boolean20 = optionalLong11.equals((java.lang.Object) long19);
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong11.orElseGet(longSupplier21);
        java.lang.String str23 = optionalLong11.toString();
        boolean boolean24 = optionalLong1.equals((java.lang.Object) optionalLong11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalLong[0]" + "'", str23, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.equals((java.lang.Object) "hi!");
        boolean boolean8 = optionalLong1.isEmpty();
        long long10 = optionalLong1.orElse(10L);
        boolean boolean11 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        long long12 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) ' ');
        long long3 = optionalLong1.orElse(0L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long11 = optionalLong1.orElse((long) (short) 10);
        long long12 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 1);
        java.lang.String str15 = optionalLong14.toString();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) optionalLong14);
        boolean boolean17 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[1]" + "'", str15, "OptionalLong[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        boolean boolean6 = optionalLong0.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong0.stream();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.lang.String str5 = optionalLong1.toString();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) 1.0f);
        java.util.function.LongConsumer longConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        boolean boolean2 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) '#');
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        java.lang.String str12 = optionalLong1.toString();
        long long13 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong7.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong7.getClass();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) wildcardClass11);
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong1.orElseGet(longSupplier13);
        long long16 = optionalLong1.orElse((long) 'a');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        long long8 = optionalLong7.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong7.orElseGet(longSupplier9);
        long long11 = optionalLong7.getAsLong();
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        long long13 = optionalLong7.getAsLong();
        java.util.stream.LongStream longStream14 = optionalLong7.stream();
        boolean boolean15 = optionalLong7.isEmpty();
        long long16 = optionalLong7.getAsLong();
        boolean boolean17 = optionalLong7.isEmpty();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) boolean17);
        java.lang.String str19 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalLong[10]" + "'", str19, "OptionalLong[10]");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        java.lang.String str11 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long7 = optionalLong1.orElseThrow();
        boolean boolean8 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong10.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong10.isPresent();
        java.util.stream.LongStream longStream15 = optionalLong10.stream();
        boolean boolean16 = optionalLong10.isPresent();
        boolean boolean17 = optionalLong10.isEmpty();
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong10.orElseGet(longSupplier18);
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long11 = optionalLong1.orElse((long) (short) 10);
        long long12 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 1);
        java.lang.String str15 = optionalLong14.toString();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) optionalLong14);
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream19 = optionalLong18.stream();
        boolean boolean20 = optionalLong18.isEmpty();
        boolean boolean22 = optionalLong18.equals((java.lang.Object) 0.0f);
        boolean boolean23 = optionalLong18.isEmpty();
        java.util.stream.LongStream longStream24 = optionalLong18.stream();
        java.lang.Class<?> wildcardClass25 = optionalLong18.getClass();
        boolean boolean26 = optionalLong1.equals((java.lang.Object) optionalLong18);
        long long27 = optionalLong18.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[1]" + "'", str15, "OptionalLong[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.lang.String str6 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(97L);
        boolean boolean2 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (-1));
        long long2 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of(1L);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong8.orElseGet(longSupplier9);
        boolean boolean11 = optionalLong1.equals((java.lang.Object) optionalLong8);
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        java.lang.String str13 = optionalLong8.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[1]" + "'", str13, "OptionalLong[1]");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of(1L);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong8.orElseGet(longSupplier9);
        boolean boolean11 = optionalLong1.equals((java.lang.Object) optionalLong8);
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong8.orElseGet(longSupplier12);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        long long11 = optionalLong4.orElse((long) (short) 10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElse((long) (short) 0);
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        long long10 = optionalLong1.orElse((long) (byte) -1);
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        boolean boolean12 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        long long15 = optionalLong14.getAsLong();
        long long16 = optionalLong14.getAsLong();
        long long18 = optionalLong14.orElse((long) 10);
        java.lang.String str19 = optionalLong14.toString();
        long long20 = optionalLong14.getAsLong();
        java.util.stream.LongStream longStream21 = optionalLong14.stream();
        boolean boolean22 = optionalLong1.equals((java.lang.Object) optionalLong14);
        boolean boolean23 = optionalLong14.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalLong[0]" + "'", str19, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse(1L);
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        boolean boolean11 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        java.util.stream.LongStream longStream12 = optionalLong9.stream();
        long long13 = optionalLong9.orElseThrow();
        boolean boolean14 = optionalLong1.equals((java.lang.Object) long13);
        java.util.OptionalLong optionalLong16 = java.util.OptionalLong.of((long) 0);
        long long17 = optionalLong16.orElseThrow();
        long long18 = optionalLong16.orElseThrow();
        java.util.stream.LongStream longStream19 = optionalLong16.stream();
        long long20 = optionalLong16.getAsLong();
        java.lang.String str21 = optionalLong16.toString();
        java.util.stream.LongStream longStream22 = optionalLong16.stream();
        boolean boolean23 = optionalLong1.equals((java.lang.Object) optionalLong16);
        java.util.stream.LongStream longStream24 = optionalLong16.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionalLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalLong[0]" + "'", str21, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longStream24);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.String str7 = optionalLong1.toString();
        boolean boolean8 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) '#');
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        long long21 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong23.orElseGet(longSupplier24);
        java.util.stream.LongStream longStream26 = optionalLong23.stream();
        java.util.stream.LongStream longStream27 = optionalLong23.stream();
        long long28 = optionalLong23.orElseThrow();
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((long) 0);
        long long31 = optionalLong30.orElseThrow();
        long long32 = optionalLong30.orElseThrow();
        long long33 = optionalLong30.orElseThrow();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        boolean boolean35 = optionalLong23.equals((java.lang.Object) longStream34);
        boolean boolean36 = optionalLong23.isPresent();
        boolean boolean37 = optionalLong1.equals((java.lang.Object) optionalLong23);
        java.util.function.LongConsumer longConsumer38 = null;
        java.lang.Runnable runnable39 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong23.ifPresentOrElse(longConsumer38, runnable39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(32L);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        boolean boolean8 = optionalLong1.isEmpty();
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[97]" + "'", str9, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) 100L);
        java.util.function.LongConsumer longConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) 97L);
        boolean boolean12 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        long long15 = optionalLong14.getAsLong();
        java.lang.String str16 = optionalLong14.toString();
        boolean boolean17 = optionalLong14.isPresent();
        java.util.stream.LongStream longStream18 = optionalLong14.stream();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) longStream18);
        java.util.function.LongConsumer longConsumer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isPresent();
        boolean boolean9 = optionalLong1.isPresent();
        long long10 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.equals((java.lang.Object) "hi!");
        boolean boolean8 = optionalLong1.isEmpty();
        long long10 = optionalLong1.orElse(10L);
        java.lang.String str11 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(10L);
        long long2 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.String str7 = optionalLong1.toString();
        boolean boolean8 = optionalLong1.isEmpty();
        long long9 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        boolean boolean12 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '#');
        java.lang.String str2 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[35]" + "'", str2, "OptionalLong[35]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.String str5 = optionalLong1.toString();
        java.lang.String str6 = optionalLong1.toString();
        java.lang.String str7 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        long long17 = optionalLong11.orElse((long) (-1));
        long long18 = optionalLong11.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) optionalLong11);
        long long21 = optionalLong11.orElse((long) (byte) -1);
        java.util.function.LongSupplier longSupplier22 = null;
        long long23 = optionalLong11.orElseGet(longSupplier22);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        long long12 = optionalLong11.getAsLong();
        boolean boolean14 = optionalLong11.equals((java.lang.Object) (-1));
        boolean boolean15 = optionalLong11.isEmpty();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) optionalLong11);
        java.util.stream.LongStream longStream17 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long8 = optionalLong1.orElse((-1L));
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong10.isEmpty();
        java.lang.String str16 = optionalLong10.toString();
        java.util.function.LongSupplier longSupplier17 = null;
        long long18 = optionalLong10.orElseGet(longSupplier17);
        java.util.OptionalLong optionalLong20 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream21 = optionalLong20.stream();
        boolean boolean22 = optionalLong20.isEmpty();
        boolean boolean24 = optionalLong20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalLong20.isEmpty();
        long long27 = optionalLong20.orElse(10L);
        long long28 = optionalLong20.orElseThrow();
        boolean boolean29 = optionalLong10.equals((java.lang.Object) long28);
        long long30 = optionalLong10.orElseThrow();
        java.util.OptionalLong optionalLong32 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier33 = null;
        long long34 = optionalLong32.orElseGet(longSupplier33);
        java.util.stream.LongStream longStream35 = optionalLong32.stream();
        java.util.stream.LongStream longStream36 = optionalLong32.stream();
        long long37 = optionalLong32.orElseThrow();
        java.util.OptionalLong optionalLong39 = java.util.OptionalLong.of((long) 0);
        long long40 = optionalLong39.orElseThrow();
        long long41 = optionalLong39.orElseThrow();
        long long42 = optionalLong39.orElseThrow();
        java.util.stream.LongStream longStream43 = optionalLong39.stream();
        boolean boolean44 = optionalLong32.equals((java.lang.Object) longStream43);
        boolean boolean45 = optionalLong32.isPresent();
        boolean boolean46 = optionalLong10.equals((java.lang.Object) optionalLong32);
        java.util.stream.LongStream longStream47 = optionalLong32.stream();
        boolean boolean48 = optionalLong1.equals((java.lang.Object) longStream47);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(optionalLong20);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(optionalLong32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(longStream35);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(longStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        java.lang.Class<?> wildcardClass12 = longStream11.getClass();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream11);
        java.util.OptionalLong optionalLong15 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong15.orElseGet(longSupplier16);
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong15.orElseGet(longSupplier18);
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong15);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionalLong15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong9.isPresent();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong9);
        java.util.OptionalLong optionalLong15 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean16 = optionalLong15.isEmpty();
        boolean boolean17 = optionalLong15.isEmpty();
        long long18 = optionalLong15.getAsLong();
        long long19 = optionalLong15.getAsLong();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong15);
        java.util.OptionalLong optionalLong22 = java.util.OptionalLong.of((long) 0);
        long long23 = optionalLong22.getAsLong();
        long long24 = optionalLong22.getAsLong();
        long long26 = optionalLong22.orElse((long) 10);
        java.lang.String str27 = optionalLong22.toString();
        long long28 = optionalLong22.getAsLong();
        java.util.stream.LongStream longStream29 = optionalLong22.stream();
        boolean boolean30 = optionalLong1.equals((java.lang.Object) longStream29);
        java.util.stream.LongStream longStream31 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(optionalLong15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalLong[0]" + "'", str27, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(longStream31);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong11);
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        boolean boolean15 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean16 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean4 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong9.isPresent();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong9);
        long long14 = optionalLong9.getAsLong();
        boolean boolean15 = optionalLong9.isEmpty();
        java.util.stream.LongStream longStream16 = optionalLong9.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.orElseThrow();
        long long11 = optionalLong9.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong9.stream();
        long long14 = optionalLong9.orElse((long) (byte) -1);
        long long15 = optionalLong9.orElseThrow();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) long15);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong9.isPresent();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong9);
        long long14 = optionalLong9.getAsLong();
        java.util.function.LongConsumer longConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong9.ifPresentOrElse(longConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
        long long13 = optionalLong1.getAsLong();
        long long14 = optionalLong1.orElseThrow();
        boolean boolean15 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long8 = optionalLong1.orElse((-1L));
        java.lang.String str9 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.lang.String str5 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.String str5 = optionalLong1.toString();
        long long6 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        boolean boolean13 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[97]" + "'", str6, "OptionalLong[97]");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.lang.String str8 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong13.orElseGet(longSupplier15);
        java.util.function.LongSupplier longSupplier17 = null;
        long long18 = optionalLong13.orElseGet(longSupplier17);
        java.util.OptionalLong optionalLong20 = java.util.OptionalLong.of((long) 0);
        long long21 = optionalLong20.orElseThrow();
        long long22 = optionalLong20.orElseThrow();
        long long23 = optionalLong20.orElseThrow();
        java.util.stream.LongStream longStream24 = optionalLong20.stream();
        boolean boolean25 = optionalLong13.equals((java.lang.Object) longStream24);
        boolean boolean26 = optionalLong1.equals((java.lang.Object) longStream24);
        java.util.function.LongConsumer longConsumer27 = null;
        java.lang.Runnable runnable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer27, runnable28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(optionalLong20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean10 = optionalLong1.isPresent();
        long long12 = optionalLong1.orElse((long) 10);
        long long13 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long12 = optionalLong1.orElse((long) ' ');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong7.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong7.getClass();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) wildcardClass11);
        boolean boolean13 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElseThrow();
        long long11 = optionalLong1.getAsLong();
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        long long4 = optionalLong0.orElse((long) (byte) 10);
        java.util.function.LongSupplier longSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.orElseGet(longSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        long long17 = optionalLong11.orElse((long) (-1));
        long long18 = optionalLong11.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) optionalLong11);
        long long21 = optionalLong11.orElse((long) (byte) -1);
        boolean boolean22 = optionalLong11.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        long long7 = optionalLong1.orElse((long) (-1));
        java.util.function.LongConsumer longConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.String str5 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isPresent();
        long long3 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.empty();
        boolean boolean6 = optionalLong4.equals((java.lang.Object) '#');
        java.lang.String str7 = optionalLong4.toString();
        long long9 = optionalLong4.orElse((long) (short) 1);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong.empty" + "'", str7, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isPresent();
        long long3 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong10);
        java.util.function.LongConsumer longConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong10.ifPresent(longConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.String str7 = optionalLong1.toString();
        java.lang.String str8 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong10.isEmpty();
        long long17 = optionalLong10.orElse(10L);
        long long18 = optionalLong10.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) long18);
        long long21 = optionalLong1.orElse(97L);
        java.util.function.LongConsumer longConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        long long5 = optionalLong1.orElse((long) 1);
        java.lang.String str6 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[97]" + "'", str6, "OptionalLong[97]");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        boolean boolean6 = optionalLong0.isPresent();
        boolean boolean7 = optionalLong0.isEmpty();
        boolean boolean8 = optionalLong0.isEmpty();
        boolean boolean9 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong11);
        long long13 = optionalLong11.getAsLong();
        boolean boolean14 = optionalLong11.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        long long7 = optionalLong1.orElse((long) (-1));
        long long8 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElse((long) ' ');
        java.lang.String str11 = optionalLong1.toString();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        boolean boolean15 = optionalLong13.isEmpty();
        long long16 = optionalLong13.getAsLong();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) optionalLong13);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) 100L);
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        long long14 = optionalLong13.getAsLong();
        java.lang.String str15 = optionalLong13.toString();
        java.lang.String str16 = optionalLong13.toString();
        boolean boolean17 = optionalLong13.isPresent();
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream20 = optionalLong19.stream();
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong19.orElseGet(longSupplier21);
        java.lang.Class<?> wildcardClass23 = optionalLong19.getClass();
        boolean boolean24 = optionalLong13.equals((java.lang.Object) wildcardClass23);
        long long26 = optionalLong13.orElse((long) (short) -1);
        java.util.OptionalLong optionalLong28 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier29 = null;
        long long30 = optionalLong28.orElseGet(longSupplier29);
        java.util.stream.LongStream longStream31 = optionalLong28.stream();
        boolean boolean32 = optionalLong28.isEmpty();
        boolean boolean33 = optionalLong13.equals((java.lang.Object) optionalLong28);
        boolean boolean34 = optionalLong1.equals((java.lang.Object) optionalLong28);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[0]" + "'", str15, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(optionalLong28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 1);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        long long8 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        java.lang.Class<?> wildcardClass12 = longStream11.getClass();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream11);
        java.lang.Class<?> wildcardClass14 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        long long21 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong23.orElseGet(longSupplier24);
        java.util.stream.LongStream longStream26 = optionalLong23.stream();
        java.util.stream.LongStream longStream27 = optionalLong23.stream();
        long long28 = optionalLong23.orElseThrow();
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((long) 0);
        long long31 = optionalLong30.orElseThrow();
        long long32 = optionalLong30.orElseThrow();
        long long33 = optionalLong30.orElseThrow();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        boolean boolean35 = optionalLong23.equals((java.lang.Object) longStream34);
        boolean boolean36 = optionalLong23.isPresent();
        boolean boolean37 = optionalLong1.equals((java.lang.Object) optionalLong23);
        java.util.OptionalLong optionalLong39 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream40 = optionalLong39.stream();
        boolean boolean41 = optionalLong39.isEmpty();
        boolean boolean43 = optionalLong39.equals((java.lang.Object) 0.0f);
        boolean boolean44 = optionalLong39.isEmpty();
        java.util.stream.LongStream longStream45 = optionalLong39.stream();
        boolean boolean46 = optionalLong23.equals((java.lang.Object) longStream45);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(optionalLong39);
        org.junit.Assert.assertNotNull(longStream40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        long long12 = optionalLong11.getAsLong();
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong11.orElseGet(longSupplier13);
        long long15 = optionalLong11.getAsLong();
        java.util.stream.LongStream longStream16 = optionalLong11.stream();
        java.lang.String str17 = optionalLong11.toString();
        java.lang.String str18 = optionalLong11.toString();
        boolean boolean19 = optionalLong11.isPresent();
        boolean boolean20 = optionalLong11.isEmpty();
        java.util.OptionalLong optionalLong22 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream23 = optionalLong22.stream();
        boolean boolean24 = optionalLong22.isEmpty();
        long long25 = optionalLong22.getAsLong();
        long long26 = optionalLong22.getAsLong();
        boolean boolean27 = optionalLong22.isPresent();
        long long28 = optionalLong22.orElseThrow();
        boolean boolean29 = optionalLong11.equals((java.lang.Object) optionalLong22);
        boolean boolean30 = optionalLong1.equals((java.lang.Object) boolean29);
        long long32 = optionalLong1.orElse(52L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[0]" + "'", str18, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalLong22);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream16 = optionalLong11.stream();
        boolean boolean18 = optionalLong11.equals((java.lang.Object) 0);
        long long19 = optionalLong11.getAsLong();
        long long21 = optionalLong11.orElse((long) '4');
        boolean boolean22 = optionalLong1.equals((java.lang.Object) long21);
        long long24 = optionalLong1.orElse((long) 1);
        java.util.function.LongConsumer longConsumer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long6 = optionalLong1.orElse(35L);
        long long7 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
        long long14 = optionalLong1.orElse((long) (short) -1);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        java.lang.String str17 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.lang.String str6 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        boolean boolean4 = optionalLong0.isEmpty();
        boolean boolean5 = optionalLong0.isPresent();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = optionalLong0.equals(obj4);
        java.lang.String str6 = optionalLong0.toString();
        java.util.function.LongConsumer longConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong0.ifPresentOrElse(longConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        long long6 = optionalLong1.orElseThrow();
        java.lang.String str7 = optionalLong1.toString();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        long long10 = optionalLong1.getAsLong();
        long long12 = optionalLong1.orElse((long) (-1));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        boolean boolean12 = optionalLong9.equals((java.lang.Object) (-1));
        java.lang.String str13 = optionalLong9.toString();
        java.util.stream.LongStream longStream14 = optionalLong9.stream();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) longStream14);
        long long16 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long5 = optionalLong1.orElse((-1L));
        long long7 = optionalLong1.orElse(100L);
        boolean boolean8 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        long long9 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long11 = optionalLong1.getAsLong();
        java.lang.String str12 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        long long6 = optionalLong1.getAsLong();
        java.lang.Object obj7 = null;
        boolean boolean8 = optionalLong1.equals(obj7);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream16 = optionalLong11.stream();
        boolean boolean18 = optionalLong11.equals((java.lang.Object) 0);
        long long19 = optionalLong11.getAsLong();
        long long21 = optionalLong11.orElse((long) '4');
        boolean boolean22 = optionalLong1.equals((java.lang.Object) long21);
        long long24 = optionalLong1.orElse(1L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '4');
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.lang.String str6 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[52]" + "'", str6, "OptionalLong[52]");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
        long long14 = optionalLong1.orElse((long) (short) -1);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        long long17 = optionalLong1.orElseThrow();
        java.lang.String str18 = optionalLong1.toString();
        java.util.stream.LongStream longStream19 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[0]" + "'", str18, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.lang.String str9 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElseThrow();
        java.lang.String str11 = optionalLong1.toString();
        long long12 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[10]" + "'", str11, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong9.isPresent();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong9);
        java.util.OptionalLong optionalLong15 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean16 = optionalLong15.isEmpty();
        boolean boolean17 = optionalLong15.isEmpty();
        long long18 = optionalLong15.getAsLong();
        long long19 = optionalLong15.getAsLong();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong15);
        java.util.OptionalLong optionalLong22 = java.util.OptionalLong.of((long) 0);
        long long23 = optionalLong22.getAsLong();
        long long24 = optionalLong22.getAsLong();
        long long26 = optionalLong22.orElse((long) 10);
        java.lang.String str27 = optionalLong22.toString();
        long long28 = optionalLong22.getAsLong();
        java.util.stream.LongStream longStream29 = optionalLong22.stream();
        boolean boolean30 = optionalLong1.equals((java.lang.Object) longStream29);
        java.util.function.LongSupplier longSupplier31 = null;
        long long32 = optionalLong1.orElseGet(longSupplier31);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(optionalLong15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalLong[0]" + "'", str27, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.lang.String str4 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        long long21 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong23.orElseGet(longSupplier24);
        java.util.stream.LongStream longStream26 = optionalLong23.stream();
        java.util.stream.LongStream longStream27 = optionalLong23.stream();
        long long28 = optionalLong23.orElseThrow();
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((long) 0);
        long long31 = optionalLong30.orElseThrow();
        long long32 = optionalLong30.orElseThrow();
        long long33 = optionalLong30.orElseThrow();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        boolean boolean35 = optionalLong23.equals((java.lang.Object) longStream34);
        boolean boolean36 = optionalLong23.isPresent();
        boolean boolean37 = optionalLong1.equals((java.lang.Object) optionalLong23);
        long long38 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long10 = optionalLong1.orElseThrow();
        long long11 = optionalLong1.getAsLong();
        long long12 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        java.lang.String str8 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        java.lang.Class<?> wildcardClass4 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass5 = longStream4.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long6 = optionalLong1.orElse((long) (short) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        java.lang.String str9 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElseThrow();
        long long11 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 'a');
        long long8 = optionalLong7.getAsLong();
        boolean boolean9 = optionalLong7.isEmpty();
        long long10 = optionalLong7.orElseThrow();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) optionalLong7);
        boolean boolean12 = optionalLong7.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElse(35L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong9.orElseGet(longSupplier11);
        long long13 = optionalLong9.getAsLong();
        java.util.stream.LongStream longStream14 = optionalLong9.stream();
        boolean boolean15 = optionalLong9.isEmpty();
        long long17 = optionalLong9.orElse((long) (byte) 1);
        boolean boolean18 = optionalLong9.isPresent();
        long long19 = optionalLong9.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        boolean boolean21 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        long long5 = optionalLong1.orElse((long) (short) 10);
        boolean boolean6 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        boolean boolean4 = optionalLong1.isEmpty();
        long long6 = optionalLong1.orElse((long) (byte) 10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isPresent();
        long long9 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        boolean boolean15 = optionalLong13.isEmpty();
        boolean boolean17 = optionalLong13.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream18 = optionalLong13.stream();
        boolean boolean19 = optionalLong13.isEmpty();
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong13.orElseGet(longSupplier20);
        java.util.stream.LongStream longStream22 = optionalLong13.stream();
        java.util.stream.LongStream longStream23 = optionalLong13.stream();
        java.lang.Class<?> wildcardClass24 = optionalLong13.getClass();
        boolean boolean25 = optionalLong1.equals((java.lang.Object) wildcardClass24);
        long long26 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        long long9 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long11 = optionalLong1.getAsLong();
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.String str7 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        boolean boolean7 = optionalLong5.isEmpty();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream10 = optionalLong5.stream();
        boolean boolean12 = optionalLong5.equals((java.lang.Object) 0);
        boolean boolean13 = optionalLong5.isPresent();
        boolean boolean14 = optionalLong5.isEmpty();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) boolean14);
        long long16 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long10 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long8 = optionalLong1.orElse((long) (short) 1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = optionalLong0.equals(obj4);
        java.lang.String str6 = optionalLong0.toString();
        long long8 = optionalLong0.orElse(100L);
        java.util.function.LongSupplier longSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = optionalLong0.orElseGet(longSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long17 = optionalLong7.orElse((long) ' ');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) (short) -1);
        long long10 = optionalLong1.orElse((long) (byte) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long11 = optionalLong1.orElse((long) (short) 10);
        long long12 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 1);
        java.lang.String str15 = optionalLong14.toString();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) optionalLong14);
        java.lang.Class<?> wildcardClass17 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[1]" + "'", str15, "OptionalLong[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long13 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass14 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong10.isEmpty();
        long long17 = optionalLong10.orElse(10L);
        long long18 = optionalLong10.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) long18);
        java.lang.Class<?> wildcardClass20 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream12);
        long long15 = optionalLong1.orElse(1L);
        long long17 = optionalLong1.orElse((long) 'a');
        java.lang.String str18 = optionalLong1.toString();
        long long19 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[0]" + "'", str18, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        long long4 = optionalLong0.orElse((long) (byte) 10);
        boolean boolean5 = optionalLong0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        long long17 = optionalLong11.orElse((long) (-1));
        long long18 = optionalLong11.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) optionalLong11);
        long long21 = optionalLong11.orElse((long) (byte) -1);
        java.lang.String str22 = optionalLong11.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OptionalLong[0]" + "'", str22, "OptionalLong[0]");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse(100L);
        java.util.function.LongConsumer longConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        java.lang.String str10 = optionalLong1.toString();
        long long12 = optionalLong1.orElse((-1L));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        long long10 = optionalLong1.getAsLong();
        boolean boolean11 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        boolean boolean13 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong8.stream();
        boolean boolean10 = optionalLong8.isEmpty();
        boolean boolean12 = optionalLong8.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream13 = optionalLong8.stream();
        java.lang.Class<?> wildcardClass14 = longStream13.getClass();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) longStream13);
        boolean boolean16 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream12);
        long long15 = optionalLong1.orElse(1L);
        long long17 = optionalLong1.orElse((long) 'a');
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong1.orElseGet(longSupplier18);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.lang.String str13 = optionalLong7.toString();
        boolean boolean14 = optionalLong7.isEmpty();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong7.orElseGet(longSupplier15);
        boolean boolean17 = optionalLong7.isEmpty();
        boolean boolean18 = optionalLong7.isPresent();
        java.lang.Class<?> wildcardClass19 = optionalLong7.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) 0);
        boolean boolean9 = optionalLong0.isEmpty();
        long long11 = optionalLong0.orElse((long) (-1));
        long long13 = optionalLong0.orElse(1L);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        boolean boolean7 = optionalLong0.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = optionalLong0.orElseGet(longSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) '4');
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 'a');
        boolean boolean7 = optionalLong6.isEmpty();
        boolean boolean8 = optionalLong6.isPresent();
        java.util.stream.LongStream longStream9 = optionalLong6.stream();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong6.orElseGet(longSupplier10);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) long11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.isEmpty();
        boolean boolean9 = optionalLong1.isEmpty();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.lang.Class<?> wildcardClass1 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long11 = optionalLong1.orElse((long) (short) 10);
        long long12 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong1.orElseGet(longSupplier13);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        long long7 = optionalLong1.orElse(52L);
        java.util.function.LongConsumer longConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long10 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        boolean boolean6 = optionalLong1.isEmpty();
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long13 = optionalLong7.getAsLong();
        java.lang.String str14 = optionalLong7.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.lang.Object obj8 = null;
        boolean boolean9 = optionalLong1.equals(obj8);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        boolean boolean12 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong7.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        java.util.stream.LongStream longStream11 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong7.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long15 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong1.orElseGet(longSupplier16);
        java.lang.String str18 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[0]" + "'", str18, "OptionalLong[0]");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        long long21 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong23.orElseGet(longSupplier24);
        java.util.stream.LongStream longStream26 = optionalLong23.stream();
        java.util.stream.LongStream longStream27 = optionalLong23.stream();
        long long28 = optionalLong23.orElseThrow();
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((long) 0);
        long long31 = optionalLong30.orElseThrow();
        long long32 = optionalLong30.orElseThrow();
        long long33 = optionalLong30.orElseThrow();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        boolean boolean35 = optionalLong23.equals((java.lang.Object) longStream34);
        boolean boolean36 = optionalLong23.isPresent();
        boolean boolean37 = optionalLong1.equals((java.lang.Object) optionalLong23);
        long long39 = optionalLong23.orElse(1L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long11 = optionalLong1.orElseThrow();
        long long12 = optionalLong1.orElseThrow();
        boolean boolean13 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream12);
        long long14 = optionalLong1.getAsLong();
        long long15 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(100L);
        boolean boolean2 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        long long9 = optionalLong1.orElse(35L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.getAsLong();
        boolean boolean11 = optionalLong8.equals((java.lang.Object) (-1));
        java.lang.String str12 = optionalLong8.toString();
        boolean boolean13 = optionalLong8.isPresent();
        boolean boolean15 = optionalLong8.equals((java.lang.Object) (byte) 10);
        boolean boolean16 = optionalLong1.equals((java.lang.Object) boolean15);
        boolean boolean17 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.function.LongConsumer longConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.lang.String str6 = optionalLong1.toString();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long5 = optionalLong1.orElse((-1L));
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        java.util.stream.LongStream longStream7 = optionalLong5.stream();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) (short) 1);
        boolean boolean10 = optionalLong5.isEmpty();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.orElseThrow();
        long long14 = optionalLong12.orElseThrow();
        long long15 = optionalLong12.orElseThrow();
        boolean boolean16 = optionalLong5.equals((java.lang.Object) long15);
        boolean boolean17 = optionalLong1.equals((java.lang.Object) boolean16);
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream20 = optionalLong19.stream();
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong19.orElseGet(longSupplier21);
        boolean boolean23 = optionalLong19.isPresent();
        boolean boolean24 = optionalLong1.equals((java.lang.Object) boolean23);
        boolean boolean25 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) 97L);
        long long13 = optionalLong1.orElse((long) (byte) -1);
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream15 = optionalLong14.stream();
        long long17 = optionalLong14.orElse((long) 1);
        boolean boolean18 = optionalLong14.isEmpty();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) (short) 1);
        long long10 = optionalLong0.orElse((long) (byte) -1);
        java.util.function.LongConsumer longConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong0.ifPresentOrElse(longConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        long long11 = optionalLong1.orElseThrow();
        boolean boolean12 = optionalLong1.isPresent();
        long long13 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier14 = null;
        long long15 = optionalLong1.orElseGet(longSupplier14);
        java.lang.Class<?> wildcardClass16 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        java.lang.String str2 = optionalLong1.toString();
        long long4 = optionalLong1.orElse((long) (byte) 1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[10]" + "'", str2, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        java.util.function.LongConsumer longConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        long long13 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream14 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        long long7 = optionalLong1.orElse((long) (-1));
        long long8 = optionalLong1.orElseThrow();
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        boolean boolean14 = optionalLong7.equals((java.lang.Object) (short) 1);
        long long16 = optionalLong7.orElse((long) (byte) 10);
        boolean boolean17 = optionalLong7.isEmpty();
        long long18 = optionalLong7.orElseThrow();
        long long19 = optionalLong7.orElseThrow();
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong7.orElseGet(longSupplier20);
        java.util.function.LongSupplier longSupplier22 = null;
        long long23 = optionalLong7.orElseGet(longSupplier22);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean10 = optionalLong1.isPresent();
        boolean boolean11 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.lang.String str17 = optionalLong1.toString();
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 'a');
        long long20 = optionalLong19.getAsLong();
        long long21 = optionalLong19.getAsLong();
        boolean boolean22 = optionalLong1.equals((java.lang.Object) optionalLong19);
        java.util.function.LongConsumer longConsumer23 = null;
        java.lang.Runnable runnable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer23, runnable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        java.util.stream.LongStream longStream12 = optionalLong9.stream();
        long long13 = optionalLong9.orElseThrow();
        boolean boolean14 = optionalLong1.equals((java.lang.Object) long13);
        java.lang.String str15 = optionalLong1.toString();
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[0]" + "'", str15, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse(0L);
        java.util.function.LongConsumer longConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        boolean boolean7 = optionalLong1.isPresent();
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long10 = optionalLong1.orElseThrow();
        boolean boolean11 = optionalLong1.isEmpty();
        boolean boolean12 = optionalLong1.isPresent();
        boolean boolean13 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        long long6 = optionalLong3.orElse((long) 1);
        java.lang.String str7 = optionalLong3.toString();
        boolean boolean8 = optionalLong0.equals((java.lang.Object) str7);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong.empty" + "'", str7, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        long long3 = optionalLong0.orElse((long) 1);
        java.lang.String str4 = optionalLong0.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 0);
        java.lang.String str7 = optionalLong6.toString();
        java.lang.String str8 = optionalLong6.toString();
        long long10 = optionalLong6.orElse((-1L));
        long long12 = optionalLong6.orElse(100L);
        boolean boolean13 = optionalLong6.isPresent();
        java.util.function.LongSupplier longSupplier14 = null;
        long long15 = optionalLong6.orElseGet(longSupplier14);
        boolean boolean16 = optionalLong0.equals((java.lang.Object) longSupplier14);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong.empty" + "'", str4, "OptionalLong.empty");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        long long7 = optionalLong1.orElse(52L);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream9 = optionalLong8.stream();
        long long11 = optionalLong8.orElse((long) '4');
        boolean boolean12 = optionalLong1.equals((java.lang.Object) '4');
        long long13 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        long long5 = optionalLong0.orElse((long) (byte) 1);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong7.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        java.util.stream.LongStream longStream11 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong7.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong7);
        boolean boolean15 = optionalLong1.isEmpty();
        boolean boolean16 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream13 = optionalLong12.stream();
        java.util.function.LongSupplier longSupplier14 = null;
        long long15 = optionalLong12.orElseGet(longSupplier14);
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong12.orElseGet(longSupplier16);
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        long long20 = optionalLong19.orElseThrow();
        long long21 = optionalLong19.orElseThrow();
        long long22 = optionalLong19.orElseThrow();
        java.util.stream.LongStream longStream23 = optionalLong19.stream();
        boolean boolean24 = optionalLong12.equals((java.lang.Object) longStream23);
        long long26 = optionalLong12.orElse(1L);
        java.lang.String str27 = optionalLong12.toString();
        java.util.stream.LongStream longStream28 = optionalLong12.stream();
        long long29 = optionalLong12.orElseThrow();
        boolean boolean30 = optionalLong1.equals((java.lang.Object) long29);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalLong[0]" + "'", str27, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        long long11 = optionalLong1.orElseThrow();
        boolean boolean12 = optionalLong1.isPresent();
        boolean boolean13 = optionalLong1.isEmpty();
        long long14 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream12);
        java.util.stream.LongStream longStream14 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        boolean boolean7 = optionalLong5.isEmpty();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream10 = optionalLong5.stream();
        boolean boolean11 = optionalLong5.isEmpty();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong5.orElseGet(longSupplier12);
        java.util.stream.LongStream longStream14 = optionalLong5.stream();
        java.util.stream.LongStream longStream15 = optionalLong5.stream();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) longStream15);
        long long17 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong6);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong6.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        long long12 = optionalLong1.orElse((long) (byte) 0);
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream15 = optionalLong14.stream();
        boolean boolean16 = optionalLong14.isEmpty();
        boolean boolean18 = optionalLong14.equals((java.lang.Object) 0.0f);
        boolean boolean19 = optionalLong1.equals((java.lang.Object) boolean18);
        boolean boolean20 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong9.isPresent();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong9);
        long long14 = optionalLong9.getAsLong();
        boolean boolean15 = optionalLong9.isEmpty();
        java.lang.Class<?> wildcardClass16 = optionalLong9.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        java.lang.String str3 = optionalLong1.toString();
        long long4 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        boolean boolean12 = optionalLong1.isPresent();
        java.lang.String str13 = optionalLong1.toString();
        long long14 = optionalLong1.getAsLong();
        java.lang.Object obj15 = null;
        boolean boolean16 = optionalLong1.equals(obj15);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
        long long11 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong8.stream();
        boolean boolean10 = optionalLong8.isEmpty();
        long long11 = optionalLong8.getAsLong();
        long long12 = optionalLong8.getAsLong();
        boolean boolean13 = optionalLong8.isPresent();
        java.util.stream.LongStream longStream14 = optionalLong8.stream();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong8.orElseGet(longSupplier15);
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean19 = optionalLong8.equals((java.lang.Object) optionalLong18);
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong8);
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong1.orElseGet(longSupplier21);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isEmpty();
        java.lang.String str12 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        long long12 = optionalLong11.getAsLong();
        boolean boolean14 = optionalLong11.equals((java.lang.Object) (-1));
        boolean boolean15 = optionalLong11.isEmpty();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) optionalLong11);
        java.util.function.LongConsumer longConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isPresent();
        long long10 = optionalLong1.orElse((long) (short) 0);
        long long11 = optionalLong1.orElseThrow();
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        long long12 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.equals((java.lang.Object) "OptionalLong[97]");
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        long long6 = optionalLong1.orElseThrow();
        boolean boolean7 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong7.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong7.getClass();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) wildcardClass11);
        long long14 = optionalLong1.orElse((long) (short) -1);
        java.util.OptionalLong optionalLong16 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier17 = null;
        long long18 = optionalLong16.orElseGet(longSupplier17);
        java.util.stream.LongStream longStream19 = optionalLong16.stream();
        boolean boolean20 = optionalLong16.isEmpty();
        boolean boolean21 = optionalLong1.equals((java.lang.Object) optionalLong16);
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream24 = optionalLong23.stream();
        boolean boolean25 = optionalLong23.isEmpty();
        long long26 = optionalLong23.getAsLong();
        boolean boolean27 = optionalLong1.equals((java.lang.Object) optionalLong23);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(optionalLong16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        java.util.stream.LongStream longStream12 = optionalLong9.stream();
        long long13 = optionalLong9.orElseThrow();
        boolean boolean14 = optionalLong1.equals((java.lang.Object) long13);
        java.util.OptionalLong optionalLong16 = java.util.OptionalLong.of((long) 0);
        long long17 = optionalLong16.orElseThrow();
        long long18 = optionalLong16.orElseThrow();
        java.util.stream.LongStream longStream19 = optionalLong16.stream();
        long long20 = optionalLong16.getAsLong();
        java.lang.String str21 = optionalLong16.toString();
        java.util.stream.LongStream longStream22 = optionalLong16.stream();
        boolean boolean23 = optionalLong1.equals((java.lang.Object) optionalLong16);
        java.lang.String str24 = optionalLong16.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionalLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalLong[0]" + "'", str21, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OptionalLong[0]" + "'", str24, "OptionalLong[0]");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        long long6 = optionalLong1.orElse((long) '4');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long6 = optionalLong1.orElse((long) ' ');
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
        long long14 = optionalLong1.orElse((long) (short) -1);
        long long15 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong17 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream18 = optionalLong17.stream();
        boolean boolean19 = optionalLong17.isEmpty();
        long long20 = optionalLong17.getAsLong();
        long long21 = optionalLong17.getAsLong();
        boolean boolean22 = optionalLong17.isPresent();
        java.util.stream.LongStream longStream23 = optionalLong17.stream();
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong17.orElseGet(longSupplier24);
        java.util.OptionalLong optionalLong27 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean28 = optionalLong17.equals((java.lang.Object) optionalLong27);
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier31 = null;
        long long32 = optionalLong30.orElseGet(longSupplier31);
        java.util.stream.LongStream longStream33 = optionalLong30.stream();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        long long35 = optionalLong30.orElseThrow();
        java.util.OptionalLong optionalLong37 = java.util.OptionalLong.of((long) 0);
        long long38 = optionalLong37.orElseThrow();
        long long39 = optionalLong37.orElseThrow();
        long long40 = optionalLong37.orElseThrow();
        java.util.stream.LongStream longStream41 = optionalLong37.stream();
        boolean boolean42 = optionalLong30.equals((java.lang.Object) longStream41);
        boolean boolean43 = optionalLong17.equals((java.lang.Object) longStream41);
        boolean boolean44 = optionalLong1.equals((java.lang.Object) boolean43);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(optionalLong17);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(optionalLong27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong8.stream();
        boolean boolean10 = optionalLong8.isEmpty();
        long long11 = optionalLong8.getAsLong();
        long long12 = optionalLong8.getAsLong();
        boolean boolean13 = optionalLong8.isPresent();
        java.util.stream.LongStream longStream14 = optionalLong8.stream();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong8.orElseGet(longSupplier15);
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean19 = optionalLong8.equals((java.lang.Object) optionalLong18);
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong8);
        boolean boolean21 = optionalLong8.isPresent();
        java.lang.String str22 = optionalLong8.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OptionalLong[0]" + "'", str22, "OptionalLong[0]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong7.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong7.stream();
        java.util.stream.LongStream longStream11 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong7.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long15 = optionalLong1.getAsLong();
        java.lang.String str16 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        boolean boolean6 = optionalLong0.isPresent();
        boolean boolean7 = optionalLong0.isEmpty();
        boolean boolean8 = optionalLong0.isEmpty();
        java.util.function.LongConsumer longConsumer9 = null;
        optionalLong0.ifPresent(longConsumer9);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong10);
        java.lang.Class<?> wildcardClass16 = optionalLong10.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) '#');
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        long long10 = optionalLong1.orElse((long) (short) 0);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        java.lang.String str17 = optionalLong11.toString();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) optionalLong11);
        boolean boolean19 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse(10L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.getAsLong();
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long13 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        long long11 = optionalLong10.getAsLong();
        long long12 = optionalLong10.getAsLong();
        long long14 = optionalLong10.orElse((long) 10);
        java.lang.String str15 = optionalLong10.toString();
        long long16 = optionalLong10.getAsLong();
        java.util.stream.LongStream longStream17 = optionalLong10.stream();
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream20 = optionalLong19.stream();
        boolean boolean21 = optionalLong19.isEmpty();
        boolean boolean23 = optionalLong19.equals((java.lang.Object) 0.0f);
        boolean boolean24 = optionalLong10.equals((java.lang.Object) optionalLong19);
        java.util.stream.LongStream longStream25 = optionalLong10.stream();
        boolean boolean26 = optionalLong10.isPresent();
        boolean boolean27 = optionalLong1.equals((java.lang.Object) optionalLong10);
        long long29 = optionalLong10.orElse((long) (short) -1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[0]" + "'", str15, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long9 = optionalLong1.orElse((long) (byte) 100);
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        long long17 = optionalLong11.orElse((long) (-1));
        long long18 = optionalLong11.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) optionalLong11);
        long long21 = optionalLong1.orElse((long) '#');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) (short) 1);
        java.util.stream.LongStream longStream9 = optionalLong0.stream();
        long long11 = optionalLong0.orElse((long) 10);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        boolean boolean5 = optionalLong3.isEmpty();
        boolean boolean7 = optionalLong3.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream8 = optionalLong3.stream();
        boolean boolean10 = optionalLong3.equals((java.lang.Object) 0);
        boolean boolean11 = optionalLong3.isPresent();
        boolean boolean12 = optionalLong3.isEmpty();
        long long14 = optionalLong3.orElse((long) (short) 0);
        long long15 = optionalLong3.getAsLong();
        long long16 = optionalLong3.orElseThrow();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) long16);
        long long19 = optionalLong1.orElse(35L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '4');
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        long long4 = optionalLong3.getAsLong();
        java.lang.String str5 = optionalLong3.toString();
        java.util.stream.LongStream longStream6 = optionalLong3.stream();
        boolean boolean7 = optionalLong3.isEmpty();
        java.util.stream.LongStream longStream8 = optionalLong3.stream();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) longStream8);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        java.lang.String str9 = optionalLong1.toString();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        java.util.function.LongConsumer longConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong1.orElseGet(longSupplier12);
        boolean boolean14 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream15 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        long long9 = optionalLong1.orElse(0L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong11.orElseGet(longSupplier12);
        java.util.OptionalLong optionalLong15 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong15.orElseGet(longSupplier16);
        boolean boolean18 = optionalLong15.isEmpty();
        long long19 = optionalLong15.getAsLong();
        boolean boolean20 = optionalLong15.isEmpty();
        long long21 = optionalLong15.getAsLong();
        boolean boolean22 = optionalLong11.equals((java.lang.Object) long21);
        boolean boolean23 = optionalLong1.equals((java.lang.Object) long21);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(optionalLong15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong8.stream();
        boolean boolean10 = optionalLong8.isEmpty();
        long long11 = optionalLong8.getAsLong();
        long long12 = optionalLong8.getAsLong();
        boolean boolean13 = optionalLong8.isPresent();
        java.util.stream.LongStream longStream14 = optionalLong8.stream();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong8.orElseGet(longSupplier15);
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean19 = optionalLong8.equals((java.lang.Object) optionalLong18);
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong8);
        java.util.function.LongConsumer longConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isEmpty();
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.lang.String str17 = optionalLong1.toString();
        java.util.stream.LongStream longStream18 = optionalLong1.stream();
        java.util.stream.LongStream longStream19 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass20 = longStream19.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        java.lang.Object obj10 = null;
        boolean boolean11 = optionalLong1.equals(obj10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        java.util.stream.LongStream longStream7 = optionalLong5.stream();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) (short) 1);
        boolean boolean10 = optionalLong5.isEmpty();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.orElseThrow();
        long long14 = optionalLong12.orElseThrow();
        long long15 = optionalLong12.orElseThrow();
        boolean boolean16 = optionalLong5.equals((java.lang.Object) long15);
        boolean boolean17 = optionalLong1.equals((java.lang.Object) boolean16);
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream20 = optionalLong19.stream();
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong19.orElseGet(longSupplier21);
        boolean boolean23 = optionalLong19.isPresent();
        boolean boolean24 = optionalLong1.equals((java.lang.Object) boolean23);
        java.util.stream.LongStream longStream25 = optionalLong1.stream();
        java.lang.String str26 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OptionalLong[10]" + "'", str26, "OptionalLong[10]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isEmpty();
        java.lang.String str10 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[-1]" + "'", str10, "OptionalLong[-1]");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        long long12 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer13, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        long long11 = optionalLong1.orElseThrow();
        boolean boolean12 = optionalLong1.isPresent();
        long long13 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream14 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isEmpty();
        java.lang.String str10 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[-1]" + "'", str10, "OptionalLong[-1]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        long long11 = optionalLong1.orElseThrow();
        boolean boolean12 = optionalLong1.isPresent();
        long long13 = optionalLong1.getAsLong();
        boolean boolean14 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong16 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean17 = optionalLong16.isPresent();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) optionalLong16);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionalLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse(35L);
        long long6 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isEmpty();
        java.lang.String str5 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[10]" + "'", str5, "OptionalLong[10]");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong6.isEmpty();
        boolean boolean10 = optionalLong6.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream11 = optionalLong6.stream();
        boolean boolean13 = optionalLong6.equals((java.lang.Object) 0);
        long long14 = optionalLong6.getAsLong();
        boolean boolean15 = optionalLong6.isEmpty();
        long long16 = optionalLong6.orElseThrow();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) optionalLong6);
        long long18 = optionalLong1.orElseThrow();
        long long19 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        long long13 = optionalLong1.orElse(97L);
        long long14 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        long long8 = optionalLong4.getAsLong();
        boolean boolean9 = optionalLong4.isPresent();
        long long11 = optionalLong4.orElse((long) 0);
        boolean boolean12 = optionalLong4.isEmpty();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) optionalLong4);
        java.lang.String str14 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[-1]" + "'", str2, "OptionalLong[-1]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[-1]" + "'", str14, "OptionalLong[-1]");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        java.util.stream.LongStream longStream12 = optionalLong9.stream();
        long long13 = optionalLong9.orElseThrow();
        boolean boolean14 = optionalLong1.equals((java.lang.Object) long13);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        long long17 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream10 = optionalLong9.stream();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) optionalLong9);
        java.util.function.LongConsumer longConsumer12 = null;
        optionalLong9.ifPresent(longConsumer12);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.getAsLong();
        boolean boolean14 = optionalLong1.equals((java.lang.Object) optionalLong12);
        boolean boolean15 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        boolean boolean6 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long8 = optionalLong1.orElse(32L);
        boolean boolean9 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.lang.String str11 = optionalLong9.toString();
        java.util.stream.LongStream longStream12 = optionalLong9.stream();
        long long13 = optionalLong9.orElseThrow();
        boolean boolean14 = optionalLong1.equals((java.lang.Object) long13);
        java.lang.String str15 = optionalLong1.toString();
        long long17 = optionalLong1.orElse(0L);
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong1.orElseGet(longSupplier18);
        long long21 = optionalLong1.orElse((long) (byte) 1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[0]" + "'", str15, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.String str7 = optionalLong1.toString();
        java.lang.String str8 = optionalLong1.toString();
        boolean boolean9 = optionalLong1.isPresent();
        java.lang.String str10 = optionalLong1.toString();
        long long11 = optionalLong1.getAsLong();
        long long12 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        boolean boolean7 = optionalLong0.isEmpty();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        java.lang.String str10 = optionalLong9.toString();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream13 = optionalLong12.stream();
        boolean boolean14 = optionalLong12.isEmpty();
        long long15 = optionalLong12.getAsLong();
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong12.orElseGet(longSupplier16);
        boolean boolean18 = optionalLong9.equals((java.lang.Object) long17);
        java.util.function.LongSupplier longSupplier19 = null;
        long long20 = optionalLong9.orElseGet(longSupplier19);
        boolean boolean21 = optionalLong9.isPresent();
        boolean boolean22 = optionalLong0.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        long long4 = optionalLong3.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        long long7 = optionalLong3.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong3.stream();
        long long9 = optionalLong3.getAsLong();
        boolean boolean10 = optionalLong3.isPresent();
        boolean boolean11 = optionalLong3.isPresent();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong3);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        long long3 = optionalLong1.orElse(32L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        boolean boolean5 = optionalLong1.isPresent();
        long long6 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean2 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        long long13 = optionalLong1.orElse((long) (short) 1);
        boolean boolean14 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        java.lang.String str17 = optionalLong11.toString();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) optionalLong11);
        long long19 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong1.orElseGet(longSupplier20);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        long long6 = optionalLong1.orElseThrow();
        long long7 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream10 = optionalLong9.stream();
        java.lang.String str11 = optionalLong9.toString();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) str11);
        long long13 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[10]" + "'", str2, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        boolean boolean14 = optionalLong7.equals((java.lang.Object) (short) 1);
        long long16 = optionalLong7.orElse((long) (byte) 10);
        boolean boolean17 = optionalLong7.isEmpty();
        long long18 = optionalLong7.orElseThrow();
        long long19 = optionalLong7.orElseThrow();
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong7.orElseGet(longSupplier20);
        java.util.function.LongConsumer longConsumer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong7.ifPresent(longConsumer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElse((long) (short) 0);
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong6.isEmpty();
        boolean boolean10 = optionalLong6.equals((java.lang.Object) 0.0f);
        long long12 = optionalLong6.orElse((long) (-1));
        boolean boolean13 = optionalLong6.isPresent();
        long long14 = optionalLong6.orElseThrow();
        java.lang.Class<?> wildcardClass15 = optionalLong6.getClass();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) wildcardClass15);
        java.util.function.LongSupplier longSupplier17 = null;
        long long18 = optionalLong1.orElseGet(longSupplier17);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.of((long) 0);
        long long19 = optionalLong18.orElseThrow();
        long long20 = optionalLong18.orElseThrow();
        long long21 = optionalLong18.orElseThrow();
        java.util.stream.LongStream longStream22 = optionalLong18.stream();
        long long24 = optionalLong18.orElse((long) 0);
        java.util.OptionalLong optionalLong26 = java.util.OptionalLong.of((long) 0);
        long long27 = optionalLong26.getAsLong();
        java.lang.String str28 = optionalLong26.toString();
        boolean boolean29 = optionalLong26.isPresent();
        boolean boolean30 = optionalLong18.equals((java.lang.Object) optionalLong26);
        java.util.OptionalLong optionalLong32 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean33 = optionalLong32.isEmpty();
        boolean boolean34 = optionalLong32.isEmpty();
        long long35 = optionalLong32.getAsLong();
        long long36 = optionalLong32.getAsLong();
        boolean boolean37 = optionalLong18.equals((java.lang.Object) optionalLong32);
        boolean boolean39 = optionalLong18.equals((java.lang.Object) (byte) -1);
        boolean boolean40 = optionalLong1.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(optionalLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OptionalLong[0]" + "'", str28, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(optionalLong32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        long long10 = optionalLong1.orElse((long) (byte) -1);
        boolean boolean11 = optionalLong1.isEmpty();
        long long13 = optionalLong1.orElse(0L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.getAsLong();
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 'a');
        boolean boolean12 = optionalLong11.isEmpty();
        boolean boolean13 = optionalLong11.isPresent();
        java.util.stream.LongStream longStream14 = optionalLong11.stream();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong11.orElseGet(longSupplier15);
        boolean boolean17 = optionalLong11.isEmpty();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) optionalLong11);
        java.util.OptionalLong optionalLong20 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong20.orElseGet(longSupplier21);
        java.util.stream.LongStream longStream23 = optionalLong20.stream();
        java.util.stream.LongStream longStream24 = optionalLong20.stream();
        java.util.function.LongSupplier longSupplier25 = null;
        long long26 = optionalLong20.orElseGet(longSupplier25);
        long long28 = optionalLong20.orElse((long) (byte) -1);
        boolean boolean29 = optionalLong1.equals((java.lang.Object) long28);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionalLong20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.orElseThrow();
        long long12 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.String str7 = optionalLong1.toString();
        java.lang.String str8 = optionalLong1.toString();
        boolean boolean9 = optionalLong1.isPresent();
        java.lang.String str10 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.lang.String str17 = optionalLong1.toString();
        java.util.stream.LongStream longStream18 = optionalLong1.stream();
        long long20 = optionalLong1.orElse((long) 'a');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong10);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        boolean boolean17 = optionalLong1.isPresent();
        long long19 = optionalLong1.orElse((-1L));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        long long10 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        long long12 = optionalLong11.orElseThrow();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        long long15 = optionalLong14.getAsLong();
        boolean boolean16 = optionalLong14.isPresent();
        boolean boolean17 = optionalLong14.isPresent();
        java.lang.String str18 = optionalLong14.toString();
        boolean boolean19 = optionalLong11.equals((java.lang.Object) optionalLong14);
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong14.orElseGet(longSupplier20);
        boolean boolean22 = optionalLong1.equals((java.lang.Object) optionalLong14);
        java.util.function.LongSupplier longSupplier23 = null;
        long long24 = optionalLong14.orElseGet(longSupplier23);
        java.util.function.LongSupplier longSupplier25 = null;
        long long26 = optionalLong14.orElseGet(longSupplier25);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[0]" + "'", str18, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isPresent();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        boolean boolean5 = optionalLong1.isEmpty();
        long long6 = optionalLong1.orElseThrow();
        java.lang.String str7 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        boolean boolean12 = optionalLong1.isEmpty();
        java.lang.String str13 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '#');
        long long3 = optionalLong1.orElse((long) (byte) 1);
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElseThrow();
        long long11 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong13.orElseGet(longSupplier15);
        java.util.function.LongSupplier longSupplier17 = null;
        long long18 = optionalLong13.orElseGet(longSupplier17);
        java.lang.String str19 = optionalLong13.toString();
        boolean boolean20 = optionalLong13.isEmpty();
        boolean boolean21 = optionalLong1.equals((java.lang.Object) boolean20);
        boolean boolean22 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalLong[0]" + "'", str19, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) 1);
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        long long14 = optionalLong1.orElse(1L);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 0);
        long long7 = optionalLong6.getAsLong();
        java.lang.String str8 = optionalLong6.toString();
        java.util.stream.LongStream longStream9 = optionalLong6.stream();
        long long10 = optionalLong6.orElseThrow();
        boolean boolean11 = optionalLong6.isEmpty();
        long long12 = optionalLong6.getAsLong();
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong6.orElseGet(longSupplier13);
        java.util.stream.LongStream longStream15 = optionalLong6.stream();
        boolean boolean16 = optionalLong1.equals((java.lang.Object) optionalLong6);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        long long7 = optionalLong1.orElse(52L);
        long long8 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse(100L);
        long long11 = optionalLong1.orElse((long) (byte) 0);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) (byte) -1);
        long long8 = optionalLong6.orElse((long) 0);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong6.orElseGet(longSupplier9);
        boolean boolean11 = optionalLong1.equals((java.lang.Object) longSupplier9);
        java.lang.String str12 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        long long14 = optionalLong11.getAsLong();
        long long15 = optionalLong11.getAsLong();
        boolean boolean16 = optionalLong11.isPresent();
        long long18 = optionalLong11.orElse((long) 0);
        java.lang.Class<?> wildcardClass19 = optionalLong11.getClass();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        long long6 = optionalLong5.orElseThrow();
        long long7 = optionalLong5.orElseThrow();
        long long8 = optionalLong5.orElseThrow();
        boolean boolean9 = optionalLong5.isPresent();
        boolean boolean10 = optionalLong5.isPresent();
        java.lang.String str11 = optionalLong5.toString();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong5);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        long long17 = optionalLong11.orElse((long) (-1));
        long long18 = optionalLong11.orElseThrow();
        boolean boolean19 = optionalLong1.equals((java.lang.Object) optionalLong11);
        boolean boolean20 = optionalLong11.isPresent();
        boolean boolean21 = optionalLong11.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean9 = optionalLong8.isEmpty();
        java.lang.String str10 = optionalLong8.toString();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) str10);
        boolean boolean12 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[10]" + "'", str10, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longStream12);
        boolean boolean14 = optionalLong1.isPresent();
        long long15 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        java.lang.Class<?> wildcardClass10 = optionalLong4.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isEmpty();
        long long7 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong5.orElseGet(longSupplier6);
        java.util.stream.LongStream longStream8 = optionalLong5.stream();
        java.util.stream.LongStream longStream9 = optionalLong5.stream();
        long long10 = optionalLong5.orElseThrow();
        long long12 = optionalLong5.orElse((long) 0);
        boolean boolean13 = optionalLong5.isPresent();
        boolean boolean14 = optionalLong5.isEmpty();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong5);
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong1.orElseGet(longSupplier16);
        long long18 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        java.util.stream.LongStream longStream7 = optionalLong5.stream();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) (short) 1);
        boolean boolean10 = optionalLong5.isEmpty();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.orElseThrow();
        long long14 = optionalLong12.orElseThrow();
        long long15 = optionalLong12.orElseThrow();
        boolean boolean16 = optionalLong5.equals((java.lang.Object) long15);
        boolean boolean17 = optionalLong1.equals((java.lang.Object) boolean16);
        java.util.OptionalLong optionalLong19 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream20 = optionalLong19.stream();
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong19.orElseGet(longSupplier21);
        boolean boolean23 = optionalLong19.isPresent();
        boolean boolean24 = optionalLong1.equals((java.lang.Object) boolean23);
        java.util.function.LongConsumer longConsumer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionalLong19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
        java.lang.String str17 = optionalLong1.toString();
        boolean boolean18 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream19 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        long long21 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong23.orElseGet(longSupplier24);
        java.util.stream.LongStream longStream26 = optionalLong23.stream();
        java.util.stream.LongStream longStream27 = optionalLong23.stream();
        long long28 = optionalLong23.orElseThrow();
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((long) 0);
        long long31 = optionalLong30.orElseThrow();
        long long32 = optionalLong30.orElseThrow();
        long long33 = optionalLong30.orElseThrow();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        boolean boolean35 = optionalLong23.equals((java.lang.Object) longStream34);
        boolean boolean36 = optionalLong23.isPresent();
        boolean boolean37 = optionalLong1.equals((java.lang.Object) optionalLong23);
        long long38 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream39 = optionalLong1.stream();
        long long40 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longStream39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long11 = optionalLong1.orElseThrow();
        long long13 = optionalLong1.orElse((long) (short) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        boolean boolean9 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        boolean boolean9 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream12 = optionalLong7.stream();
        boolean boolean13 = optionalLong7.isEmpty();
        long long14 = optionalLong7.orElseThrow();
        boolean boolean15 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.lang.String str16 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElse(10L);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        long long9 = optionalLong1.orElseThrow();
        java.lang.String str10 = optionalLong1.toString();
        long long11 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean15 = optionalLong13.equals((java.lang.Object) '4');
        java.util.OptionalLong optionalLong17 = java.util.OptionalLong.of((long) 0);
        long long18 = optionalLong17.orElseThrow();
        java.util.stream.LongStream longStream19 = optionalLong17.stream();
        boolean boolean20 = optionalLong13.equals((java.lang.Object) longStream19);
        boolean boolean21 = optionalLong1.equals((java.lang.Object) longStream19);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 0);
        long long9 = optionalLong8.orElseThrow();
        long long10 = optionalLong8.orElseThrow();
        long long11 = optionalLong8.orElseThrow();
        java.util.stream.LongStream longStream12 = optionalLong8.stream();
        long long14 = optionalLong8.orElse((long) 0);
        java.util.OptionalLong optionalLong16 = java.util.OptionalLong.of((long) 0);
        long long17 = optionalLong16.getAsLong();
        java.lang.String str18 = optionalLong16.toString();
        boolean boolean19 = optionalLong16.isPresent();
        boolean boolean20 = optionalLong8.equals((java.lang.Object) optionalLong16);
        java.util.OptionalLong optionalLong22 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean23 = optionalLong22.isEmpty();
        boolean boolean24 = optionalLong22.isEmpty();
        long long25 = optionalLong22.getAsLong();
        long long26 = optionalLong22.getAsLong();
        boolean boolean27 = optionalLong8.equals((java.lang.Object) optionalLong22);
        java.util.OptionalLong optionalLong29 = java.util.OptionalLong.of((long) 0);
        long long30 = optionalLong29.getAsLong();
        long long31 = optionalLong29.getAsLong();
        long long33 = optionalLong29.orElse((long) 10);
        java.lang.String str34 = optionalLong29.toString();
        long long35 = optionalLong29.getAsLong();
        java.util.stream.LongStream longStream36 = optionalLong29.stream();
        boolean boolean37 = optionalLong8.equals((java.lang.Object) longStream36);
        boolean boolean38 = optionalLong1.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(optionalLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[0]" + "'", str18, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(optionalLong22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionalLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "OptionalLong[0]" + "'", str34, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        boolean boolean6 = optionalLong1.isEmpty();
        long long7 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.lang.String str10 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 1);
        long long3 = optionalLong1.orElse((long) (-1));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) '#');
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong7);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        java.util.function.LongConsumer longConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        long long10 = optionalLong1.orElse((long) (-1));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
        long long14 = optionalLong1.orElse((long) (short) -1);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        long long17 = optionalLong1.orElseThrow();
        long long18 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer19 = null;
        java.lang.Runnable runnable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer19, runnable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        java.lang.String str5 = optionalLong0.toString();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong.empty" + "'", str5, "OptionalLong.empty");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream6 = optionalLong5.stream();
        boolean boolean7 = optionalLong5.isEmpty();
        boolean boolean9 = optionalLong5.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream10 = optionalLong5.stream();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream13 = optionalLong12.stream();
        boolean boolean14 = optionalLong12.isEmpty();
        boolean boolean16 = optionalLong12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalLong5.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalLong1.equals((java.lang.Object) boolean17);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalLong11.isEmpty();
        long long18 = optionalLong11.orElse(10L);
        long long19 = optionalLong11.orElseThrow();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        long long21 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong23 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier24 = null;
        long long25 = optionalLong23.orElseGet(longSupplier24);
        java.util.stream.LongStream longStream26 = optionalLong23.stream();
        java.util.stream.LongStream longStream27 = optionalLong23.stream();
        long long28 = optionalLong23.orElseThrow();
        java.util.OptionalLong optionalLong30 = java.util.OptionalLong.of((long) 0);
        long long31 = optionalLong30.orElseThrow();
        long long32 = optionalLong30.orElseThrow();
        long long33 = optionalLong30.orElseThrow();
        java.util.stream.LongStream longStream34 = optionalLong30.stream();
        boolean boolean35 = optionalLong23.equals((java.lang.Object) longStream34);
        boolean boolean36 = optionalLong23.isPresent();
        boolean boolean37 = optionalLong1.equals((java.lang.Object) optionalLong23);
        java.util.stream.LongStream longStream38 = optionalLong23.stream();
        boolean boolean39 = optionalLong23.isEmpty();
        java.lang.String str40 = optionalLong23.toString();
        boolean boolean41 = optionalLong23.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(optionalLong23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "OptionalLong[-1]" + "'", str40, "OptionalLong[-1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isPresent();
        long long10 = optionalLong1.orElse((long) (short) 0);
        long long11 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((-1L));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean3 = optionalLong1.equals((java.lang.Object) '4');
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        long long6 = optionalLong5.orElseThrow();
        java.util.stream.LongStream longStream7 = optionalLong5.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) longStream7);
        long long9 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        boolean boolean2 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long6 = optionalLong1.orElse((long) (short) 10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream16 = optionalLong11.stream();
        boolean boolean18 = optionalLong11.equals((java.lang.Object) 0);
        boolean boolean19 = optionalLong11.isPresent();
        boolean boolean20 = optionalLong11.isEmpty();
        long long22 = optionalLong11.orElse((long) (short) 0);
        long long24 = optionalLong11.orElse((long) (short) -1);
        boolean boolean25 = optionalLong1.equals((java.lang.Object) (short) -1);
        java.util.function.LongConsumer longConsumer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) (short) -1);
        java.lang.String str9 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[10]" + "'", str9, "OptionalLong[10]");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
        long long14 = optionalLong1.orElse((long) (short) -1);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        long long17 = optionalLong1.orElseThrow();
        long long18 = optionalLong1.getAsLong();
        long long20 = optionalLong1.orElse((long) 0);
        java.util.stream.LongStream longStream21 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(longStream21);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        boolean boolean9 = optionalLong1.isEmpty();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        boolean boolean15 = optionalLong13.isEmpty();
        boolean boolean17 = optionalLong13.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream18 = optionalLong13.stream();
        boolean boolean20 = optionalLong13.equals((java.lang.Object) 0);
        long long21 = optionalLong13.getAsLong();
        boolean boolean22 = optionalLong13.isEmpty();
        java.lang.String str23 = optionalLong13.toString();
        java.util.OptionalLong optionalLong25 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream26 = optionalLong25.stream();
        java.util.function.LongSupplier longSupplier27 = null;
        long long28 = optionalLong25.orElseGet(longSupplier27);
        java.util.function.LongSupplier longSupplier29 = null;
        long long30 = optionalLong25.orElseGet(longSupplier29);
        java.util.OptionalLong optionalLong32 = java.util.OptionalLong.of((long) 0);
        long long33 = optionalLong32.orElseThrow();
        long long34 = optionalLong32.orElseThrow();
        long long35 = optionalLong32.orElseThrow();
        java.util.stream.LongStream longStream36 = optionalLong32.stream();
        boolean boolean37 = optionalLong25.equals((java.lang.Object) longStream36);
        boolean boolean38 = optionalLong13.equals((java.lang.Object) longStream36);
        boolean boolean39 = optionalLong1.equals((java.lang.Object) boolean38);
        java.lang.String str40 = optionalLong1.toString();
        long long41 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalLong[0]" + "'", str23, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong25);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(optionalLong32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "OptionalLong[0]" + "'", str40, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(100L);
        boolean boolean2 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long8 = optionalLong1.orElseThrow();
        boolean boolean9 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean2 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        boolean boolean6 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }
}

