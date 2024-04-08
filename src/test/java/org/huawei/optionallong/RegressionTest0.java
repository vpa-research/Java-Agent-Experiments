package org.huawei.optionallong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.Class<?> wildcardClass2 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        // The following exception was thrown during execution in test generation
        try {
            long long1 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.util.function.LongSupplier longSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = optionalLong0.orElseGet(longSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass3 = longStream2.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        // The following exception was thrown during execution in test generation
        try {
            long long1 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass6 = longStream5.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongSupplier longSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = optionalLong0.orElseGet(longSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.lang.Class<?> wildcardClass2 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = optionalLong0.orElseGet(longSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.OptionalLong optionalLong2 = java.util.OptionalLong.of((long) 0);
        boolean boolean3 = optionalLong0.equals((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass4 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(optionalLong2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        java.lang.Class<?> wildcardClass2 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.lang.Class<?> wildcardClass13 = optionalLong7.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 100);
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass8 = longStream7.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        long long3 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 100);
        java.lang.Class<?> wildcardClass2 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long5 = optionalLong1.orElse((long) '#');
        boolean boolean6 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean6 = optionalLong1.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.util.function.LongConsumer longConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer11);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '#');
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (short) 0);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '#');
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        long long10 = optionalLong1.orElse((long) (short) -1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long5 = optionalLong1.orElse((long) '#');
        long long7 = optionalLong1.orElse((long) 100);
        java.lang.String str8 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[10]" + "'", str8, "OptionalLong[10]");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.util.function.LongConsumer longConsumer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong11.ifPresent(longConsumer35);
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
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.util.function.LongConsumer longConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong7.ifPresentOrElse(longConsumer15, runnable16);
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
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.lang.Class<?> wildcardClass2 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass7 = longStream6.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.function.LongConsumer longConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong7.ifPresentOrElse(longConsumer13, runnable14);
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
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.util.function.LongConsumer longConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong7.ifPresentOrElse(longConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        long long6 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        java.lang.String str7 = optionalLong1.toString();
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
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
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
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        java.lang.Class<?> wildcardClass23 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
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
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 10);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        long long14 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long5 = optionalLong1.orElse((long) '#');
        long long7 = optionalLong1.orElse((long) 100);
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.util.function.LongConsumer longConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong11.ifPresentOrElse(longConsumer14, runnable15);
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
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        boolean boolean7 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        java.util.function.LongSupplier longSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = optionalLong0.orElseGet(longSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 0);
        java.lang.Class<?> wildcardClass2 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.util.function.LongConsumer longConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer13);
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
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.util.function.LongConsumer longConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.String str14 = optionalLong1.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        long long7 = optionalLong1.orElseThrow();
        boolean boolean8 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
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
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.OptionalLong optionalLong2 = java.util.OptionalLong.of((long) 0);
        boolean boolean3 = optionalLong0.equals((java.lang.Object) 0);
        java.util.function.LongSupplier longSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = optionalLong0.orElseGet(longSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(optionalLong2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        long long6 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        long long14 = optionalLong1.getAsLong();
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        java.util.function.LongConsumer longConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        long long11 = optionalLong1.orElse((long) '4');
        java.lang.Class<?> wildcardClass12 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long11 = optionalLong1.orElse((long) (short) -1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.getAsLong();
        long long6 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((long) 0);
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        long long12 = optionalLong1.orElse((long) (byte) 0);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean4 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 100);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        java.util.function.LongSupplier longSupplier19 = null;
        long long20 = optionalLong11.orElseGet(longSupplier19);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        long long13 = optionalLong1.orElse((long) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        long long10 = optionalLong1.orElse(100L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        java.util.function.LongSupplier longSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = optionalLong0.orElseGet(longSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        long long6 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.lang.String str5 = optionalLong1.toString();
        long long7 = optionalLong1.orElse(1L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        long long4 = optionalLong0.orElse((long) (byte) 10);
        java.util.stream.LongStream longStream5 = optionalLong0.stream();
        java.lang.Class<?> wildcardClass6 = longStream5.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        boolean boolean8 = optionalLong4.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream9 = optionalLong4.stream();
        boolean boolean10 = optionalLong4.isEmpty();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong4.orElseGet(longSupplier11);
        boolean boolean13 = optionalLong1.equals((java.lang.Object) longSupplier11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        long long4 = optionalLong1.orElse((long) (short) -1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        boolean boolean8 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        long long5 = optionalLong1.orElse(100L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        long long12 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass13 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        boolean boolean19 = optionalLong11.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass6 = longStream5.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        java.util.stream.LongStream longStream4 = optionalLong0.stream();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.getAsLong();
        long long7 = optionalLong1.orElse(100L);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
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
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass8 = longStream7.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        long long9 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.String str5 = optionalLong1.toString();
        long long6 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isPresent();
        long long3 = optionalLong1.getAsLong();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.empty();
        boolean boolean6 = optionalLong4.equals((java.lang.Object) '#');
        java.lang.String str7 = optionalLong4.toString();
        long long9 = optionalLong4.orElse((long) (short) 1);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        java.util.function.LongConsumer longConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer11);
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
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 100);
        boolean boolean2 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        boolean boolean8 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long10 = optionalLong1.orElseThrow();
        java.lang.String str11 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.lang.Class<?> wildcardClass19 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) (byte) 10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElse((long) (byte) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        long long2 = optionalLong0.orElse((long) (byte) 10);
        java.lang.Class<?> wildcardClass3 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        long long9 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) 100);
        java.lang.String str13 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isEmpty();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        long long8 = optionalLong7.orElseThrow();
        long long9 = optionalLong7.orElseThrow();
        long long10 = optionalLong7.orElseThrow();
        boolean boolean11 = optionalLong0.equals((java.lang.Object) long10);
        boolean boolean12 = optionalLong0.isEmpty();
        boolean boolean13 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        long long11 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        long long9 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong4.orElseGet(longSupplier10);
        java.util.stream.LongStream longStream12 = optionalLong4.stream();
        java.lang.String str13 = optionalLong4.toString();
        boolean boolean14 = optionalLong0.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        boolean boolean34 = optionalLong20.isEmpty();
        java.util.function.LongConsumer longConsumer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong20.ifPresent(longConsumer35);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        long long5 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong7.orElseGet(longSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalLong7.getClass();
        boolean boolean12 = optionalLong5.equals((java.lang.Object) optionalLong7);
        long long13 = optionalLong5.orElseThrow();
        boolean boolean15 = optionalLong5.equals((java.lang.Object) 97L);
        long long17 = optionalLong5.orElse((long) (byte) -1);
        java.util.function.LongSupplier longSupplier18 = null;
        long long19 = optionalLong5.orElseGet(longSupplier18);
        boolean boolean20 = optionalLong1.equals((java.lang.Object) long19);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        java.util.function.LongConsumer longConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong0.ifPresentOrElse(longConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        boolean boolean9 = optionalLong1.isEmpty();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(1L);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream5 = optionalLong4.stream();
        boolean boolean6 = optionalLong4.isEmpty();
        long long7 = optionalLong4.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong4.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) long9);
        java.util.function.LongConsumer longConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        long long7 = optionalLong1.orElse((long) 100);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass5 = longStream4.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long9 = optionalLong1.orElse((long) 1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        boolean boolean18 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
        java.lang.String str11 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass12 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[0]" + "'", str11, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.util.function.LongConsumer longConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong9.ifPresentOrElse(longConsumer14, runnable15);
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
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 0);
        long long2 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong6);
        boolean boolean9 = optionalLong6.isPresent();
        long long11 = optionalLong6.orElse((long) (byte) 10);
        long long12 = optionalLong6.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        long long6 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[10]" + "'", str3, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        long long7 = optionalLong1.orElse((long) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        boolean boolean10 = optionalLong4.isEmpty();
        java.util.stream.LongStream longStream11 = optionalLong4.stream();
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
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
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
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        java.lang.Object obj4 = null;
        boolean boolean5 = optionalLong0.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream4 = optionalLong3.stream();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong3.orElseGet(longSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalLong3.getClass();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong3);
        java.lang.String str9 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[10]" + "'", str9, "OptionalLong[10]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.function.LongConsumer longConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse((long) 10);
        long long10 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        java.lang.String str8 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.util.stream.LongStream longStream17 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass18 = longStream17.getClass();
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
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass8 = longStream7.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong0.ifPresentOrElse(longConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.util.function.LongSupplier longSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = optionalLong0.orElseGet(longSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass5 = longStream4.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        long long10 = optionalLong1.orElseThrow();
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isPresent();
        java.lang.String str6 = optionalLong0.toString();
        java.util.function.LongConsumer longConsumer7 = null;
        optionalLong0.ifPresent(longConsumer7);
        long long10 = optionalLong0.orElse((long) (byte) 10);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long5 = optionalLong1.orElse((long) '#');
        long long7 = optionalLong1.orElse((long) 100);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        long long7 = optionalLong1.orElse((long) (short) 1);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.lang.Class<?> wildcardClass14 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) 100);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.orElseThrow();
        long long9 = optionalLong1.orElse(97L);
        java.lang.String str10 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long9 = optionalLong1.orElse((long) (short) 1);
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.getAsLong();
        long long9 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong7.orElseGet(longSupplier13);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        long long17 = optionalLong1.orElseThrow();
        long long18 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        boolean boolean6 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean7 = optionalLong4.equals((java.lang.Object) (-1));
        java.lang.String str8 = optionalLong4.toString();
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream11 = optionalLong10.stream();
        boolean boolean12 = optionalLong10.isEmpty();
        boolean boolean14 = optionalLong10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalLong4.equals((java.lang.Object) optionalLong10);
        java.lang.String str16 = optionalLong10.toString();
        long long17 = optionalLong10.getAsLong();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) long17);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[0]" + "'", str16, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        long long9 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.util.function.LongConsumer longConsumer16 = null;
        java.lang.Runnable runnable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer16, runnable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        long long10 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.Class<?> wildcardClass15 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse((long) 0);
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        java.util.function.LongConsumer longConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer18);
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
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
            optionalLong1.ifPresent(longConsumer16);
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.util.function.LongSupplier longSupplier21 = null;
        long long22 = optionalLong17.orElseGet(longSupplier21);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (short) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        boolean boolean4 = optionalLong1.isPresent();
        long long6 = optionalLong1.orElse((long) (-1));
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        boolean boolean10 = optionalLong1.isEmpty();
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
        boolean boolean27 = optionalLong12.isEmpty();
        boolean boolean28 = optionalLong1.equals((java.lang.Object) boolean27);
        java.lang.Class<?> wildcardClass29 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse((long) 0);
        boolean boolean9 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long6 = optionalLong1.orElse((long) ' ');
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long7 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        long long8 = optionalLong1.orElseThrow();
        java.lang.String str9 = optionalLong1.toString();
        long long10 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        boolean boolean16 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        boolean boolean7 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        java.lang.Runnable runnable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer20, runnable21);
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 1);
        long long2 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        long long22 = optionalLong8.orElse(35L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        boolean boolean5 = optionalLong1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of((long) 'a');
        boolean boolean7 = optionalLong6.isEmpty();
        boolean boolean8 = optionalLong6.isPresent();
        java.util.stream.LongStream longStream9 = optionalLong6.stream();
        boolean boolean10 = optionalLong1.equals((java.lang.Object) optionalLong6);
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream13 = optionalLong12.stream();
        boolean boolean14 = optionalLong12.isEmpty();
        boolean boolean16 = optionalLong12.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream17 = optionalLong12.stream();
        boolean boolean19 = optionalLong12.equals((java.lang.Object) 0);
        long long20 = optionalLong12.getAsLong();
        boolean boolean21 = optionalLong12.isEmpty();
        java.lang.String str22 = optionalLong12.toString();
        java.util.OptionalLong optionalLong24 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream25 = optionalLong24.stream();
        java.util.function.LongSupplier longSupplier26 = null;
        long long27 = optionalLong24.orElseGet(longSupplier26);
        java.util.function.LongSupplier longSupplier28 = null;
        long long29 = optionalLong24.orElseGet(longSupplier28);
        java.util.OptionalLong optionalLong31 = java.util.OptionalLong.of((long) 0);
        long long32 = optionalLong31.orElseThrow();
        long long33 = optionalLong31.orElseThrow();
        long long34 = optionalLong31.orElseThrow();
        java.util.stream.LongStream longStream35 = optionalLong31.stream();
        boolean boolean36 = optionalLong24.equals((java.lang.Object) longStream35);
        boolean boolean37 = optionalLong12.equals((java.lang.Object) longStream35);
        boolean boolean38 = optionalLong6.equals((java.lang.Object) boolean37);
        java.util.function.LongConsumer longConsumer39 = null;
        java.lang.Runnable runnable40 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong6.ifPresentOrElse(longConsumer39, runnable40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OptionalLong[0]" + "'", str22, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong24);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(optionalLong31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.orElseThrow();
        java.lang.String str6 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[10]" + "'", str6, "OptionalLong[10]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.util.function.LongConsumer longConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong8.ifPresentOrElse(longConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long7 = optionalLong1.orElseThrow();
        boolean boolean8 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) 0);
        long long6 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        boolean boolean9 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isEmpty();
        boolean boolean5 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long5 = optionalLong1.orElse((-1L));
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        long long6 = optionalLong1.getAsLong();
        long long8 = optionalLong1.orElse((long) ' ');
        java.lang.Class<?> wildcardClass9 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong1.orElseGet(longSupplier11);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        long long5 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.lang.String str13 = optionalLong1.toString();
        java.lang.Class<?> wildcardClass14 = optionalLong1.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.lang.String str6 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        long long8 = optionalLong0.orElse((long) 0);
        boolean boolean9 = optionalLong0.isEmpty();
        boolean boolean10 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.getAsLong();
        long long11 = optionalLong1.orElse((long) '4');
        long long13 = optionalLong1.orElse(0L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.Class<?> wildcardClass12 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        long long12 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        long long15 = optionalLong1.orElse((long) '#');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.Class<?> wildcardClass18 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        long long9 = optionalLong1.orElse((long) (byte) 1);
        long long11 = optionalLong1.orElse((long) 'a');
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.util.OptionalLong optionalLong17 = java.util.OptionalLong.of((long) (short) 0);
        long long18 = optionalLong17.orElseThrow();
        long long20 = optionalLong17.orElse((long) (short) 0);
        boolean boolean21 = optionalLong7.equals((java.lang.Object) long20);
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
        org.junit.Assert.assertNotNull(optionalLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.util.stream.LongStream longStream15 = optionalLong7.stream();
        java.util.stream.LongStream longStream16 = optionalLong7.stream();
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
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        boolean boolean22 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass23 = optionalLong1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong6);
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        long long11 = optionalLong1.orElse((long) (short) -1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        long long8 = optionalLong1.orElse(10L);
        long long9 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.util.function.LongConsumer longConsumer16 = null;
        java.lang.Runnable runnable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer16, runnable17);
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
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        long long20 = optionalLong1.orElse(10L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.util.function.LongConsumer longConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        boolean boolean7 = optionalLong1.isEmpty();
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        boolean boolean23 = optionalLong19.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        java.util.stream.LongStream longStream4 = optionalLong0.stream();
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
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass17 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse((long) 0);
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        long long4 = optionalLong0.orElse((long) (byte) 10);
        java.util.stream.LongStream longStream5 = optionalLong0.stream();
        long long7 = optionalLong0.orElse((long) (byte) 1);
        boolean boolean8 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        java.util.OptionalLong optionalLong3 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean4 = optionalLong3.isEmpty();
        long long5 = optionalLong3.getAsLong();
        java.lang.String str6 = optionalLong3.toString();
        long long7 = optionalLong3.getAsLong();
        java.lang.Class<?> wildcardClass8 = optionalLong3.getClass();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[10]" + "'", str6, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        java.lang.String str7 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[10]" + "'", str7, "OptionalLong[10]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long8 = optionalLong1.orElse(1L);
        java.util.OptionalLong optionalLong10 = java.util.OptionalLong.of((long) 'a');
        boolean boolean11 = optionalLong1.equals((java.lang.Object) optionalLong10);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        boolean boolean14 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        long long11 = optionalLong1.orElse(100L);
        long long12 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) '#');
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong7);
        boolean boolean10 = optionalLong1.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong6);
        boolean boolean9 = optionalLong6.isPresent();
        long long11 = optionalLong6.orElse((long) (byte) 10);
        java.util.function.LongSupplier longSupplier12 = null;
        long long13 = optionalLong6.orElseGet(longSupplier12);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        long long6 = optionalLong1.orElse((long) (byte) -1);
        long long7 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.stream.LongStream longStream4 = optionalLong1.stream();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long6 = optionalLong1.orElseThrow();
        long long8 = optionalLong1.orElse((long) 0);
        long long10 = optionalLong1.orElse(0L);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        boolean boolean13 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        long long3 = optionalLong0.orElse((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        boolean boolean22 = optionalLong1.isEmpty();
        java.util.function.LongConsumer longConsumer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer23);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean2 = optionalLong0.equals((java.lang.Object) '#');
        java.lang.String str3 = optionalLong0.toString();
        long long5 = optionalLong0.orElse((long) (short) 1);
        boolean boolean6 = optionalLong0.isPresent();
        java.util.function.LongConsumer longConsumer7 = null;
        optionalLong0.ifPresent(longConsumer7);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong.empty" + "'", str3, "OptionalLong.empty");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.stream.LongStream longStream13 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.lang.Class<?> wildcardClass3 = optionalLong0.getClass();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass10 = optionalLong1.getClass();
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        java.lang.String str9 = optionalLong1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        java.util.OptionalLong optionalLong11 = java.util.OptionalLong.of((long) 0);
        java.lang.String str12 = optionalLong11.toString();
        boolean boolean13 = optionalLong11.isPresent();
        java.lang.String str14 = optionalLong11.toString();
        java.util.OptionalLong optionalLong16 = java.util.OptionalLong.of((long) 'a');
        boolean boolean17 = optionalLong16.isEmpty();
        boolean boolean18 = optionalLong16.isPresent();
        java.util.stream.LongStream longStream19 = optionalLong16.stream();
        boolean boolean20 = optionalLong11.equals((java.lang.Object) optionalLong16);
        java.util.OptionalLong optionalLong22 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream23 = optionalLong22.stream();
        boolean boolean24 = optionalLong22.isEmpty();
        boolean boolean26 = optionalLong22.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream27 = optionalLong22.stream();
        boolean boolean29 = optionalLong22.equals((java.lang.Object) 0);
        long long30 = optionalLong22.getAsLong();
        boolean boolean31 = optionalLong22.isEmpty();
        java.lang.String str32 = optionalLong22.toString();
        java.util.OptionalLong optionalLong34 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream35 = optionalLong34.stream();
        java.util.function.LongSupplier longSupplier36 = null;
        long long37 = optionalLong34.orElseGet(longSupplier36);
        java.util.function.LongSupplier longSupplier38 = null;
        long long39 = optionalLong34.orElseGet(longSupplier38);
        java.util.OptionalLong optionalLong41 = java.util.OptionalLong.of((long) 0);
        long long42 = optionalLong41.orElseThrow();
        long long43 = optionalLong41.orElseThrow();
        long long44 = optionalLong41.orElseThrow();
        java.util.stream.LongStream longStream45 = optionalLong41.stream();
        boolean boolean46 = optionalLong34.equals((java.lang.Object) longStream45);
        boolean boolean47 = optionalLong22.equals((java.lang.Object) longStream45);
        boolean boolean48 = optionalLong16.equals((java.lang.Object) boolean47);
        boolean boolean49 = optionalLong1.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(optionalLong11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalLong22);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "OptionalLong[0]" + "'", str32, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong34);
        org.junit.Assert.assertNotNull(longStream35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(optionalLong41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        optionalLong0.ifPresent(longConsumer1);
        java.util.stream.LongStream longStream3 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.isPresent();
        boolean boolean6 = optionalLong0.equals((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = optionalLong0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        boolean boolean12 = optionalLong1.isEmpty();
        long long14 = optionalLong1.orElse((long) (short) 1);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        long long17 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass18 = optionalLong1.getClass();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.util.stream.LongStream longStream3 = optionalLong1.stream();
        long long5 = optionalLong1.orElse((long) ' ');
        java.lang.Class<?> wildcardClass6 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        long long8 = optionalLong1.getAsLong();
        long long9 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        long long20 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(optionalLong10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        long long12 = optionalLong1.orElse((long) 100);
        long long13 = optionalLong1.getAsLong();
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
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.util.function.LongSupplier longSupplier41 = null;
        long long42 = optionalLong1.orElseGet(longSupplier41);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        java.lang.String str5 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[97]" + "'", str5, "OptionalLong[97]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.util.function.LongConsumer longConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer14);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.util.OptionalLong optionalLong15 = java.util.OptionalLong.of((long) 'a');
        long long16 = optionalLong15.getAsLong();
        boolean boolean17 = optionalLong15.isEmpty();
        java.lang.String str18 = optionalLong15.toString();
        boolean boolean19 = optionalLong15.isPresent();
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong15.orElseGet(longSupplier20);
        boolean boolean22 = optionalLong15.isEmpty();
        java.lang.String str23 = optionalLong15.toString();
        long long24 = optionalLong15.getAsLong();
        boolean boolean25 = optionalLong1.equals((java.lang.Object) long24);
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
        org.junit.Assert.assertNotNull(optionalLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalLong[97]" + "'", str18, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalLong[97]" + "'", str23, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.String str3 = optionalLong1.toString();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        long long7 = optionalLong1.orElse((long) (byte) 1);
        java.lang.Class<?> wildcardClass8 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        boolean boolean38 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.Class<?> wildcardClass15 = optionalLong7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.util.function.LongSupplier longSupplier34 = null;
        long long35 = optionalLong20.orElseGet(longSupplier34);
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        java.util.function.LongConsumer longConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        boolean boolean2 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        boolean boolean9 = optionalLong1.isPresent();
        boolean boolean10 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream11 = optionalLong1.stream();
        java.util.OptionalLong optionalLong13 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream14 = optionalLong13.stream();
        boolean boolean15 = optionalLong13.isEmpty();
        long long16 = optionalLong13.getAsLong();
        long long17 = optionalLong13.getAsLong();
        boolean boolean18 = optionalLong13.isPresent();
        long long19 = optionalLong13.orElseThrow();
        long long21 = optionalLong13.orElse((long) 10);
        java.lang.Class<?> wildcardClass22 = optionalLong13.getClass();
        boolean boolean23 = optionalLong1.equals((java.lang.Object) optionalLong13);
        long long25 = optionalLong13.orElse((long) (byte) 100);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(optionalLong13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        boolean boolean12 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElseThrow();
        long long6 = optionalLong1.orElseThrow();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        long long8 = optionalLong1.getAsLong();
        boolean boolean9 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.util.stream.LongStream longStream15 = optionalLong7.stream();
        boolean boolean16 = optionalLong7.isEmpty();
        java.util.function.LongConsumer longConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong7.ifPresent(longConsumer17);
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
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        java.util.stream.LongStream longStream10 = optionalLong4.stream();
        java.lang.Class<?> wildcardClass11 = longStream10.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        long long5 = optionalLong1.orElse((long) (short) 100);
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        java.util.OptionalLong optionalLong4 = java.util.OptionalLong.of((long) 0);
        long long5 = optionalLong4.getAsLong();
        boolean boolean6 = optionalLong4.isPresent();
        boolean boolean7 = optionalLong4.isPresent();
        java.lang.String str8 = optionalLong4.toString();
        boolean boolean9 = optionalLong1.equals((java.lang.Object) optionalLong4);
        long long11 = optionalLong4.orElse((long) (byte) 1);
        java.lang.String str12 = optionalLong4.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(optionalLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalLong[0]" + "'", str8, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalLong[0]" + "'", str12, "OptionalLong[0]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        java.util.OptionalLong optionalLong8 = java.util.OptionalLong.of((long) 'a');
        long long9 = optionalLong8.getAsLong();
        boolean boolean10 = optionalLong8.isEmpty();
        java.lang.String str11 = optionalLong8.toString();
        boolean boolean12 = optionalLong8.isPresent();
        java.util.function.LongSupplier longSupplier13 = null;
        long long14 = optionalLong8.orElseGet(longSupplier13);
        boolean boolean15 = optionalLong8.isEmpty();
        java.lang.String str16 = optionalLong8.toString();
        long long17 = optionalLong8.getAsLong();
        boolean boolean18 = optionalLong1.equals((java.lang.Object) long17);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(optionalLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalLong[97]" + "'", str11, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalLong[97]" + "'", str16, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        boolean boolean9 = optionalLong1.isEmpty();
        boolean boolean10 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 'a');
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        boolean boolean8 = optionalLong1.isEmpty();
        java.lang.String str9 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[97]" + "'", str4, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[97]" + "'", str9, "OptionalLong[97]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        long long15 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        java.lang.String str3 = optionalLong1.toString();
        long long4 = optionalLong1.orElseThrow();
        java.lang.Class<?> wildcardClass5 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        java.lang.Object obj4 = null;
        boolean boolean5 = optionalLong0.equals(obj4);
        boolean boolean6 = optionalLong0.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream10 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass11 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        java.util.stream.LongStream longStream12 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        boolean boolean6 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        boolean boolean9 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        long long15 = optionalLong1.orElse((long) (byte) 100);
        boolean boolean16 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        java.lang.String str5 = optionalLong1.toString();
        long long6 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier7 = null;
        long long8 = optionalLong1.orElseGet(longSupplier7);
        java.util.function.LongSupplier longSupplier9 = null;
        long long10 = optionalLong1.orElseGet(longSupplier9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        long long5 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.util.function.LongConsumer longConsumer28 = null;
        java.lang.Runnable runnable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer28, runnable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier10 = null;
        long long11 = optionalLong1.orElseGet(longSupplier10);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        boolean boolean8 = optionalLong1.isPresent();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        long long3 = optionalLong1.getAsLong();
        java.lang.String str4 = optionalLong1.toString();
        java.util.OptionalLong optionalLong6 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream7 = optionalLong6.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) optionalLong6);
        boolean boolean9 = optionalLong6.isPresent();
        long long11 = optionalLong6.orElse((long) (byte) 10);
        java.lang.Class<?> wildcardClass12 = optionalLong6.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertNotNull(optionalLong6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.stream.LongStream longStream1 = optionalLong0.stream();
        java.util.stream.LongStream longStream2 = optionalLong0.stream();
        boolean boolean4 = optionalLong0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = optionalLong0.isPresent();
        java.lang.String str6 = optionalLong0.toString();
        java.util.function.LongSupplier longSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = optionalLong0.orElseGet(longSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongSupplier.getAsLong()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong.empty" + "'", str6, "OptionalLong.empty");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) '4');
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) 0);
        long long6 = optionalLong5.getAsLong();
        long long7 = optionalLong5.getAsLong();
        long long9 = optionalLong5.orElse((long) 10);
        java.lang.String str10 = optionalLong5.toString();
        long long11 = optionalLong5.getAsLong();
        java.util.stream.LongStream longStream12 = optionalLong5.stream();
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream15 = optionalLong14.stream();
        boolean boolean16 = optionalLong14.isEmpty();
        boolean boolean18 = optionalLong14.equals((java.lang.Object) 0.0f);
        boolean boolean19 = optionalLong5.equals((java.lang.Object) optionalLong14);
        java.util.stream.LongStream longStream20 = optionalLong5.stream();
        boolean boolean21 = optionalLong5.isPresent();
        boolean boolean22 = optionalLong1.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalLong[0]" + "'", str10, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalLong1.isEmpty();
        java.lang.String str7 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalLong[0]" + "'", str7, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.util.function.LongConsumer longConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresentOrElse(longConsumer15, runnable16);
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
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.orElseThrow();
        long long5 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        boolean boolean4 = optionalLong1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        long long8 = optionalLong1.getAsLong();
        boolean boolean9 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 0);
        long long2 = optionalLong1.getAsLong();
        java.lang.Class<?> wildcardClass3 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.util.function.LongConsumer longConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong7.ifPresent(longConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        long long2 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElse((long) (short) 0);
        boolean boolean5 = optionalLong1.isEmpty();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        long long10 = optionalLong1.orElse((long) (byte) -1);
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.getAsLong();
        java.lang.String str14 = optionalLong12.toString();
        java.lang.String str15 = optionalLong12.toString();
        boolean boolean16 = optionalLong12.isPresent();
        java.util.OptionalLong optionalLong18 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream19 = optionalLong18.stream();
        java.util.function.LongSupplier longSupplier20 = null;
        long long21 = optionalLong18.orElseGet(longSupplier20);
        java.lang.Class<?> wildcardClass22 = optionalLong18.getClass();
        boolean boolean23 = optionalLong12.equals((java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = optionalLong12.getClass();
        boolean boolean25 = optionalLong1.equals((java.lang.Object) optionalLong12);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalLong[0]" + "'", str15, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(optionalLong18);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.OptionalLong optionalLong5 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong5.orElseGet(longSupplier6);
        boolean boolean8 = optionalLong5.isEmpty();
        long long9 = optionalLong5.getAsLong();
        boolean boolean10 = optionalLong5.isEmpty();
        long long11 = optionalLong5.getAsLong();
        boolean boolean12 = optionalLong1.equals((java.lang.Object) long11);
        java.lang.String str13 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(optionalLong5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalLong[0]" + "'", str13, "OptionalLong[0]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        long long8 = optionalLong1.orElse(10L);
        long long10 = optionalLong1.orElse((long) (byte) -1);
        java.util.OptionalLong optionalLong12 = java.util.OptionalLong.of((long) 0);
        long long13 = optionalLong12.getAsLong();
        java.lang.String str14 = optionalLong12.toString();
        boolean boolean15 = optionalLong12.isPresent();
        java.util.stream.LongStream longStream16 = optionalLong12.stream();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) longStream16);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(optionalLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.util.function.LongSupplier longSupplier14 = null;
        long long15 = optionalLong1.orElseGet(longSupplier14);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        java.util.function.LongSupplier longSupplier14 = null;
        long long15 = optionalLong1.orElseGet(longSupplier14);
        long long16 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        long long7 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        boolean boolean9 = optionalLong1.isEmpty();
        long long11 = optionalLong1.orElse(52L);
        boolean boolean12 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        boolean boolean4 = optionalLong1.isPresent();
        boolean boolean5 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[0]" + "'", str2, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        java.lang.String str2 = optionalLong1.toString();
        boolean boolean3 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalLong[10]" + "'", str2, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        long long2 = optionalLong1.getAsLong();
        long long4 = optionalLong1.orElse(10L);
        java.lang.String str5 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        long long5 = optionalLong1.getAsLong();
        java.lang.String str6 = optionalLong1.toString();
        boolean boolean7 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier8 = null;
        long long9 = optionalLong1.orElseGet(longSupplier8);
        boolean boolean10 = optionalLong1.isPresent();
        boolean boolean11 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) -1);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.orElseThrow();
        long long3 = optionalLong1.orElseThrow();
        long long4 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream5 = optionalLong1.stream();
        long long7 = optionalLong1.orElse(10L);
        long long8 = optionalLong1.getAsLong();
        java.util.stream.LongStream longStream9 = optionalLong1.stream();
        java.lang.Class<?> wildcardClass10 = longStream9.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((-1L));
        java.lang.Class<?> wildcardClass2 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean3 = optionalLong1.isEmpty();
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        boolean boolean6 = optionalLong1.isPresent();
        java.util.stream.LongStream longStream7 = optionalLong1.stream();
        long long8 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        java.lang.String str6 = optionalLong1.toString();
        long long8 = optionalLong1.orElse(1L);
        java.lang.String str9 = optionalLong1.toString();
        long long10 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalLong[0]" + "'", str6, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalLong[0]" + "'", str9, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.lang.Class<?> wildcardClass4 = optionalLong1.getClass();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        boolean boolean16 = optionalLong9.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        java.util.OptionalLong optionalLong7 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream8 = optionalLong7.stream();
        boolean boolean9 = optionalLong7.isEmpty();
        boolean boolean11 = optionalLong7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalLong1.equals((java.lang.Object) optionalLong7);
        java.util.OptionalLong optionalLong14 = java.util.OptionalLong.of((long) 0);
        long long15 = optionalLong14.orElseThrow();
        long long16 = optionalLong14.orElseThrow();
        long long17 = optionalLong14.orElseThrow();
        boolean boolean18 = optionalLong14.isPresent();
        long long19 = optionalLong14.orElseThrow();
        boolean boolean20 = optionalLong14.isPresent();
        boolean boolean21 = optionalLong1.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertNotNull(optionalLong7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionalLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        long long3 = optionalLong1.getAsLong();
        long long5 = optionalLong1.orElse((long) 10);
        long long6 = optionalLong1.getAsLong();
        long long8 = optionalLong1.orElse((long) ' ');
        long long10 = optionalLong1.orElse((long) 0);
        boolean boolean11 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        java.util.stream.LongStream longStream6 = optionalLong1.stream();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) 0);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isEmpty();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(0L);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isPresent();
        java.lang.String str4 = optionalLong1.toString();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[0]" + "'", str4, "OptionalLong[0]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 10);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        java.util.function.LongSupplier longSupplier4 = null;
        long long5 = optionalLong1.orElseGet(longSupplier4);
        java.util.function.LongConsumer longConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalLong1.ifPresent(longConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.LongConsumer.accept(long)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(52L);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        boolean boolean5 = optionalLong1.equals((java.lang.Object) 0.0f);
        long long7 = optionalLong1.orElse((long) (-1));
        long long8 = optionalLong1.orElseThrow();
        boolean boolean9 = optionalLong1.isPresent();
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
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean8 = optionalLong1.equals((java.lang.Object) (byte) 10);
        long long9 = optionalLong1.orElseThrow();
        boolean boolean10 = optionalLong1.isPresent();
        long long11 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        java.util.stream.LongStream longStream2 = optionalLong1.stream();
        boolean boolean3 = optionalLong1.isEmpty();
        long long4 = optionalLong1.getAsLong();
        boolean boolean5 = optionalLong1.isPresent();
        java.util.function.LongSupplier longSupplier6 = null;
        long long7 = optionalLong1.orElseGet(longSupplier6);
        long long8 = optionalLong1.getAsLong();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        java.util.function.LongSupplier longSupplier2 = null;
        long long3 = optionalLong1.orElseGet(longSupplier2);
        long long4 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.getAsLong();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.util.function.LongSupplier longSupplier15 = null;
        long long16 = optionalLong1.orElseGet(longSupplier15);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (byte) 10);
        boolean boolean2 = optionalLong1.isEmpty();
        boolean boolean3 = optionalLong1.isEmpty();
        java.lang.String str4 = optionalLong1.toString();
        java.util.function.LongSupplier longSupplier5 = null;
        long long6 = optionalLong1.orElseGet(longSupplier5);
        long long7 = optionalLong1.orElseThrow();
        java.util.stream.LongStream longStream8 = optionalLong1.stream();
        boolean boolean9 = optionalLong1.isPresent();
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalLong[10]" + "'", str4, "OptionalLong[10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        java.lang.Class<?> wildcardClass19 = optionalLong1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        boolean boolean13 = optionalLong8.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) 0);
        long long2 = optionalLong1.getAsLong();
        boolean boolean4 = optionalLong1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalLong1.toString();
        boolean boolean6 = optionalLong1.isPresent();
        boolean boolean7 = optionalLong1.isPresent();
        java.util.OptionalLong optionalLong9 = java.util.OptionalLong.of((long) 0);
        long long10 = optionalLong9.getAsLong();
        java.util.function.LongSupplier longSupplier11 = null;
        long long12 = optionalLong9.orElseGet(longSupplier11);
        long long13 = optionalLong9.getAsLong();
        java.lang.String str14 = optionalLong9.toString();
        long long15 = optionalLong9.orElseThrow();
        java.lang.Class<?> wildcardClass16 = optionalLong9.getClass();
        boolean boolean17 = optionalLong1.equals((java.lang.Object) optionalLong9);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalLong[0]" + "'", str5, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(optionalLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalLong[0]" + "'", str14, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        boolean boolean14 = optionalLong0.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.Class<?> wildcardClass14 = optionalLong7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

