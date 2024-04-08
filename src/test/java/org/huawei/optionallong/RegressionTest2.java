package org.huawei.optionallong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        long long15 = optionalLong9.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.util.OptionalLong optionalLong17 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong17.orElseGet(longSupplier18);
        long long21 = optionalLong17.orElse((long) '#');
        boolean boolean22 = optionalLong1.equals((java.lang.Object) long21);
        boolean boolean23 = optionalLong1.isEmpty();
        java.lang.String str24 = optionalLong1.toString();
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
        org.junit.Assert.assertNotNull(optionalLong17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OptionalLong[1]" + "'", str24, "OptionalLong[1]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long12 = optionalLong1.orElse(35L);
        long long14 = optionalLong1.orElse((long) (short) 100);
        java.lang.Class<?> wildcardClass15 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.equals((java.lang.Object) "hi!");
        boolean boolean8 = optionalLong1.isEmpty();
        long long10 = optionalLong1.orElse(10L);
        long long12 = optionalLong1.orElse((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        boolean boolean9 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        boolean boolean9 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long7 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Object obj24 = null;
        boolean boolean25 = optionalLong16.equals(obj24);
        java.util.function.LongSupplier longSupplier26 = null;
        long long27 = optionalLong16.orElseGet(longSupplier26);
        long long28 = optionalLong16.getAsLong();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        java.lang.Class<?> wildcardClass12 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass8 = longStream7.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        long long11 = optionalLong1.orElse((long) '4');
        long long12 = optionalLong1.orElseThrow();
        boolean boolean13 = optionalLong1.isPresent();
        long long14 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        long long14 = optionalLong1.orElse((long) '4');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long10 = optionalLong1.orElseThrow();
        long long11 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass12 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        java.lang.String str9 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass13 = longStream12.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        java.util.stream.LongStream longStream5 = optionalLong0.stream();
        long long7 = optionalLong0.orElse((long) '#');
        java.lang.String str8 = optionalLong0.toString();
        long long10 = optionalLong0.orElse(0L);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong.empty" + "'", str8, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.util.stream.LongStream longStream16 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        long long21 = optionalLong7.orElse((long) '#');
        long long22 = optionalLong7.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.orElseThrow();
        boolean boolean12 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong1.orElseGet(longSupplier13);
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) -1);
        boolean boolean3 = optionalLong1.equals((java.lang.Object) '4');
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        long long6 = optionalLong5.orElseThrow();
        java.util.stream.LongStream longStream7 = optionalLong5.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) longStream7);
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isPresent();
        java.lang.String str6 = optionalLong0.toString();
        java.lang.Class<?> wildcardClass7 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(35L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isPresent();
        long long3 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.empty();
        boolean boolean6 = optionalLong4.equals((java.lang.Object) '#');
        java.lang.String str7 = optionalLong4.toString();
        long long9 = optionalLong4.orElse((long) (short) 1);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        long long12 = optionalLong1.orElse((long) '#');
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong.empty" + "'", str7, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        long long12 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '#');
        long long3 = optionalLong1.orElse((long) (byte) 1);
        boolean boolean4 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.String str21 = optionalLong15.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalLong[10]" + "'", str21, "OptionalLong[10]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.lang.String str5 = optionalLong1.toString();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        boolean boolean18 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong20 = java.util.OptionalLong.of((long) 0);
        java.lang.String str21 = optionalLong20.toString();
        java.util.stream.LongStream longStream22 = optionalLong20.stream();
        long long24 = optionalLong20.orElse((long) 0);
        java.util.OptionalLong optionalLong26 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier27 = null;
        long long28 = optionalLong26.orElseGet(longSupplier27);
        java.util.stream.LongStream longStream29 = optionalLong26.stream();
        java.util.stream.LongStream longStream30 = optionalLong26.stream();
        java.util.function.LongSupplier longSupplier31 = null;
        long long32 = optionalLong26.orElseGet(longSupplier31);
        boolean boolean33 = optionalLong20.equals((java.lang.Object) optionalLong26);
        long long34 = optionalLong20.getAsLong();
        boolean boolean35 = optionalLong1.equals((java.lang.Object) optionalLong20);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(optionalLong20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalLong[0]" + "'", str21, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(optionalLong26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(longStream30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        java.lang.String str9 = optionalLong1.toString();
        boolean boolean10 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        long long11 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        long long8 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.lang.String str16 = optionalLong1.toString();
        java.lang.String str17 = optionalLong1.toString();
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer19 = null;
        optionalLong18.ifPresent(longConsumer19);
        java.util.stream.LongStream longStream21 = optionalLong18.stream();
        boolean boolean22 = optionalLong18.isEmpty();
        boolean boolean24 = optionalLong18.equals((java.lang.Object) "OptionalLong[-1]");
        boolean boolean25 = optionalLong1.equals((java.lang.Object) "OptionalLong[-1]");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalLong[0]" + "'", str17, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long10 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.util.function.LongConsumer longConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong14.orElseGet(longSupplier15);
        java.util.stream.LongStream longStream17 = optionalLong14.stream();
        java.util.stream.LongStream longStream18 = optionalLong14.stream();
        long long19 = optionalLong14.orElseThrow();
        java.util.OptionalLong optionalLong21 = java.util.OptionalLong.of((long) 0);
        long long22 = optionalLong21.orElseThrow();
        long long23 = optionalLong21.orElseThrow();
        long long24 = optionalLong21.orElseThrow();
        java.util.stream.LongStream longStream25 = optionalLong21.stream();
        boolean boolean26 = optionalLong14.equals((java.lang.Object) longStream25);
        boolean boolean27 = optionalLong1.equals((java.lang.Object) longStream25);
        long long28 = optionalLong1.orElseThrow();
        long long30 = optionalLong1.orElse((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(optionalLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        long long7 = optionalLong0.orElse((long) '#');
        java.lang.String str8 = optionalLong0.toString();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong.empty" + "'", str8, "OptionalLong.empty");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) 0);
        java.lang.String str9 = optionalLong0.toString();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong.empty" + "'", str9, "OptionalLong.empty");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long6 = optionalLong1.orElse(97L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        boolean boolean11 = optionalLong1.isPresent();
        long long12 = optionalLong1.orElseThrow();
        long long13 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        long long10 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.getAsLong();
        boolean boolean15 = optionalLong12.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier16 = null;
        long long17 = optionalLong12.orElseGet(longSupplier16);
        long long18 = optionalLong12.orElseThrow();
        java.util.stream.LongStream longStream19 = optionalLong12.stream();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) longStream19);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        long long18 = optionalLong1.getAsLong();
        java.lang.String str19 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalLong[0]" + "'", str19, "OptionalLong[0]");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long11 = optionalLong1.orElse(1L);
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long4 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        java.util.function.LongSupplier longSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.orElseGet(longSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        java.lang.String str8 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        boolean boolean21 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        long long9 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        long long12 = optionalLong11.getAsLong();
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong11.orElseGet(longSupplier13);
        long long15 = optionalLong11.getAsLong();
        java.util.stream.LongStream longStream16 = optionalLong11.stream();
        long long17 = optionalLong11.getAsLong();
        java.util.stream.LongStream longStream18 = optionalLong11.stream();
        boolean boolean19 = optionalLong11.isEmpty();
        long long20 = optionalLong11.getAsLong();
        boolean boolean21 = optionalLong1.equals((java.lang.Object) optionalLong11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.util.function.LongConsumer longConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer16);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.util.stream.LongStream longStream21 = optionalLong8.stream();
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
        org.junit.Assert.assertNotNull(longStream21);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        boolean boolean6 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.util.function.LongSupplier longSupplier14 = null;
        long long15 = optionalLong1.orElseGet(longSupplier14);
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
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer14, runnable15);
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        long long14 = optionalLong1.orElseThrow();
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        long long11 = optionalLong1.orElse(32L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        boolean boolean5 = optionalLong1.isEmpty();
        long long6 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        long long6 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.lang.String str11 = optionalLong1.toString();
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        boolean boolean20 = optionalLong1.isEmpty();
        long long21 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        long long18 = optionalLong7.getAsLong();
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
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        long long16 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        long long4 = optionalLong0.orElse((long) (byte) 10);
        java.util.stream.LongStream longStream5 = optionalLong0.stream();
        long long7 = optionalLong0.orElse((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        long long7 = optionalLong1.orElse((long) (short) 1);
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean10 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        java.lang.String str12 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 0);
        long long7 = optionalLong6.getAsLong();
        long long8 = optionalLong6.getAsLong();
        java.util.stream.LongStream longStream9 = optionalLong6.stream();
        java.util.stream.LongStream longStream10 = optionalLong6.stream();
        boolean boolean11 = optionalLong1.equals((java.lang.Object) longStream10);
        boolean boolean12 = optionalLong1.isPresent();
        long long13 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long4 = optionalLong1.getAsLong();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        long long9 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream12 = optionalLong11.stream();
        boolean boolean13 = optionalLong11.isEmpty();
        boolean boolean15 = optionalLong11.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream16 = optionalLong11.stream();
        boolean boolean17 = optionalLong11.isEmpty();
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong11.orElseGet(longSupplier18);
        java.util.stream.LongStream longStream20 = optionalLong11.stream();
        java.util.stream.LongStream longStream21 = optionalLong11.stream();
        boolean boolean22 = optionalLong1.equals((java.lang.Object) optionalLong11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        long long40 = optionalLong23.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.String str5 = optionalLong1.toString();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean10 = optionalLong9.isEmpty();
        boolean boolean11 = optionalLong9.isEmpty();
        long long12 = optionalLong9.getAsLong();
        long long14 = optionalLong9.orElse((long) (byte) -1);
        java.util.stream.LongStream longStream15 = optionalLong9.stream();
        long long17 = optionalLong9.orElse((long) (byte) 100);
        boolean boolean18 = optionalLong1.equals((java.lang.Object) long17);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse(100L);
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        long long16 = optionalLong10.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.util.OptionalLong optionalLong17 = java.util.OptionalLong.of((long) (short) 0);
        long long18 = optionalLong17.orElseThrow();
        long long19 = optionalLong17.getAsLong();
        boolean boolean20 = optionalLong1.equals((java.lang.Object) optionalLong17);
        long long21 = optionalLong17.getAsLong();
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
        org.junit.Assert.assertNotNull(optionalLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        boolean boolean11 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(97L);
        long long2 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        long long14 = optionalLong8.orElse((long) (short) 0);
        boolean boolean15 = optionalLong8.isEmpty();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        long long7 = optionalLong1.orElse((long) (-1));
        long long8 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        boolean boolean8 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        long long8 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.lang.String str14 = optionalLong1.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[-1]" + "'", str14, "OptionalLong[-1]");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((long) (short) 10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        java.lang.String str23 = optionalLong1.toString();
        boolean boolean24 = optionalLong1.isPresent();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalLong[0]" + "'", str23, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        long long2 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 1);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }
}

