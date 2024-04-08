package org.huawei.optionalint;

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
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass3 = intStream2.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntConsumer intConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.function.IntConsumer intConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntConsumer intConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        int int2 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.lang.Class<?> wildcardClass6 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntSupplier intSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = optionalInt0.orElseGet(intSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        java.util.function.IntConsumer intConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt10.ifPresent(intConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.function.IntSupplier intSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = optionalInt0.orElseGet(intSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntConsumer intConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        boolean boolean15 = optionalInt6.isPresent();
        boolean boolean16 = optionalInt6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = optionalInt6.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        java.lang.Class<?> wildcardClass7 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        boolean boolean15 = optionalInt6.isPresent();
        boolean boolean16 = optionalInt6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = optionalInt6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt6.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = optionalInt7.getClass();
        boolean boolean9 = optionalInt0.equals((java.lang.Object) optionalInt7);
        boolean boolean10 = optionalInt7.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.lang.Class<?> wildcardClass1 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        java.util.function.IntSupplier intSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = optionalInt0.orElseGet(intSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        int int3 = optionalInt1.orElse(0);
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass8 = intStream7.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        java.util.function.IntSupplier intSupplier26 = null;
        int int27 = optionalInt20.orElseGet(intSupplier26);
        java.util.OptionalInt optionalInt29 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream30 = optionalInt29.stream();
        boolean boolean31 = optionalInt29.isEmpty();
        boolean boolean33 = optionalInt29.equals((java.lang.Object) 0.0f);
        boolean boolean34 = optionalInt29.isEmpty();
        boolean boolean35 = optionalInt29.isEmpty();
        boolean boolean36 = optionalInt20.equals((java.lang.Object) optionalInt29);
        java.lang.Class<?> wildcardClass37 = optionalInt20.getClass();
        boolean boolean38 = optionalInt1.equals((java.lang.Object) optionalInt20);
        int int40 = optionalInt20.orElse((int) '#');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(optionalInt29);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        java.util.function.IntConsumer intConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        int int2 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.lang.String str8 = optionalInt6.toString();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt6.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.function.IntConsumer intConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntSupplier intSupplier2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = optionalInt0.orElseGet(intSupplier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntSupplier intSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = optionalInt6.orElseGet(intSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        int int10 = optionalInt1.orElse((int) '#');
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.function.IntSupplier intSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = optionalInt0.orElseGet(intSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        boolean boolean11 = optionalInt7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalInt7.isEmpty();
        boolean boolean13 = optionalInt7.isEmpty();
        boolean boolean15 = optionalInt7.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream16 = optionalInt7.stream();
        java.lang.String str17 = optionalInt7.toString();
        boolean boolean18 = optionalInt1.equals((java.lang.Object) str17);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[-1]" + "'", str17, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.function.IntConsumer intConsumer1 = null;
        java.lang.Runnable runnable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer1, runnable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = optionalInt6.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.lang.String str8 = optionalInt6.toString();
        java.lang.Class<?> wildcardClass9 = optionalInt6.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.stream.IntStream intStream5 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.util.function.IntConsumer intConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.lang.String str7 = optionalInt1.toString();
        boolean boolean8 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass5 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.lang.String str13 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        java.util.function.IntSupplier intSupplier26 = null;
        int int27 = optionalInt20.orElseGet(intSupplier26);
        java.util.OptionalInt optionalInt29 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream30 = optionalInt29.stream();
        boolean boolean31 = optionalInt29.isEmpty();
        boolean boolean33 = optionalInt29.equals((java.lang.Object) 0.0f);
        boolean boolean34 = optionalInt29.isEmpty();
        boolean boolean35 = optionalInt29.isEmpty();
        boolean boolean36 = optionalInt20.equals((java.lang.Object) optionalInt29);
        java.lang.Class<?> wildcardClass37 = optionalInt20.getClass();
        boolean boolean38 = optionalInt1.equals((java.lang.Object) optionalInt20);
        java.util.stream.IntStream intStream39 = optionalInt20.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(optionalInt29);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intStream39);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.function.IntConsumer intConsumer5 = null;
        optionalInt0.ifPresent(intConsumer5);
        java.util.function.IntSupplier intSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = optionalInt0.orElseGet(intSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.lang.Class<?> wildcardClass2 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        int int6 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        boolean boolean15 = optionalInt6.isPresent();
        java.util.function.IntSupplier intSupplier16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = optionalInt6.orElseGet(intSupplier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        int int8 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElse((int) (byte) 0);
        boolean boolean10 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass10 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        java.util.function.IntSupplier intSupplier26 = null;
        int int27 = optionalInt20.orElseGet(intSupplier26);
        java.util.OptionalInt optionalInt29 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream30 = optionalInt29.stream();
        boolean boolean31 = optionalInt29.isEmpty();
        boolean boolean33 = optionalInt29.equals((java.lang.Object) 0.0f);
        boolean boolean34 = optionalInt29.isEmpty();
        boolean boolean35 = optionalInt29.isEmpty();
        boolean boolean36 = optionalInt20.equals((java.lang.Object) optionalInt29);
        java.lang.Class<?> wildcardClass37 = optionalInt20.getClass();
        boolean boolean38 = optionalInt1.equals((java.lang.Object) optionalInt20);
        java.util.function.IntConsumer intConsumer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(optionalInt29);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        java.lang.Object obj5 = null;
        boolean boolean6 = optionalInt1.equals(obj5);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        boolean boolean8 = optionalInt6.isEmpty();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt6.orElseGet(intSupplier9);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        boolean boolean12 = optionalInt6.equals((java.lang.Object) optionalInt11);
        java.lang.String str13 = optionalInt11.toString();
        boolean boolean14 = optionalInt0.equals((java.lang.Object) optionalInt11);
        java.util.function.IntSupplier intSupplier15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = optionalInt11.orElseGet(intSupplier15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt.empty" + "'", str13, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        java.util.function.IntConsumer intConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt10.ifPresentOrElse(intConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt7.orElseGet(intSupplier8);
        java.util.stream.IntStream intStream10 = optionalInt7.stream();
        boolean boolean11 = optionalInt1.equals((java.lang.Object) intStream10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt6.isPresent();
        java.util.function.IntSupplier intSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = optionalInt6.orElseGet(intSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt10.getAsInt();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt10.orElseGet(intSupplier19);
        java.util.function.IntConsumer intConsumer21 = null;
        java.lang.Runnable runnable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt10.ifPresentOrElse(intConsumer21, runnable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        boolean boolean4 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        boolean boolean2 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.function.IntConsumer intConsumer1 = null;
        optionalInt0.ifPresent(intConsumer1);
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = optionalInt6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.function.IntConsumer intConsumer5 = null;
        optionalInt0.ifPresent(intConsumer5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = optionalInt6.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt1.orElse((int) (byte) 1);
        java.util.function.IntConsumer intConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        boolean boolean15 = optionalInt6.equals((java.lang.Object) 1);
        java.util.function.IntConsumer intConsumer16 = null;
        java.lang.Runnable runnable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt6.ifPresentOrElse(intConsumer16, runnable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        java.lang.Class<?> wildcardClass6 = optionalInt4.getClass();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt4);
        java.lang.Class<?> wildcardClass8 = optionalInt4.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        boolean boolean4 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        boolean boolean6 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.String str3 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        int int7 = optionalInt0.orElse(10);
        boolean boolean9 = optionalInt0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt.empty" + "'", str3, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        boolean boolean11 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        boolean boolean10 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass10 = intStream9.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.lang.String str8 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) optionalInt7);
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt1.orElseGet(intSupplier17);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int4 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.lang.Class<?> wildcardClass2 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        boolean boolean8 = optionalInt6.isEmpty();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt6.orElseGet(intSupplier9);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        boolean boolean12 = optionalInt6.equals((java.lang.Object) optionalInt11);
        java.lang.String str13 = optionalInt11.toString();
        boolean boolean14 = optionalInt0.equals((java.lang.Object) optionalInt11);
        java.lang.String str15 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt.empty" + "'", str13, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt.empty" + "'", str15, "OptionalInt.empty");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str14 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[-1]" + "'", str14, "OptionalInt[-1]");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = optionalInt7.getClass();
        boolean boolean9 = optionalInt0.equals((java.lang.Object) optionalInt7);
        int int11 = optionalInt7.orElse((int) ' ');
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) '4');
        boolean boolean12 = optionalInt1.equals((java.lang.Object) optionalInt11);
        int int13 = optionalInt11.getAsInt();
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream16 = optionalInt15.stream();
        boolean boolean17 = optionalInt15.isEmpty();
        boolean boolean19 = optionalInt15.equals((java.lang.Object) 0.0f);
        boolean boolean20 = optionalInt15.isEmpty();
        boolean boolean21 = optionalInt15.isEmpty();
        java.util.OptionalInt optionalInt23 = java.util.OptionalInt.of(10);
        boolean boolean24 = optionalInt15.equals((java.lang.Object) optionalInt23);
        java.util.stream.IntStream intStream25 = optionalInt23.stream();
        boolean boolean26 = optionalInt11.equals((java.lang.Object) intStream25);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionalInt23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElse((int) 'a');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass5 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        int int10 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass4 = intStream3.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass5 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass9 = intStream8.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        int int5 = optionalInt1.orElse((int) (byte) 0);
        int int7 = optionalInt1.orElse((int) (byte) 1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.function.IntConsumer intConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        int int6 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt10.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream20 = optionalInt19.stream();
        boolean boolean21 = optionalInt19.isEmpty();
        boolean boolean23 = optionalInt19.equals((java.lang.Object) 0.0f);
        boolean boolean24 = optionalInt19.isEmpty();
        boolean boolean25 = optionalInt19.isEmpty();
        boolean boolean26 = optionalInt10.equals((java.lang.Object) optionalInt19);
        int int28 = optionalInt19.orElse((int) (short) 1);
        boolean boolean29 = optionalInt1.equals((java.lang.Object) optionalInt19);
        java.util.function.IntConsumer intConsumer30 = null;
        java.lang.Runnable runnable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer30, runnable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass5 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) (short) 100);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 0);
        java.util.function.IntConsumer intConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        boolean boolean6 = optionalInt0.isPresent();
        boolean boolean7 = optionalInt0.isPresent();
        java.util.function.IntSupplier intSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = optionalInt0.orElseGet(intSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.String str11 = optionalInt1.toString();
        int int12 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass13 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        boolean boolean8 = optionalInt4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt4.orElseGet(intSupplier10);
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream14 = optionalInt13.stream();
        boolean boolean15 = optionalInt13.isEmpty();
        boolean boolean17 = optionalInt13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalInt13.isEmpty();
        boolean boolean19 = optionalInt13.isEmpty();
        boolean boolean20 = optionalInt4.equals((java.lang.Object) optionalInt13);
        int int21 = optionalInt4.orElseThrow();
        java.util.OptionalInt optionalInt23 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream24 = optionalInt23.stream();
        boolean boolean25 = optionalInt23.isEmpty();
        boolean boolean27 = optionalInt23.equals((java.lang.Object) 0.0f);
        boolean boolean28 = optionalInt23.isEmpty();
        java.util.function.IntSupplier intSupplier29 = null;
        int int30 = optionalInt23.orElseGet(intSupplier29);
        java.util.OptionalInt optionalInt32 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream33 = optionalInt32.stream();
        boolean boolean34 = optionalInt32.isEmpty();
        boolean boolean36 = optionalInt32.equals((java.lang.Object) 0.0f);
        boolean boolean37 = optionalInt32.isEmpty();
        boolean boolean38 = optionalInt32.isEmpty();
        boolean boolean39 = optionalInt23.equals((java.lang.Object) optionalInt32);
        java.lang.Class<?> wildcardClass40 = optionalInt23.getClass();
        boolean boolean41 = optionalInt4.equals((java.lang.Object) optionalInt23);
        java.lang.Class<?> wildcardClass42 = optionalInt23.getClass();
        boolean boolean43 = optionalInt1.equals((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(optionalInt23);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(optionalInt32);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        boolean boolean11 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass12 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.function.IntConsumer intConsumer1 = null;
        optionalInt0.ifPresent(intConsumer1);
        java.util.function.IntSupplier intSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = optionalInt0.orElseGet(intSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        int int2 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        int int4 = optionalInt0.orElse((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.lang.Class<?> wildcardClass14 = intStream12.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) '4');
        boolean boolean12 = optionalInt1.equals((java.lang.Object) optionalInt11);
        int int13 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        boolean boolean8 = optionalInt6.isEmpty();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt6.orElseGet(intSupplier9);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        boolean boolean12 = optionalInt6.equals((java.lang.Object) optionalInt11);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt14.orElseGet(intSupplier15);
        java.util.stream.IntStream intStream17 = optionalInt14.stream();
        boolean boolean18 = optionalInt11.equals((java.lang.Object) intStream17);
        java.util.stream.IntStream intStream19 = optionalInt11.stream();
        boolean boolean20 = optionalInt11.isPresent();
        boolean boolean21 = optionalInt11.isPresent();
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt11);
        java.lang.String str23 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalInt[0]" + "'", str23, "OptionalInt[0]");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.String str3 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.stream.IntStream intStream6 = optionalInt0.stream();
        java.lang.Class<?> wildcardClass7 = intStream6.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt.empty" + "'", str3, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((-1));
        java.util.function.IntConsumer intConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) (short) 100);
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        int int8 = optionalInt1.orElse(0);
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        boolean boolean12 = optionalInt1.isPresent();
        boolean boolean13 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream14 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        boolean boolean14 = optionalInt9.isPresent();
        int int15 = optionalInt9.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        java.lang.String str15 = optionalInt6.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = optionalInt6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt.empty" + "'", str15, "OptionalInt.empty");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        java.lang.String str3 = optionalInt1.toString();
        int int5 = optionalInt1.orElse((int) (short) -1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        boolean boolean15 = optionalInt6.isPresent();
        boolean boolean16 = optionalInt6.isEmpty();
        java.util.function.IntConsumer intConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt6.ifPresentOrElse(intConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) '4');
        boolean boolean12 = optionalInt1.equals((java.lang.Object) optionalInt11);
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt11.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        int int4 = optionalInt0.orElse((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt4.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        boolean boolean10 = optionalInt4.equals((java.lang.Object) optionalInt9);
        boolean boolean11 = optionalInt0.equals((java.lang.Object) optionalInt4);
        java.lang.String str12 = optionalInt0.toString();
        java.lang.Class<?> wildcardClass13 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt.empty" + "'", str12, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int10 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        int int13 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.lang.String str13 = optionalInt1.toString();
        int int15 = optionalInt1.orElse((int) (byte) 0);
        int int16 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt4.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        boolean boolean10 = optionalInt4.equals((java.lang.Object) optionalInt9);
        boolean boolean11 = optionalInt0.equals((java.lang.Object) optionalInt4);
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt6.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = optionalInt6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.lang.String str12 = optionalInt1.toString();
        int int13 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        int int16 = optionalInt11.orElseThrow();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt11);
        boolean boolean18 = optionalInt0.isEmpty();
        int int20 = optionalInt0.orElse((int) (byte) 1);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) 'a');
        java.util.OptionalInt optionalInt2 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream3 = optionalInt2.stream();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of((int) (short) -1);
        int int6 = optionalInt5.getAsInt();
        boolean boolean8 = optionalInt5.equals((java.lang.Object) (-1));
        boolean boolean9 = optionalInt2.equals((java.lang.Object) boolean8);
        int int11 = optionalInt2.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream14 = optionalInt13.stream();
        boolean boolean15 = optionalInt13.isEmpty();
        boolean boolean17 = optionalInt13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalInt13.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt13.orElseGet(intSupplier19);
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream23 = optionalInt22.stream();
        boolean boolean24 = optionalInt22.isEmpty();
        boolean boolean26 = optionalInt22.equals((java.lang.Object) 0.0f);
        boolean boolean27 = optionalInt22.isEmpty();
        boolean boolean28 = optionalInt22.isEmpty();
        boolean boolean29 = optionalInt13.equals((java.lang.Object) optionalInt22);
        java.lang.Class<?> wildcardClass30 = optionalInt13.getClass();
        boolean boolean31 = optionalInt2.equals((java.lang.Object) optionalInt13);
        boolean boolean32 = optionalInt1.equals((java.lang.Object) optionalInt13);
        int int34 = optionalInt13.orElse(1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        boolean boolean14 = optionalInt9.isPresent();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt16.orElseGet(intSupplier19);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.empty();
        boolean boolean22 = optionalInt16.equals((java.lang.Object) optionalInt21);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt24.orElseGet(intSupplier25);
        java.util.stream.IntStream intStream27 = optionalInt24.stream();
        boolean boolean28 = optionalInt21.equals((java.lang.Object) intStream27);
        boolean boolean29 = optionalInt9.equals((java.lang.Object) optionalInt21);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = optionalInt21.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        boolean boolean14 = optionalInt1.isEmpty();
        boolean boolean15 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt15.orElseGet(intSupplier16);
        int int19 = optionalInt15.orElse((int) (short) 10);
        java.lang.String str20 = optionalInt15.toString();
        boolean boolean21 = optionalInt15.isPresent();
        int int22 = optionalInt15.orElseThrow();
        int int24 = optionalInt15.orElse((int) (byte) 0);
        boolean boolean25 = optionalInt1.equals((java.lang.Object) int24);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[1]" + "'", str20, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        boolean boolean8 = optionalInt6.isEmpty();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt6.orElseGet(intSupplier9);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        boolean boolean12 = optionalInt6.equals((java.lang.Object) optionalInt11);
        java.lang.String str13 = optionalInt11.toString();
        boolean boolean14 = optionalInt0.equals((java.lang.Object) optionalInt11);
        boolean boolean15 = optionalInt11.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt.empty" + "'", str13, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.lang.Class<?> wildcardClass14 = optionalInt11.getClass();
        boolean boolean15 = optionalInt1.equals((java.lang.Object) optionalInt11);
        boolean boolean16 = optionalInt1.isEmpty();
        int int17 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        java.lang.String str2 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[35]" + "'", str2, "OptionalInt[35]");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of(1);
        boolean boolean5 = optionalInt4.isPresent();
        boolean boolean6 = optionalInt0.equals((java.lang.Object) boolean5);
        java.lang.String str7 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt.empty" + "'", str7, "OptionalInt.empty");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (byte) 1);
        int int6 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of((int) (short) -1);
        int int6 = optionalInt5.getAsInt();
        boolean boolean8 = optionalInt5.equals((java.lang.Object) (-1));
        java.lang.String str9 = optionalInt5.toString();
        java.util.stream.IntStream intStream10 = optionalInt5.stream();
        boolean boolean11 = optionalInt5.isPresent();
        boolean boolean12 = optionalInt5.isEmpty();
        java.lang.Class<?> wildcardClass13 = optionalInt5.getClass();
        boolean boolean14 = optionalInt1.equals((java.lang.Object) optionalInt5);
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt5.orElseGet(intSupplier15);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[-1]" + "'", str9, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt10.getAsInt();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt10.orElseGet(intSupplier19);
        java.lang.Class<?> wildcardClass21 = optionalInt10.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.String str11 = optionalInt1.toString();
        boolean boolean12 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        java.lang.String str14 = optionalInt1.toString();
        java.util.stream.IntStream intStream15 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[-1]" + "'", str14, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.Class<?> wildcardClass3 = intStream2.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        int int10 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.getAsInt();
        int int8 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int8 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        boolean boolean4 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt6.orElseGet(intSupplier7);
        int int10 = optionalInt6.orElse((int) (short) 10);
        java.lang.String str11 = optionalInt6.toString();
        int int12 = optionalInt6.orElseThrow();
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(10);
        boolean boolean15 = optionalInt6.equals((java.lang.Object) optionalInt14);
        int int16 = optionalInt14.getAsInt();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) int16);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[1]" + "'", str11, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        int int7 = optionalInt0.orElse((int) (short) 0);
        java.lang.String str8 = optionalInt0.toString();
        java.lang.Class<?> wildcardClass9 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        java.lang.Object obj5 = null;
        boolean boolean6 = optionalInt1.equals(obj5);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        int int10 = optionalInt1.orElse((int) (short) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int12 = optionalInt9.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        boolean boolean8 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int10 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt1.orElseGet(intSupplier13);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse(1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        boolean boolean3 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass10 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        boolean boolean14 = optionalInt6.isEmpty();
        java.lang.Class<?> wildcardClass15 = optionalInt6.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of((int) (short) -1);
        int int10 = optionalInt9.getAsInt();
        boolean boolean12 = optionalInt9.equals((java.lang.Object) (-1));
        java.lang.String str13 = optionalInt9.toString();
        java.util.stream.IntStream intStream14 = optionalInt9.stream();
        boolean boolean15 = optionalInt9.isPresent();
        int int17 = optionalInt9.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier18 = null;
        int int19 = optionalInt9.orElseGet(intSupplier18);
        boolean boolean20 = optionalInt1.equals((java.lang.Object) intSupplier18);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        boolean boolean6 = optionalInt0.isPresent();
        int int8 = optionalInt0.orElse(0);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.lang.Class<?> wildcardClass16 = optionalInt10.getClass();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt10);
        java.util.function.IntConsumer intConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((-1));
        int int3 = optionalInt1.orElse((int) (byte) 0);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        boolean boolean14 = optionalInt9.isPresent();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt16.orElseGet(intSupplier19);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.empty();
        boolean boolean22 = optionalInt16.equals((java.lang.Object) optionalInt21);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt24.orElseGet(intSupplier25);
        java.util.stream.IntStream intStream27 = optionalInt24.stream();
        boolean boolean28 = optionalInt21.equals((java.lang.Object) intStream27);
        boolean boolean29 = optionalInt9.equals((java.lang.Object) optionalInt21);
        java.util.function.IntConsumer intConsumer30 = null;
        java.lang.Runnable runnable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresentOrElse(intConsumer30, runnable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        boolean boolean13 = optionalInt11.isEmpty();
        boolean boolean15 = optionalInt11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalInt11.isEmpty();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt11.orElseGet(intSupplier17);
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        boolean boolean26 = optionalInt20.isEmpty();
        boolean boolean27 = optionalInt11.equals((java.lang.Object) optionalInt20);
        java.lang.Class<?> wildcardClass28 = optionalInt11.getClass();
        boolean boolean29 = optionalInt0.equals((java.lang.Object) optionalInt11);
        int int30 = optionalInt11.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        int int13 = optionalInt1.orElse(32);
        java.lang.Class<?> wildcardClass14 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.Class<?> wildcardClass13 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        int int3 = optionalInt1.orElse(0);
        boolean boolean4 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean13 = optionalInt10.isPresent();
        int int14 = optionalInt10.getAsInt();
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt10.orElseGet(intSupplier15);
        boolean boolean18 = optionalInt10.equals((java.lang.Object) '#');
        java.lang.String str19 = optionalInt10.toString();
        java.lang.Class<?> wildcardClass20 = optionalInt10.getClass();
        boolean boolean21 = optionalInt1.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        int int16 = optionalInt11.orElseThrow();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt11);
        java.util.stream.IntStream intStream18 = optionalInt0.stream();
        java.lang.String str19 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt.empty" + "'", str19, "OptionalInt.empty");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        int int16 = optionalInt11.orElseThrow();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt11);
        boolean boolean18 = optionalInt0.isEmpty();
        java.util.function.IntConsumer intConsumer19 = null;
        java.lang.Runnable runnable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer19, runnable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        boolean boolean8 = optionalInt6.isEmpty();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt6.orElseGet(intSupplier9);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        boolean boolean12 = optionalInt6.equals((java.lang.Object) optionalInt11);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt14.orElseGet(intSupplier15);
        java.util.stream.IntStream intStream17 = optionalInt14.stream();
        boolean boolean18 = optionalInt11.equals((java.lang.Object) intStream17);
        java.util.stream.IntStream intStream19 = optionalInt11.stream();
        boolean boolean20 = optionalInt11.isPresent();
        boolean boolean21 = optionalInt11.isPresent();
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt11);
        java.util.function.IntConsumer intConsumer23 = null;
        java.lang.Runnable runnable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer23, runnable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntConsumer intConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        java.lang.Class<?> wildcardClass4 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int4 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        boolean boolean13 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.lang.Object obj12 = null;
        boolean boolean13 = optionalInt1.equals(obj12);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        boolean boolean5 = optionalInt1.isEmpty();
        int int7 = optionalInt1.orElse((int) (byte) 0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.lang.String str8 = optionalInt0.toString();
        java.lang.String str9 = optionalInt0.toString();
        int int11 = optionalInt0.orElse(10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(52);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass3 = intStream2.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt3.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of((int) (short) -1);
        int int6 = optionalInt5.getAsInt();
        boolean boolean8 = optionalInt5.equals((java.lang.Object) (-1));
        java.lang.String str9 = optionalInt5.toString();
        java.util.stream.IntStream intStream10 = optionalInt5.stream();
        boolean boolean11 = optionalInt5.isPresent();
        boolean boolean12 = optionalInt5.isEmpty();
        java.lang.Class<?> wildcardClass13 = optionalInt5.getClass();
        boolean boolean14 = optionalInt1.equals((java.lang.Object) optionalInt5);
        java.lang.String str15 = optionalInt5.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[-1]" + "'", str9, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[-1]" + "'", str15, "OptionalInt[-1]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        int int7 = optionalInt6.orElseThrow();
        int int8 = optionalInt6.orElseThrow();
        java.util.stream.IntStream intStream9 = optionalInt6.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) intStream9);
        int int11 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass12 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (byte) 1);
        boolean boolean14 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        java.util.function.IntConsumer intConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of((int) (short) -1);
        int int6 = optionalInt5.getAsInt();
        int int7 = optionalInt5.getAsInt();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) int7);
        java.lang.String str9 = optionalInt1.toString();
        boolean boolean10 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[10]" + "'", str9, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt13.orElseGet(intSupplier14);
        java.util.stream.IntStream intStream16 = optionalInt13.stream();
        java.util.stream.IntStream intStream17 = optionalInt13.stream();
        boolean boolean18 = optionalInt13.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        java.util.function.IntConsumer intConsumer20 = null;
        java.lang.Runnable runnable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer20, runnable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(35);
        int int2 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isEmpty();
        java.lang.String str12 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt1.orElseGet(intSupplier13);
        java.util.function.IntConsumer intConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt9.orElseThrow();
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresent(intConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        boolean boolean15 = optionalInt6.isPresent();
        boolean boolean16 = optionalInt6.isPresent();
        boolean boolean17 = optionalInt6.isPresent();
        boolean boolean18 = optionalInt6.isPresent();
        java.lang.String str19 = optionalInt6.toString();
        java.lang.Class<?> wildcardClass20 = optionalInt6.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt.empty" + "'", str19, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        boolean boolean6 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.function.IntConsumer intConsumer6 = null;
        optionalInt0.ifPresent(intConsumer6);
        boolean boolean8 = optionalInt0.isPresent();
        java.util.function.IntSupplier intSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = optionalInt0.orElseGet(intSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        int int9 = optionalInt1.orElse((int) (byte) 100);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        int int14 = optionalInt13.getAsInt();
        boolean boolean16 = optionalInt13.equals((java.lang.Object) (-1));
        boolean boolean17 = optionalInt10.equals((java.lang.Object) boolean16);
        int int19 = optionalInt10.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream22 = optionalInt21.stream();
        boolean boolean23 = optionalInt21.isEmpty();
        boolean boolean25 = optionalInt21.equals((java.lang.Object) 0.0f);
        boolean boolean26 = optionalInt21.isEmpty();
        java.util.function.IntSupplier intSupplier27 = null;
        int int28 = optionalInt21.orElseGet(intSupplier27);
        java.util.OptionalInt optionalInt30 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream31 = optionalInt30.stream();
        boolean boolean32 = optionalInt30.isEmpty();
        boolean boolean34 = optionalInt30.equals((java.lang.Object) 0.0f);
        boolean boolean35 = optionalInt30.isEmpty();
        boolean boolean36 = optionalInt30.isEmpty();
        boolean boolean37 = optionalInt21.equals((java.lang.Object) optionalInt30);
        java.lang.Class<?> wildcardClass38 = optionalInt21.getClass();
        boolean boolean39 = optionalInt10.equals((java.lang.Object) optionalInt21);
        boolean boolean40 = optionalInt1.equals((java.lang.Object) optionalInt10);
        java.util.OptionalInt optionalInt42 = java.util.OptionalInt.of(0);
        boolean boolean43 = optionalInt10.equals((java.lang.Object) optionalInt42);
        java.util.function.IntConsumer intConsumer44 = null;
        java.lang.Runnable runnable45 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt42.ifPresentOrElse(intConsumer44, runnable45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(optionalInt30);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(optionalInt42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = optionalInt7.getClass();
        boolean boolean9 = optionalInt0.equals((java.lang.Object) optionalInt7);
        java.lang.String str10 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt.empty" + "'", str10, "OptionalInt.empty");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.lang.Class<?> wildcardClass14 = optionalInt11.getClass();
        boolean boolean15 = optionalInt1.equals((java.lang.Object) optionalInt11);
        boolean boolean16 = optionalInt1.isPresent();
        int int17 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt4.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        boolean boolean10 = optionalInt4.equals((java.lang.Object) optionalInt9);
        boolean boolean11 = optionalInt0.equals((java.lang.Object) optionalInt4);
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt4.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        int int4 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[0]" + "'", str3, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        int int6 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.String str11 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass12 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        java.util.stream.IntStream intStream5 = optionalInt3.stream();
        java.util.stream.IntStream intStream6 = optionalInt3.stream();
        int int8 = optionalInt3.orElse(10);
        java.util.function.IntConsumer intConsumer9 = null;
        optionalInt3.ifPresent(intConsumer9);
        boolean boolean11 = optionalInt3.isPresent();
        boolean boolean12 = optionalInt0.equals((java.lang.Object) optionalInt3);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream15 = optionalInt14.stream();
        boolean boolean16 = optionalInt14.isEmpty();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt14.orElseGet(intSupplier17);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.empty();
        boolean boolean20 = optionalInt14.equals((java.lang.Object) optionalInt19);
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier23 = null;
        int int24 = optionalInt22.orElseGet(intSupplier23);
        java.util.stream.IntStream intStream25 = optionalInt22.stream();
        boolean boolean26 = optionalInt19.equals((java.lang.Object) intStream25);
        java.util.stream.IntStream intStream27 = optionalInt19.stream();
        java.lang.String str28 = optionalInt19.toString();
        java.util.function.IntConsumer intConsumer29 = null;
        optionalInt19.ifPresent(intConsumer29);
        boolean boolean31 = optionalInt3.equals((java.lang.Object) optionalInt19);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OptionalInt.empty" + "'", str28, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        int int11 = optionalInt1.orElse((int) ' ');
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt1.orElseGet(intSupplier12);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        int int7 = optionalInt1.getAsInt();
        int int9 = optionalInt1.orElse((int) ' ');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt9.equals(obj11);
        java.util.function.IntConsumer intConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresentOrElse(intConsumer13, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream13 = optionalInt12.stream();
        boolean boolean14 = optionalInt12.isEmpty();
        boolean boolean15 = optionalInt12.isPresent();
        int int16 = optionalInt12.getAsInt();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt12.orElseGet(intSupplier17);
        boolean boolean20 = optionalInt12.equals((java.lang.Object) '#');
        java.lang.String str21 = optionalInt12.toString();
        java.lang.Class<?> wildcardClass22 = optionalInt12.getClass();
        boolean boolean23 = optionalInt1.equals((java.lang.Object) optionalInt12);
        boolean boolean25 = optionalInt12.equals((java.lang.Object) 52);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream13 = optionalInt12.stream();
        boolean boolean14 = optionalInt12.isEmpty();
        boolean boolean16 = optionalInt12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalInt12.isEmpty();
        java.util.function.IntSupplier intSupplier18 = null;
        int int19 = optionalInt12.orElseGet(intSupplier18);
        boolean boolean20 = optionalInt12.isPresent();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) '4');
        boolean boolean23 = optionalInt12.equals((java.lang.Object) optionalInt22);
        boolean boolean24 = optionalInt1.equals((java.lang.Object) boolean23);
        java.util.function.IntConsumer intConsumer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        boolean boolean2 = optionalInt1.isPresent();
        boolean boolean3 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        int int3 = optionalInt0.orElse((int) '4');
        java.lang.Class<?> wildcardClass4 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(32);
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = optionalInt7.getClass();
        boolean boolean9 = optionalInt0.equals((java.lang.Object) optionalInt7);
        boolean boolean10 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        int int8 = optionalInt7.getAsInt();
        boolean boolean10 = optionalInt7.equals((java.lang.Object) (-1));
        java.lang.String str11 = optionalInt7.toString();
        int int12 = optionalInt7.getAsInt();
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt7.orElseGet(intSupplier13);
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt7.orElseGet(intSupplier15);
        java.util.stream.IntStream intStream17 = optionalInt7.stream();
        boolean boolean18 = optionalInt1.equals((java.lang.Object) optionalInt7);
        boolean boolean19 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        int int9 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        int int12 = optionalInt11.getAsInt();
        int int13 = optionalInt11.orElseThrow();
        int int14 = optionalInt11.getAsInt();
        java.lang.String str15 = optionalInt11.toString();
        boolean boolean16 = optionalInt1.equals((java.lang.Object) optionalInt11);
        int int18 = optionalInt11.orElse((-1));
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[0]" + "'", str15, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt1.orElseGet(intSupplier15);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(10);
        java.lang.String str8 = optionalInt7.toString();
        java.util.stream.IntStream intStream9 = optionalInt7.stream();
        boolean boolean10 = optionalInt0.equals((java.lang.Object) optionalInt7);
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt7.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[10]" + "'", str8, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        boolean boolean18 = optionalInt1.isEmpty();
        int int19 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) optionalInt7);
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt18.orElseGet(intSupplier19);
        int int22 = optionalInt18.orElse(0);
        int int24 = optionalInt18.orElse(1);
        java.util.stream.IntStream intStream25 = optionalInt18.stream();
        boolean boolean26 = optionalInt18.isPresent();
        java.util.function.IntSupplier intSupplier27 = null;
        int int28 = optionalInt18.orElseGet(intSupplier27);
        boolean boolean29 = optionalInt7.equals((java.lang.Object) int28);
        java.util.OptionalInt optionalInt31 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream32 = optionalInt31.stream();
        boolean boolean33 = optionalInt31.isEmpty();
        int int34 = optionalInt31.getAsInt();
        boolean boolean35 = optionalInt31.isEmpty();
        boolean boolean36 = optionalInt31.isEmpty();
        boolean boolean37 = optionalInt31.isPresent();
        boolean boolean38 = optionalInt7.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalInt31);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (short) -1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt4.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        boolean boolean10 = optionalInt4.equals((java.lang.Object) optionalInt9);
        boolean boolean11 = optionalInt0.equals((java.lang.Object) optionalInt4);
        boolean boolean12 = optionalInt4.isPresent();
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt4.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream13 = optionalInt12.stream();
        boolean boolean14 = optionalInt12.isEmpty();
        boolean boolean15 = optionalInt12.isPresent();
        int int16 = optionalInt12.getAsInt();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt12.orElseGet(intSupplier17);
        boolean boolean20 = optionalInt12.equals((java.lang.Object) '#');
        java.lang.String str21 = optionalInt12.toString();
        java.lang.Class<?> wildcardClass22 = optionalInt12.getClass();
        boolean boolean23 = optionalInt1.equals((java.lang.Object) optionalInt12);
        int int25 = optionalInt12.orElse((-1));
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int7 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        int int11 = optionalInt1.orElse((int) ' ');
        java.lang.String str12 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        int int10 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElse((int) (short) 10);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(10);
        java.lang.String str15 = optionalInt14.toString();
        int int16 = optionalInt14.orElseThrow();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) int16);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[10]" + "'", str15, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        boolean boolean8 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        int int11 = optionalInt1.getAsInt();
        java.lang.String str12 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[52]" + "'", str12, "OptionalInt[52]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        java.util.function.IntConsumer intConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        boolean boolean12 = optionalInt1.isPresent();
        boolean boolean13 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        boolean boolean7 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.util.function.IntConsumer intConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer13, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = optionalInt7.getClass();
        boolean boolean9 = optionalInt0.equals((java.lang.Object) optionalInt7);
        java.lang.String str10 = optionalInt0.toString();
        java.lang.Class<?> wildcardClass11 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt.empty" + "'", str10, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int10 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass5 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        int int10 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        boolean boolean6 = optionalInt0.isPresent();
        int int8 = optionalInt0.orElse(0);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.lang.Class<?> wildcardClass16 = optionalInt10.getClass();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt10);
        java.util.function.IntSupplier intSupplier18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = optionalInt0.orElseGet(intSupplier18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.lang.String str13 = optionalInt1.toString();
        int int15 = optionalInt1.orElse((int) (byte) 0);
        int int16 = optionalInt1.getAsInt();
        int int17 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.String str11 = optionalInt1.toString();
        int int12 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int4 = optionalInt1.orElseThrow();
        int int5 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        java.lang.String str15 = optionalInt6.toString();
        java.util.function.IntConsumer intConsumer16 = null;
        optionalInt6.ifPresent(intConsumer16);
        java.util.stream.IntStream intStream18 = optionalInt6.stream();
        boolean boolean19 = optionalInt6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = optionalInt6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt.empty" + "'", str15, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        java.util.stream.IntStream intStream5 = optionalInt3.stream();
        java.util.stream.IntStream intStream6 = optionalInt3.stream();
        int int8 = optionalInt3.orElse(10);
        java.util.function.IntConsumer intConsumer9 = null;
        optionalInt3.ifPresent(intConsumer9);
        boolean boolean11 = optionalInt3.isPresent();
        boolean boolean12 = optionalInt0.equals((java.lang.Object) optionalInt3);
        boolean boolean13 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        int int11 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass12 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.lang.Class<?> wildcardClass14 = optionalInt11.getClass();
        boolean boolean15 = optionalInt1.equals((java.lang.Object) optionalInt11);
        boolean boolean16 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream17 = optionalInt1.stream();
        java.lang.String str18 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[-1]" + "'", str18, "OptionalInt[-1]");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        int int3 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(35);
        java.util.function.IntConsumer intConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean8 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        boolean boolean14 = optionalInt9.isPresent();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt16.orElseGet(intSupplier19);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.empty();
        boolean boolean22 = optionalInt16.equals((java.lang.Object) optionalInt21);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt24.orElseGet(intSupplier25);
        java.util.stream.IntStream intStream27 = optionalInt24.stream();
        boolean boolean28 = optionalInt21.equals((java.lang.Object) intStream27);
        boolean boolean29 = optionalInt9.equals((java.lang.Object) optionalInt21);
        boolean boolean30 = optionalInt21.isPresent();
        java.util.function.IntSupplier intSupplier31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = optionalInt21.orElseGet(intSupplier31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int4 = optionalInt1.orElse(1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.function.IntConsumer intConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.lang.String str7 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt8.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt8.stream();
        java.util.stream.IntStream intStream12 = optionalInt8.stream();
        boolean boolean13 = optionalInt1.equals((java.lang.Object) optionalInt8);
        java.util.function.IntConsumer intConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of(1);
        boolean boolean5 = optionalInt4.isPresent();
        boolean boolean6 = optionalInt0.equals((java.lang.Object) boolean5);
        java.util.stream.IntStream intStream7 = optionalInt0.stream();
        java.util.stream.IntStream intStream8 = optionalInt0.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        int int13 = optionalInt1.orElseThrow();
        boolean boolean14 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.lang.String str4 = optionalInt1.toString();
        int int6 = optionalInt1.orElse((int) (short) 0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[-1]" + "'", str4, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.function.IntConsumer intConsumer5 = null;
        optionalInt0.ifPresent(intConsumer5);
        java.lang.Class<?> wildcardClass7 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of((int) (short) -1);
        int int6 = optionalInt5.getAsInt();
        boolean boolean8 = optionalInt5.equals((java.lang.Object) (-1));
        java.lang.String str9 = optionalInt5.toString();
        java.util.stream.IntStream intStream10 = optionalInt5.stream();
        boolean boolean11 = optionalInt5.isPresent();
        boolean boolean12 = optionalInt5.isEmpty();
        java.lang.Class<?> wildcardClass13 = optionalInt5.getClass();
        boolean boolean14 = optionalInt1.equals((java.lang.Object) optionalInt5);
        java.util.function.IntConsumer intConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt5.ifPresent(intConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[-1]" + "'", str9, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 1);
        java.lang.String str2 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[1]" + "'", str2, "OptionalInt[1]");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        int int11 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of((int) (short) -1);
        int int10 = optionalInt9.getAsInt();
        boolean boolean12 = optionalInt9.equals((java.lang.Object) (-1));
        java.lang.String str13 = optionalInt9.toString();
        int int14 = optionalInt9.getAsInt();
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt9.orElseGet(intSupplier15);
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt9.orElseGet(intSupplier17);
        java.util.stream.IntStream intStream19 = optionalInt9.stream();
        boolean boolean20 = optionalInt9.isEmpty();
        boolean boolean21 = optionalInt1.equals((java.lang.Object) optionalInt9);
        boolean boolean22 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        int int9 = optionalInt1.orElse(35);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int19 = optionalInt1.orElse(32);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        boolean boolean11 = optionalInt7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalInt7.isEmpty();
        java.util.stream.IntStream intStream13 = optionalInt7.stream();
        boolean boolean14 = optionalInt0.equals((java.lang.Object) optionalInt7);
        java.util.function.IntConsumer intConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        boolean boolean18 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt1.orElseGet(intSupplier19);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        boolean boolean14 = optionalInt9.isPresent();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt16.orElseGet(intSupplier19);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.empty();
        boolean boolean22 = optionalInt16.equals((java.lang.Object) optionalInt21);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt24.orElseGet(intSupplier25);
        java.util.stream.IntStream intStream27 = optionalInt24.stream();
        boolean boolean28 = optionalInt21.equals((java.lang.Object) intStream27);
        boolean boolean29 = optionalInt9.equals((java.lang.Object) optionalInt21);
        boolean boolean30 = optionalInt21.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = optionalInt21.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        int int6 = optionalInt1.getAsInt();
        boolean boolean7 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        int int9 = optionalInt1.orElse((int) (byte) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        java.lang.String str15 = optionalInt6.toString();
        int int17 = optionalInt6.orElse((int) (byte) -1);
        java.util.function.IntConsumer intConsumer18 = null;
        optionalInt6.ifPresent(intConsumer18);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt.empty" + "'", str15, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.lang.String str4 = optionalInt1.toString();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[-1]" + "'", str4, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        int int7 = optionalInt6.orElseThrow();
        int int8 = optionalInt6.orElseThrow();
        java.util.stream.IntStream intStream9 = optionalInt6.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) intStream9);
        java.lang.String str11 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[1]" + "'", str11, "OptionalInt[1]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        java.lang.String str18 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass19 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[-1]" + "'", str18, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (byte) 1);
        java.util.function.IntConsumer intConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) 'a');
        int int3 = optionalInt1.orElse(52);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        int int16 = optionalInt11.orElseThrow();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt11);
        java.lang.Class<?> wildcardClass18 = optionalInt11.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean9 = optionalInt8.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt8.orElseGet(intSupplier10);
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        int int14 = optionalInt13.orElseThrow();
        int int15 = optionalInt13.orElseThrow();
        java.util.stream.IntStream intStream16 = optionalInt13.stream();
        boolean boolean17 = optionalInt8.equals((java.lang.Object) intStream16);
        int int18 = optionalInt8.orElseThrow();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) int18);
        java.util.function.IntConsumer intConsumer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(10);
        java.lang.String str8 = optionalInt7.toString();
        java.util.stream.IntStream intStream9 = optionalInt7.stream();
        boolean boolean10 = optionalInt0.equals((java.lang.Object) optionalInt7);
        int int12 = optionalInt0.orElse((int) (byte) 0);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[10]" + "'", str8, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int10 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        int int13 = optionalInt1.orElseThrow();
        java.lang.String str14 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[0]" + "'", str14, "OptionalInt[0]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        int int8 = optionalInt1.orElse(0);
        int int9 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.lang.Class<?> wildcardClass12 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        java.util.function.IntConsumer intConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt8.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt8.stream();
        java.util.stream.IntStream intStream12 = optionalInt8.stream();
        boolean boolean13 = optionalInt1.equals((java.lang.Object) optionalInt8);
        int int14 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        java.lang.String str6 = optionalInt0.toString();
        java.lang.Class<?> wildcardClass7 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt.empty" + "'", str6, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        int int9 = optionalInt8.orElseThrow();
        int int10 = optionalInt8.orElseThrow();
        boolean boolean11 = optionalInt8.isEmpty();
        int int13 = optionalInt8.orElse((int) (byte) 1);
        int int15 = optionalInt8.orElse(0);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt8);
        boolean boolean18 = optionalInt1.isPresent();
        boolean boolean19 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.String str11 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        int int13 = optionalInt1.orElse(0);
        java.util.stream.IntStream intStream14 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.orElseThrow();
        boolean boolean5 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElse((int) '#');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        int int4 = optionalInt0.orElse((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        java.lang.Class<?> wildcardClass14 = optionalInt9.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean11 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt10.orElseGet(intSupplier12);
        int int14 = optionalInt10.getAsInt();
        int int16 = optionalInt10.orElse((-1));
        java.util.stream.IntStream intStream17 = optionalInt10.stream();
        boolean boolean18 = optionalInt1.equals((java.lang.Object) optionalInt10);
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt10.orElseGet(intSupplier19);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        boolean boolean11 = optionalInt1.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass10 = intStream9.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        int int13 = optionalInt1.orElse(32);
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.lang.String str8 = optionalInt0.toString();
        java.lang.String str9 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer10 = null;
        optionalInt0.ifPresent(intConsumer10);
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int2 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        boolean boolean11 = optionalInt7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalInt7.isEmpty();
        java.util.stream.IntStream intStream13 = optionalInt7.stream();
        boolean boolean14 = optionalInt0.equals((java.lang.Object) optionalInt7);
        java.util.function.IntConsumer intConsumer15 = null;
        optionalInt0.ifPresent(intConsumer15);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) 10);
        boolean boolean14 = optionalInt9.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElse((-1));
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass9 = intStream8.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        int int4 = optionalInt0.orElse((int) (short) 1);
        boolean boolean5 = optionalInt0.isPresent();
        java.util.stream.IntStream intStream6 = optionalInt0.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int19 = optionalInt10.orElse((int) (short) 1);
        int int20 = optionalInt10.orElseThrow();
        int int21 = optionalInt10.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt9.stream();
        boolean boolean13 = optionalInt6.equals((java.lang.Object) intStream12);
        java.util.stream.IntStream intStream14 = optionalInt6.stream();
        boolean boolean15 = optionalInt6.isPresent();
        boolean boolean16 = optionalInt6.isPresent();
        boolean boolean17 = optionalInt6.isPresent();
        java.util.function.IntSupplier intSupplier18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = optionalInt6.orElseGet(intSupplier18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        int int13 = optionalInt1.orElse(35);
        java.util.function.IntConsumer intConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.lang.String str10 = optionalInt1.toString();
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[1]" + "'", str10, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt7.orElseGet(intSupplier8);
        int int11 = optionalInt7.orElse((int) (short) 10);
        java.lang.String str12 = optionalInt7.toString();
        boolean boolean13 = optionalInt7.isPresent();
        int int14 = optionalInt7.orElseThrow();
        java.util.stream.IntStream intStream15 = optionalInt7.stream();
        boolean boolean16 = optionalInt1.equals((java.lang.Object) intStream15);
        int int17 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isEmpty();
        java.lang.String str12 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt1.orElseGet(intSupplier13);
        boolean boolean15 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer16 = null;
        java.lang.Runnable runnable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer16, runnable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        boolean boolean11 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        int int14 = optionalInt13.getAsInt();
        boolean boolean16 = optionalInt13.equals((java.lang.Object) (-1));
        java.lang.String str17 = optionalInt13.toString();
        boolean boolean18 = optionalInt13.isEmpty();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) optionalInt13);
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        java.util.OptionalInt optionalInt23 = java.util.OptionalInt.of((int) (short) -1);
        int int24 = optionalInt23.getAsInt();
        boolean boolean26 = optionalInt23.equals((java.lang.Object) (-1));
        boolean boolean27 = optionalInt20.equals((java.lang.Object) boolean26);
        int int29 = optionalInt20.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt31 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier32 = null;
        int int33 = optionalInt31.orElseGet(intSupplier32);
        java.util.stream.IntStream intStream34 = optionalInt31.stream();
        java.util.stream.IntStream intStream35 = optionalInt31.stream();
        int int36 = optionalInt31.orElseThrow();
        boolean boolean37 = optionalInt20.equals((java.lang.Object) optionalInt31);
        boolean boolean38 = optionalInt1.equals((java.lang.Object) optionalInt20);
        java.util.function.IntSupplier intSupplier39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = optionalInt20.orElseGet(intSupplier39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[-1]" + "'", str17, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(optionalInt23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(optionalInt31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intStream34);
        org.junit.Assert.assertNotNull(intStream35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        boolean boolean12 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt1.orElseGet(intSupplier13);
        boolean boolean15 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isPresent();
        java.lang.String str7 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[-1]" + "'", str7, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.stream.IntStream intStream5 = optionalInt0.stream();
        java.lang.Class<?> wildcardClass6 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElse((-1));
        int int8 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        boolean boolean12 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean3 = optionalInt1.equals((java.lang.Object) (short) -1);
        java.util.function.IntConsumer intConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        int int17 = optionalInt1.orElse((int) 'a');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) '#');
        int int8 = optionalInt6.orElse((int) '4');
        java.lang.String str9 = optionalInt6.toString();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.lang.String str11 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[35]" + "'", str9, "OptionalInt[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[100]" + "'", str11, "OptionalInt[100]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.lang.String str7 = optionalInt1.toString();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        int int13 = optionalInt9.orElse((int) (short) 10);
        java.lang.String str14 = optionalInt9.toString();
        int int15 = optionalInt9.orElseThrow();
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of(10);
        boolean boolean18 = optionalInt9.equals((java.lang.Object) optionalInt17);
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt9.orElseGet(intSupplier19);
        java.lang.String str21 = optionalInt9.toString();
        int int22 = optionalInt9.orElseThrow();
        boolean boolean23 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.Class<?> wildcardClass24 = optionalInt9.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[10]" + "'", str7, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[1]" + "'", str14, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[1]" + "'", str21, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElseThrow();
        int int9 = optionalInt1.orElse(0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElseThrow();
        java.lang.String str8 = optionalInt1.toString();
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.lang.String str5 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[1]" + "'", str5, "OptionalInt[1]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.lang.String str8 = optionalInt0.toString();
        java.lang.String str9 = optionalInt0.toString();
        boolean boolean10 = optionalInt0.isEmpty();
        java.util.function.IntConsumer intConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        int int2 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        int int7 = optionalInt0.orElse((int) ' ');
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.lang.Class<?> wildcardClass5 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        boolean boolean11 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        int int14 = optionalInt13.getAsInt();
        boolean boolean16 = optionalInt13.equals((java.lang.Object) (-1));
        java.lang.String str17 = optionalInt13.toString();
        boolean boolean18 = optionalInt13.isEmpty();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) optionalInt13);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.of((int) (short) -1);
        int int22 = optionalInt21.getAsInt();
        boolean boolean24 = optionalInt21.equals((java.lang.Object) (-1));
        java.lang.String str25 = optionalInt21.toString();
        boolean boolean26 = optionalInt21.isEmpty();
        int int28 = optionalInt21.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream29 = optionalInt21.stream();
        boolean boolean30 = optionalInt13.equals((java.lang.Object) optionalInt21);
        int int31 = optionalInt13.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[-1]" + "'", str17, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalInt[-1]" + "'", str25, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        int int4 = optionalInt1.orElse(97);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        boolean boolean2 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.lang.String str8 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[0]" + "'", str8, "OptionalInt[0]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.lang.String str7 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[10]" + "'", str7, "OptionalInt[10]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        int int6 = optionalInt1.orElse(0);
        boolean boolean7 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) 'a');
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.String str11 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.String str3 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.function.IntConsumer intConsumer6 = null;
        optionalInt0.ifPresent(intConsumer6);
        java.util.function.IntSupplier intSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = optionalInt0.orElseGet(intSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt.empty" + "'", str3, "OptionalInt.empty");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.lang.String str13 = optionalInt1.toString();
        int int15 = optionalInt1.orElse((int) (byte) 0);
        int int16 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.String str11 = optionalInt1.toString();
        boolean boolean12 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        java.lang.String str14 = optionalInt1.toString();
        int int16 = optionalInt1.orElse(0);
        java.lang.String str17 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[-1]" + "'", str14, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[-1]" + "'", str17, "OptionalInt[-1]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt10.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream20 = optionalInt19.stream();
        boolean boolean21 = optionalInt19.isEmpty();
        boolean boolean23 = optionalInt19.equals((java.lang.Object) 0.0f);
        boolean boolean24 = optionalInt19.isEmpty();
        boolean boolean25 = optionalInt19.isEmpty();
        boolean boolean26 = optionalInt10.equals((java.lang.Object) optionalInt19);
        int int28 = optionalInt19.orElse((int) (short) 1);
        boolean boolean29 = optionalInt1.equals((java.lang.Object) optionalInt19);
        java.lang.Class<?> wildcardClass30 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of(100);
        int int19 = optionalInt17.orElse((int) '#');
        boolean boolean20 = optionalInt17.isPresent();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) '#');
        int int24 = optionalInt22.orElse((int) '4');
        java.lang.String str25 = optionalInt22.toString();
        boolean boolean26 = optionalInt17.equals((java.lang.Object) optionalInt22);
        int int27 = optionalInt17.getAsInt();
        boolean boolean28 = optionalInt1.equals((java.lang.Object) optionalInt17);
        java.lang.Class<?> wildcardClass29 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalInt[35]" + "'", str25, "OptionalInt[35]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        int int6 = optionalInt1.orElse(0);
        boolean boolean7 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElse((int) (short) 1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.String str3 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.function.IntConsumer intConsumer6 = null;
        optionalInt0.ifPresent(intConsumer6);
        boolean boolean8 = optionalInt0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt.empty" + "'", str3, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.lang.String str13 = optionalInt1.toString();
        int int15 = optionalInt1.orElse((int) (byte) 0);
        int int16 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream19 = optionalInt18.stream();
        boolean boolean20 = optionalInt18.isEmpty();
        boolean boolean22 = optionalInt18.equals((java.lang.Object) 0.0f);
        boolean boolean23 = optionalInt18.isEmpty();
        boolean boolean24 = optionalInt18.isEmpty();
        boolean boolean26 = optionalInt18.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream27 = optionalInt18.stream();
        java.lang.Object obj28 = null;
        boolean boolean29 = optionalInt18.equals(obj28);
        boolean boolean30 = optionalInt1.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        boolean boolean10 = optionalInt1.isPresent();
        int int12 = optionalInt1.orElse((int) (byte) 0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElse((-1));
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((-1));
        int int3 = optionalInt1.orElse((int) (byte) 0);
        int int5 = optionalInt1.orElse((int) '#');
        int int7 = optionalInt1.orElse(32);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt1.orElseThrow();
        boolean boolean19 = optionalInt1.isEmpty();
        int int20 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.lang.String str7 = optionalInt1.toString();
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt4.orElseGet(intSupplier5);
        int int7 = optionalInt4.orElseThrow();
        int int8 = optionalInt4.orElseThrow();
        java.util.stream.IntStream intStream9 = optionalInt4.stream();
        java.util.stream.IntStream intStream10 = optionalInt4.stream();
        boolean boolean11 = optionalInt1.equals((java.lang.Object) intStream10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.function.IntConsumer intConsumer5 = null;
        optionalInt0.ifPresent(intConsumer5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.stream.IntStream intStream5 = optionalInt0.stream();
        int int7 = optionalInt0.orElse((int) 'a');
        java.util.function.IntConsumer intConsumer8 = null;
        optionalInt0.ifPresent(intConsumer8);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElseThrow();
        int int8 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        int int16 = optionalInt11.orElseThrow();
        boolean boolean17 = optionalInt0.equals((java.lang.Object) optionalInt11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt10.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream20 = optionalInt19.stream();
        boolean boolean21 = optionalInt19.isEmpty();
        boolean boolean23 = optionalInt19.equals((java.lang.Object) 0.0f);
        boolean boolean24 = optionalInt19.isEmpty();
        boolean boolean25 = optionalInt19.isEmpty();
        boolean boolean26 = optionalInt10.equals((java.lang.Object) optionalInt19);
        int int28 = optionalInt19.orElse((int) (short) 1);
        boolean boolean29 = optionalInt1.equals((java.lang.Object) optionalInt19);
        int int30 = optionalInt1.getAsInt();
        boolean boolean31 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of(100);
        int int19 = optionalInt17.orElse((int) '#');
        boolean boolean20 = optionalInt17.isPresent();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) '#');
        int int24 = optionalInt22.orElse((int) '4');
        java.lang.String str25 = optionalInt22.toString();
        boolean boolean26 = optionalInt17.equals((java.lang.Object) optionalInt22);
        int int27 = optionalInt17.getAsInt();
        boolean boolean28 = optionalInt1.equals((java.lang.Object) optionalInt17);
        int int29 = optionalInt17.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalInt[35]" + "'", str25, "OptionalInt[35]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass14 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        boolean boolean13 = optionalInt11.isEmpty();
        boolean boolean15 = optionalInt11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalInt11.isEmpty();
        boolean boolean17 = optionalInt11.isEmpty();
        boolean boolean19 = optionalInt11.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream20 = optionalInt11.stream();
        java.lang.String str21 = optionalInt11.toString();
        java.lang.Class<?> wildcardClass22 = optionalInt11.getClass();
        boolean boolean23 = optionalInt1.equals((java.lang.Object) optionalInt11);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt9.orElseThrow();
        int int12 = optionalInt9.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.lang.Class<?> wildcardClass14 = optionalInt11.getClass();
        boolean boolean15 = optionalInt1.equals((java.lang.Object) optionalInt11);
        boolean boolean16 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass17 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        int int8 = optionalInt1.orElse((int) 'a');
        boolean boolean9 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        boolean boolean16 = optionalInt11.isPresent();
        int int17 = optionalInt11.orElseThrow();
        java.util.function.IntSupplier intSupplier18 = null;
        int int19 = optionalInt11.orElseGet(intSupplier18);
        boolean boolean20 = optionalInt1.equals((java.lang.Object) intSupplier18);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElseThrow();
        int int13 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass14 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        int int9 = optionalInt1.getAsInt();
        java.lang.String str10 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[0]" + "'", str10, "OptionalInt[0]");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        boolean boolean5 = optionalInt1.isPresent();
        java.lang.String str6 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[-1]" + "'", str6, "OptionalInt[-1]");
    }
}

