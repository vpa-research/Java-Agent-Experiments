package org.huawei.optionalint;

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
        java.lang.String str14 = optionalInt1.toString();
        java.lang.String str15 = optionalInt1.toString();
        boolean boolean16 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[0]" + "'", str14, "OptionalInt[0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[0]" + "'", str15, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        boolean boolean14 = optionalInt1.isEmpty();
        boolean boolean15 = optionalInt1.isEmpty();
        boolean boolean16 = optionalInt1.isEmpty();
        boolean boolean17 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        int int10 = optionalInt1.orElse((int) '#');
        boolean boolean11 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.util.stream.IntStream intStream16 = optionalInt1.stream();
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
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        int int11 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        boolean boolean10 = optionalInt0.isPresent();
        java.util.function.IntSupplier intSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = optionalInt0.orElseGet(intSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int6 = optionalInt1.getAsInt();
        boolean boolean7 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        boolean boolean10 = optionalInt0.isPresent();
        boolean boolean11 = optionalInt0.isPresent();
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
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt6.orElse(32);
        boolean boolean10 = optionalInt6.isPresent();
        java.lang.String str11 = optionalInt6.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt.empty" + "'", str11, "OptionalInt.empty");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass10 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
            int int20 = optionalInt6.getAsInt();
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        boolean boolean8 = optionalInt0.isPresent();
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
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        boolean boolean8 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.isEmpty();
        int int10 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElse((int) (byte) 0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        java.lang.String str17 = optionalInt8.toString();
        java.util.function.IntConsumer intConsumer18 = null;
        optionalInt8.ifPresent(intConsumer18);
        java.util.stream.IntStream intStream20 = optionalInt8.stream();
        boolean boolean21 = optionalInt1.equals((java.lang.Object) intStream20);
        java.lang.Class<?> wildcardClass22 = intStream20.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt.empty" + "'", str17, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.util.OptionalInt optionalInt40 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream41 = optionalInt40.stream();
        boolean boolean42 = optionalInt40.isEmpty();
        java.util.function.IntSupplier intSupplier43 = null;
        int int44 = optionalInt40.orElseGet(intSupplier43);
        java.util.OptionalInt optionalInt45 = java.util.OptionalInt.empty();
        boolean boolean46 = optionalInt40.equals((java.lang.Object) optionalInt45);
        java.util.OptionalInt optionalInt48 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier49 = null;
        int int50 = optionalInt48.orElseGet(intSupplier49);
        java.util.stream.IntStream intStream51 = optionalInt48.stream();
        boolean boolean52 = optionalInt45.equals((java.lang.Object) intStream51);
        java.util.stream.IntStream intStream53 = optionalInt45.stream();
        java.lang.String str54 = optionalInt45.toString();
        java.util.function.IntConsumer intConsumer55 = null;
        optionalInt45.ifPresent(intConsumer55);
        java.util.stream.IntStream intStream57 = optionalInt45.stream();
        boolean boolean58 = optionalInt20.equals((java.lang.Object) optionalInt45);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = optionalInt45.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(optionalInt40);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(optionalInt45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(optionalInt48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intStream53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OptionalInt.empty" + "'", str54, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(intStream57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.lang.String str19 = optionalInt7.toString();
        boolean boolean20 = optionalInt7.isPresent();
        int int22 = optionalInt7.orElse((int) ' ');
        boolean boolean23 = optionalInt7.isPresent();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        boolean boolean14 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 10);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        int int8 = optionalInt1.orElse(0);
        int int9 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        int int15 = optionalInt11.orElse((int) (short) 10);
        java.lang.String str16 = optionalInt11.toString();
        boolean boolean17 = optionalInt11.isPresent();
        int int18 = optionalInt11.orElseThrow();
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
        int int38 = optionalInt29.orElse((int) (short) 1);
        boolean boolean39 = optionalInt11.equals((java.lang.Object) optionalInt29);
        boolean boolean40 = optionalInt1.equals((java.lang.Object) optionalInt29);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalInt[1]" + "'", str16, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        int int5 = optionalInt1.orElse((int) (byte) 0);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        boolean boolean2 = optionalInt1.isPresent();
        int int3 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream18 = optionalInt17.stream();
        boolean boolean19 = optionalInt17.isEmpty();
        boolean boolean21 = optionalInt17.equals((java.lang.Object) 0.0f);
        boolean boolean22 = optionalInt17.isEmpty();
        boolean boolean23 = optionalInt17.isEmpty();
        boolean boolean25 = optionalInt17.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream26 = optionalInt17.stream();
        boolean boolean27 = optionalInt17.isPresent();
        int int29 = optionalInt17.orElse((int) (short) 10);
        boolean boolean30 = optionalInt1.equals((java.lang.Object) optionalInt17);
        boolean boolean31 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int4 = optionalInt1.orElseThrow();
        int int5 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        boolean boolean2 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
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
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        java.util.function.IntConsumer intConsumer29 = null;
        java.lang.Runnable runnable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer29, runnable30);
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
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        boolean boolean10 = optionalInt1.isPresent();
        boolean boolean11 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.getAsInt();
        int int4 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        int int14 = optionalInt1.orElse((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = optionalInt1.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        boolean boolean9 = optionalInt1.isPresent();
        int int11 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean12 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass3 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of((-1));
        boolean boolean16 = optionalInt1.equals((java.lang.Object) (-1));
        int int17 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        int int19 = optionalInt1.orElseThrow();
        java.lang.String str20 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer21);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[-1]" + "'", str20, "OptionalInt[-1]");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream23 = optionalInt22.stream();
        boolean boolean24 = optionalInt22.isEmpty();
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt22.orElseGet(intSupplier25);
        java.util.OptionalInt optionalInt27 = java.util.OptionalInt.empty();
        boolean boolean28 = optionalInt22.equals((java.lang.Object) optionalInt27);
        int int30 = optionalInt22.orElse((int) (byte) 1);
        boolean boolean31 = optionalInt22.isEmpty();
        boolean boolean32 = optionalInt1.equals((java.lang.Object) optionalInt22);
        java.util.function.IntSupplier intSupplier33 = null;
        int int34 = optionalInt1.orElseGet(intSupplier33);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(optionalInt27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        int int21 = optionalInt1.getAsInt();
        int int22 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        java.util.stream.IntStream intStream13 = optionalInt11.stream();
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        int int16 = optionalInt11.orElse(10);
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of(10);
        java.lang.String str19 = optionalInt18.toString();
        java.util.stream.IntStream intStream20 = optionalInt18.stream();
        boolean boolean21 = optionalInt11.equals((java.lang.Object) optionalInt18);
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt18);
        java.lang.String str23 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[10]" + "'", str19, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalInt[-1]" + "'", str23, "OptionalInt[-1]");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        optionalInt21.ifPresent(intConsumer30);
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int3 = optionalInt1.orElse((int) '4');
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[35]" + "'", str4, "OptionalInt[35]");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        int int14 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        boolean boolean19 = optionalInt16.isPresent();
        int int20 = optionalInt16.getAsInt();
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt16.orElseGet(intSupplier21);
        boolean boolean24 = optionalInt16.equals((java.lang.Object) '#');
        boolean boolean25 = optionalInt16.isPresent();
        java.util.stream.IntStream intStream26 = optionalInt16.stream();
        boolean boolean27 = optionalInt1.equals((java.lang.Object) optionalInt16);
        boolean boolean28 = optionalInt16.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isPresent();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        int int21 = optionalInt1.getAsInt();
        boolean boolean22 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        int int8 = optionalInt1.orElse(97);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        int int12 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        boolean boolean13 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isPresent();
        java.lang.Object obj7 = null;
        boolean boolean8 = optionalInt1.equals(obj7);
        boolean boolean9 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        boolean boolean18 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        java.util.stream.IntStream intStream4 = optionalInt0.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        int int16 = optionalInt1.orElseThrow();
        boolean boolean17 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer12);
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
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        boolean boolean10 = optionalInt0.isPresent();
        int int12 = optionalInt0.orElse((int) (short) 100);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        int int11 = optionalInt1.getAsInt();
        boolean boolean12 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of(1);
        boolean boolean5 = optionalInt4.isPresent();
        boolean boolean6 = optionalInt0.equals((java.lang.Object) boolean5);
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
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        java.util.stream.IntStream intStream16 = optionalInt7.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) intStream16);
        boolean boolean18 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElseThrow();
        java.lang.String str8 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt1.orElse((int) (byte) 1);
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.Class<?> wildcardClass13 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        java.lang.String str11 = optionalInt1.toString();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of(1);
        boolean boolean15 = optionalInt13.equals((java.lang.Object) (short) -1);
        boolean boolean16 = optionalInt1.equals((java.lang.Object) (short) -1);
        boolean boolean17 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        int int5 = optionalInt4.getAsInt();
        boolean boolean7 = optionalInt4.equals((java.lang.Object) (-1));
        java.lang.String str8 = optionalInt4.toString();
        boolean boolean9 = optionalInt4.isEmpty();
        int int11 = optionalInt4.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream12 = optionalInt4.stream();
        java.util.stream.IntStream intStream13 = optionalInt4.stream();
        int int14 = optionalInt4.getAsInt();
        boolean boolean15 = optionalInt1.equals((java.lang.Object) int14);
        java.util.function.IntConsumer intConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        int int13 = optionalInt1.orElse((int) (short) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElseThrow();
        boolean boolean8 = optionalInt1.isEmpty();
        java.lang.String str9 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[0]" + "'", str9, "OptionalInt[0]");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
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
        boolean boolean23 = optionalInt9.isEmpty();
        java.util.OptionalInt optionalInt25 = java.util.OptionalInt.of(100);
        int int27 = optionalInt25.orElse((int) '#');
        boolean boolean28 = optionalInt25.isPresent();
        java.util.OptionalInt optionalInt30 = java.util.OptionalInt.of((int) '#');
        int int32 = optionalInt30.orElse((int) '4');
        java.lang.String str33 = optionalInt30.toString();
        boolean boolean34 = optionalInt25.equals((java.lang.Object) optionalInt30);
        int int35 = optionalInt25.getAsInt();
        boolean boolean36 = optionalInt9.equals((java.lang.Object) optionalInt25);
        boolean boolean37 = optionalInt1.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intStream7);
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
        org.junit.Assert.assertNotNull(optionalInt25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(optionalInt30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OptionalInt[35]" + "'", str33, "OptionalInt[35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isPresent();
        java.lang.Object obj7 = null;
        boolean boolean8 = optionalInt1.equals(obj7);
        int int10 = optionalInt1.orElse(1);
        int int11 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt1.orElseGet(intSupplier12);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        int int3 = optionalInt1.orElse(0);
        int int4 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.String str3 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        int int7 = optionalInt0.orElse(10);
        boolean boolean8 = optionalInt0.isEmpty();
        boolean boolean9 = optionalInt0.isPresent();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt.empty" + "'", str3, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        boolean boolean4 = optionalInt0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        boolean boolean3 = optionalInt0.isEmpty();
        int int5 = optionalInt0.orElse((-1));
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt9.orElseGet(intSupplier11);
        java.util.stream.IntStream intStream13 = optionalInt9.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        int int8 = optionalInt1.orElse(0);
        int int9 = optionalInt1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        boolean boolean20 = optionalInt10.isPresent();
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt10.orElseGet(intSupplier21);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
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
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        int int13 = optionalInt0.orElse((int) '4');
        boolean boolean14 = optionalInt0.isPresent();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        int int3 = optionalInt1.orElse(0);
        java.lang.String str4 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int8 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        java.lang.Class<?> wildcardClass6 = optionalInt4.getClass();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt4);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int3 = optionalInt1.orElse((int) '4');
        java.lang.String str4 = optionalInt1.toString();
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of(10);
        java.lang.String str7 = optionalInt6.toString();
        int int8 = optionalInt6.orElseThrow();
        int int9 = optionalInt6.getAsInt();
        int int10 = optionalInt6.getAsInt();
        boolean boolean11 = optionalInt1.equals((java.lang.Object) int10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[35]" + "'", str4, "OptionalInt[35]");
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[10]" + "'", str7, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.util.function.IntConsumer intConsumer8 = null;
        optionalInt0.ifPresent(intConsumer8);
        java.util.stream.IntStream intStream10 = optionalInt0.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream23 = optionalInt22.stream();
        boolean boolean24 = optionalInt22.isEmpty();
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt22.orElseGet(intSupplier25);
        java.util.OptionalInt optionalInt27 = java.util.OptionalInt.empty();
        boolean boolean28 = optionalInt22.equals((java.lang.Object) optionalInt27);
        int int30 = optionalInt22.orElse((int) (byte) 1);
        boolean boolean31 = optionalInt22.isEmpty();
        boolean boolean32 = optionalInt1.equals((java.lang.Object) optionalInt22);
        int int33 = optionalInt22.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(optionalInt27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        boolean boolean4 = optionalInt1.isEmpty();
        int int5 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int7 = optionalInt1.orElse((int) (short) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int8 = optionalInt1.orElse(32);
        boolean boolean9 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        boolean boolean14 = optionalInt1.isEmpty();
        boolean boolean15 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt1.orElseGet(intSupplier16);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.function.IntConsumer intConsumer1 = null;
        optionalInt0.ifPresent(intConsumer1);
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean3 = optionalInt1.equals((java.lang.Object) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        boolean boolean17 = optionalInt1.isPresent();
        int int18 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        int int10 = optionalInt1.orElse((int) (byte) 0);
        int int11 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.lang.String str8 = optionalInt1.toString();
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[0]" + "'", str8, "OptionalInt[0]");
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.lang.String str12 = optionalInt0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = optionalInt0.getAsInt();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt.empty" + "'", str12, "OptionalInt.empty");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        boolean boolean13 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.lang.Class<?> wildcardClass12 = intStream11.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        int int14 = optionalInt11.orElseThrow();
        int int15 = optionalInt11.getAsInt();
        int int17 = optionalInt11.orElse(52);
        int int19 = optionalInt11.orElse((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) (short) 100);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        boolean boolean13 = optionalInt1.isEmpty();
        boolean boolean14 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) '#');
        int int8 = optionalInt6.orElse((int) '4');
        java.lang.String str9 = optionalInt6.toString();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.stream.IntStream intStream11 = optionalInt6.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[35]" + "'", str9, "OptionalInt[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.util.function.IntConsumer intConsumer8 = null;
        optionalInt0.ifPresent(intConsumer8);
        boolean boolean10 = optionalInt0.isEmpty();
        java.util.function.IntSupplier intSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = optionalInt0.orElseGet(intSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        boolean boolean35 = optionalInt31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalInt31.isEmpty();
        java.util.function.IntSupplier intSupplier37 = null;
        int int38 = optionalInt31.orElseGet(intSupplier37);
        java.util.OptionalInt optionalInt40 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream41 = optionalInt40.stream();
        boolean boolean42 = optionalInt40.isEmpty();
        boolean boolean44 = optionalInt40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalInt40.isEmpty();
        boolean boolean46 = optionalInt40.isEmpty();
        boolean boolean47 = optionalInt31.equals((java.lang.Object) optionalInt40);
        boolean boolean48 = optionalInt7.equals((java.lang.Object) optionalInt40);
        boolean boolean49 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier50 = null;
        int int51 = optionalInt7.orElseGet(intSupplier50);
        int int52 = optionalInt7.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(optionalInt40);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt6.orElse(32);
        java.lang.Class<?> wildcardClass10 = optionalInt6.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        java.util.stream.IntStream intStream17 = optionalInt1.stream();
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
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        boolean boolean12 = optionalInt1.isPresent();
        int int14 = optionalInt1.orElse((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElseThrow();
        int int8 = optionalInt1.orElseThrow();
        int int9 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        boolean boolean5 = optionalInt1.isEmpty();
        int int6 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.util.stream.IntStream intStream19 = optionalInt1.stream();
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
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[0]" + "'", str4, "OptionalInt[0]");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        int int5 = optionalInt0.orElse(1);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        int int8 = optionalInt7.orElseThrow();
        int int9 = optionalInt7.orElseThrow();
        int int10 = optionalInt7.orElseThrow();
        boolean boolean11 = optionalInt0.equals((java.lang.Object) int10);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.util.stream.IntStream intStream13 = optionalInt11.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.util.function.IntSupplier intSupplier41 = null;
        int int42 = optionalInt1.orElseGet(intSupplier41);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = optionalInt11.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int8 = optionalInt1.getAsInt();
        int int9 = optionalInt1.getAsInt();
        java.lang.String str10 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.lang.String str13 = optionalInt9.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[10]" + "'", str13, "OptionalInt[10]");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        int int15 = optionalInt6.orElse(10);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt9.orElseGet(intSupplier11);
        int int13 = optionalInt9.getAsInt();
        boolean boolean14 = optionalInt9.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElse((int) (short) 1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 10);
        boolean boolean2 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        boolean boolean15 = optionalInt1.isPresent();
        int int17 = optionalInt1.orElse((int) (byte) 0);
        java.lang.String str18 = optionalInt1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[-1]" + "'", str18, "OptionalInt[-1]");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isPresent();
        boolean boolean5 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((-1));
        int int3 = optionalInt1.orElse((int) (byte) 0);
        int int5 = optionalInt1.orElse((int) '#');
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean8 = optionalInt1.isPresent();
        java.lang.String str9 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[0]" + "'", str9, "OptionalInt[0]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.util.function.IntConsumer intConsumer19 = null;
        java.lang.Runnable runnable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer19, runnable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        int int11 = optionalInt1.orElse((int) '#');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        boolean boolean8 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        int int21 = optionalInt10.getAsInt();
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        boolean boolean14 = optionalInt1.isEmpty();
        boolean boolean15 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream18 = optionalInt17.stream();
        boolean boolean19 = optionalInt17.isEmpty();
        int int20 = optionalInt17.getAsInt();
        boolean boolean21 = optionalInt17.isEmpty();
        int int22 = optionalInt17.orElseThrow();
        boolean boolean23 = optionalInt17.isEmpty();
        boolean boolean24 = optionalInt17.isPresent();
        boolean boolean25 = optionalInt1.equals((java.lang.Object) boolean24);
        java.util.function.IntConsumer intConsumer26 = null;
        java.lang.Runnable runnable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer26, runnable27);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        int int7 = optionalInt0.orElse((int) (short) 0);
        java.lang.String str8 = optionalInt0.toString();
        java.lang.String str9 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        optionalInt0.ifPresent(intConsumer12);
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt15.orElseGet(intSupplier16);
        int int19 = optionalInt15.orElse((int) (short) 10);
        java.lang.String str20 = optionalInt15.toString();
        boolean boolean21 = optionalInt15.isPresent();
        int int22 = optionalInt15.orElseThrow();
        boolean boolean23 = optionalInt15.isPresent();
        java.util.stream.IntStream intStream24 = optionalInt15.stream();
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt15.orElseGet(intSupplier25);
        java.lang.String str27 = optionalInt15.toString();
        boolean boolean28 = optionalInt15.isEmpty();
        boolean boolean29 = optionalInt0.equals((java.lang.Object) boolean28);
        boolean boolean30 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[1]" + "'", str20, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalInt[1]" + "'", str27, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer30);
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[0]" + "'", str3, "OptionalInt[0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt13.orElseGet(intSupplier14);
        int int17 = optionalInt13.orElse((int) (short) 10);
        java.lang.String str18 = optionalInt13.toString();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) str18);
        java.util.stream.IntStream intStream20 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[1]" + "'", str18, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        boolean boolean4 = optionalInt0.isEmpty();
        int int6 = optionalInt0.orElse((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.lang.String str21 = optionalInt10.toString();
        int int22 = optionalInt10.orElseThrow();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        int int6 = optionalInt1.getAsInt();
        java.lang.String str7 = optionalInt1.toString();
        int int9 = optionalInt1.orElse((int) (byte) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        int int19 = optionalInt1.orElseThrow();
        java.lang.String str20 = optionalInt1.toString();
        boolean boolean21 = optionalInt1.isPresent();
        boolean boolean22 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer23);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[-1]" + "'", str20, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
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
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[-1]" + "'", str6, "OptionalInt[-1]");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.util.function.IntConsumer intConsumer15 = null;
        optionalInt6.ifPresent(intConsumer15);
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
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) ' ');
        java.lang.Class<?> wildcardClass9 = optionalInt8.getClass();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt8);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        boolean boolean41 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 0);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt10.orElseGet(intSupplier16);
        boolean boolean18 = optionalInt10.isPresent();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) '4');
        boolean boolean21 = optionalInt10.equals((java.lang.Object) optionalInt20);
        int int22 = optionalInt10.orElseThrow();
        boolean boolean23 = optionalInt10.isEmpty();
        boolean boolean24 = optionalInt1.equals((java.lang.Object) boolean23);
        java.lang.Class<?> wildcardClass25 = optionalInt1.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((-1));
        int int3 = optionalInt1.orElse((int) (byte) 0);
        int int5 = optionalInt1.orElse((int) '#');
        java.lang.String str6 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[-1]" + "'", str6, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        optionalInt0.ifPresent(intConsumer12);
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt15.orElseGet(intSupplier16);
        int int19 = optionalInt15.orElse((int) (short) 10);
        java.lang.String str20 = optionalInt15.toString();
        boolean boolean21 = optionalInt15.isPresent();
        int int22 = optionalInt15.orElseThrow();
        boolean boolean23 = optionalInt15.isPresent();
        java.util.stream.IntStream intStream24 = optionalInt15.stream();
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt15.orElseGet(intSupplier25);
        java.lang.String str27 = optionalInt15.toString();
        boolean boolean28 = optionalInt15.isEmpty();
        boolean boolean29 = optionalInt0.equals((java.lang.Object) boolean28);
        java.lang.Class<?> wildcardClass30 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[1]" + "'", str20, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalInt[1]" + "'", str27, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        boolean boolean35 = optionalInt31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalInt31.isEmpty();
        java.util.function.IntSupplier intSupplier37 = null;
        int int38 = optionalInt31.orElseGet(intSupplier37);
        java.util.OptionalInt optionalInt40 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream41 = optionalInt40.stream();
        boolean boolean42 = optionalInt40.isEmpty();
        boolean boolean44 = optionalInt40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalInt40.isEmpty();
        boolean boolean46 = optionalInt40.isEmpty();
        boolean boolean47 = optionalInt31.equals((java.lang.Object) optionalInt40);
        boolean boolean48 = optionalInt7.equals((java.lang.Object) optionalInt40);
        java.util.OptionalInt optionalInt50 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean51 = optionalInt50.isEmpty();
        java.util.function.IntSupplier intSupplier52 = null;
        int int53 = optionalInt50.orElseGet(intSupplier52);
        boolean boolean54 = optionalInt50.isPresent();
        boolean boolean55 = optionalInt40.equals((java.lang.Object) boolean54);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(optionalInt40);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(optionalInt50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.util.OptionalInt optionalInt40 = java.util.OptionalInt.of((int) (short) -1);
        int int41 = optionalInt40.getAsInt();
        boolean boolean43 = optionalInt40.equals((java.lang.Object) (-1));
        java.lang.String str44 = optionalInt40.toString();
        boolean boolean45 = optionalInt40.isEmpty();
        int int47 = optionalInt40.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream48 = optionalInt40.stream();
        boolean boolean49 = optionalInt40.isEmpty();
        boolean boolean50 = optionalInt40.isPresent();
        boolean boolean51 = optionalInt20.equals((java.lang.Object) optionalInt40);
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
        org.junit.Assert.assertNotNull(optionalInt40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "OptionalInt[-1]" + "'", str44, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.lang.String str14 = optionalInt1.toString();
        boolean boolean15 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer16);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[0]" + "'", str14, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        int int15 = optionalInt11.orElse((-1));
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        int int8 = optionalInt1.orElse((int) 'a');
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isPresent();
        int int12 = optionalInt1.orElse((int) (byte) -1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        int int9 = optionalInt8.getAsInt();
        boolean boolean11 = optionalInt8.equals((java.lang.Object) (-1));
        java.lang.String str12 = optionalInt8.toString();
        int int13 = optionalInt8.getAsInt();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt8.orElseGet(intSupplier14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt8);
        int int18 = optionalInt8.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt7.orElseGet(intSupplier8);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        boolean boolean12 = optionalInt1.equals((java.lang.Object) intSupplier10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.orElseThrow();
        java.lang.String str7 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[10]" + "'", str7, "OptionalInt[10]");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        boolean boolean13 = optionalInt9.isEmpty();
        boolean boolean14 = optionalInt9.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.Class<?> wildcardClass20 = optionalInt1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElseThrow();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        java.util.function.IntSupplier intSupplier20 = null;
        int int21 = optionalInt1.orElseGet(intSupplier20);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        boolean boolean4 = optionalInt0.isEmpty();
        boolean boolean5 = optionalInt0.isEmpty();
        java.lang.Class<?> wildcardClass6 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int2 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt4.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        boolean boolean10 = optionalInt4.equals((java.lang.Object) optionalInt9);
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt12.orElseGet(intSupplier13);
        java.util.stream.IntStream intStream15 = optionalInt12.stream();
        boolean boolean16 = optionalInt9.equals((java.lang.Object) intStream15);
        boolean boolean17 = optionalInt9.isEmpty();
        boolean boolean18 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntConsumer intConsumer19 = null;
        optionalInt9.ifPresent(intConsumer19);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.Class<?> wildcardClass19 = optionalInt10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        int int11 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass12 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        int int4 = optionalInt1.getAsInt();
        java.lang.String str5 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt1.orElseGet(intSupplier16);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of((int) (short) -1);
        int int10 = optionalInt9.getAsInt();
        boolean boolean12 = optionalInt9.equals((java.lang.Object) (-1));
        java.lang.String str13 = optionalInt9.toString();
        boolean boolean14 = optionalInt9.isEmpty();
        int int16 = optionalInt9.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream17 = optionalInt9.stream();
        int int18 = optionalInt9.getAsInt();
        java.lang.String str19 = optionalInt9.toString();
        boolean boolean20 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream21 = optionalInt9.stream();
        boolean boolean22 = optionalInt9.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        boolean boolean14 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.util.function.IntSupplier intSupplier17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = optionalInt6.orElseGet(intSupplier17);
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
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        boolean boolean12 = optionalInt1.isPresent();
        boolean boolean13 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt.empty" + "'", str15, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElseThrow();
        boolean boolean10 = optionalInt1.isPresent();
        boolean boolean11 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.stream.IntStream intStream4 = optionalInt0.stream();
        java.lang.Class<?> wildcardClass5 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        boolean boolean8 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.isEmpty();
        int int11 = optionalInt1.orElse((int) (short) 0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.lang.String str14 = optionalInt1.toString();
        java.lang.String str15 = optionalInt1.toString();
        int int16 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[-1]" + "'", str14, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[-1]" + "'", str15, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.util.stream.IntStream intStream14 = optionalInt1.stream();
        java.lang.String str15 = optionalInt1.toString();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        java.util.stream.IntStream intStream18 = optionalInt16.stream();
        java.util.function.IntConsumer intConsumer19 = null;
        optionalInt16.ifPresent(intConsumer19);
        boolean boolean21 = optionalInt16.isPresent();
        boolean boolean22 = optionalInt16.isPresent();
        int int24 = optionalInt16.orElse(0);
        int int26 = optionalInt16.orElse((int) (short) 100);
        boolean boolean27 = optionalInt1.equals((java.lang.Object) int26);
        boolean boolean28 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[-1]" + "'", str15, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        java.lang.String str8 = optionalInt0.toString();
        java.lang.String str9 = optionalInt0.toString();
        java.lang.String str10 = optionalInt0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = optionalInt0.getAsInt();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt.empty" + "'", str10, "OptionalInt.empty");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        boolean boolean9 = optionalInt1.isPresent();
        int int11 = optionalInt1.orElse((int) (byte) 100);
        int int12 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isEmpty();
        int int17 = optionalInt1.orElse((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.String str11 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt1.orElseGet(intSupplier12);
        java.util.function.IntConsumer intConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        boolean boolean12 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of((int) (byte) 10);
        boolean boolean15 = optionalInt1.equals((java.lang.Object) optionalInt14);
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier18 = null;
        int int19 = optionalInt17.orElseGet(intSupplier18);
        int int20 = optionalInt17.orElseThrow();
        int int21 = optionalInt17.orElseThrow();
        int int22 = optionalInt17.getAsInt();
        boolean boolean23 = optionalInt14.equals((java.lang.Object) optionalInt17);
        int int25 = optionalInt14.orElse(97);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        boolean boolean10 = optionalInt1.isPresent();
        int int12 = optionalInt1.orElse((-1));
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        int int14 = optionalInt11.orElseThrow();
        int int15 = optionalInt11.getAsInt();
        int int16 = optionalInt11.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        int int7 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer21 = null;
        java.lang.Runnable runnable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer21, runnable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        boolean boolean11 = optionalInt0.isEmpty();
        java.lang.String str12 = optionalInt0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt.empty" + "'", str12, "OptionalInt.empty");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) ' ');
        int int17 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.String str12 = optionalInt0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = optionalInt0.orElseThrow();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt.empty" + "'", str12, "OptionalInt.empty");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        boolean boolean17 = optionalInt1.isPresent();
        java.lang.String str18 = optionalInt1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[-1]" + "'", str18, "OptionalInt[-1]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(97);
        org.junit.Assert.assertNotNull(optionalInt1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.String str17 = optionalInt1.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[-1]" + "'", str17, "OptionalInt[-1]");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        int int13 = optionalInt0.orElse((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass3 = intStream2.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer12);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.lang.String str10 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[1]" + "'", str10, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        boolean boolean10 = optionalInt0.isPresent();
        boolean boolean11 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean8 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass10 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        int int10 = optionalInt7.getAsInt();
        java.lang.String str11 = optionalInt7.toString();
        boolean boolean12 = optionalInt1.equals((java.lang.Object) optionalInt7);
        int int14 = optionalInt7.orElse(35);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        boolean boolean21 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(35);
        int int2 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        boolean boolean11 = optionalInt7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt7.orElseGet(intSupplier13);
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        boolean boolean20 = optionalInt16.equals((java.lang.Object) 0.0f);
        boolean boolean21 = optionalInt16.isEmpty();
        boolean boolean22 = optionalInt16.isEmpty();
        boolean boolean23 = optionalInt7.equals((java.lang.Object) optionalInt16);
        int int24 = optionalInt7.orElseThrow();
        boolean boolean25 = optionalInt7.isEmpty();
        boolean boolean26 = optionalInt1.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        int int15 = optionalInt6.orElse(10);
        java.util.stream.IntStream intStream16 = optionalInt6.stream();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        int int15 = optionalInt1.orElseThrow();
        boolean boolean16 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        java.lang.Class<?> wildcardClass12 = intStream11.getClass();
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt11.ifPresentOrElse(intConsumer13, runnable14);
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.lang.String str12 = optionalInt1.toString();
        int int13 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        boolean boolean20 = optionalInt10.isPresent();
        java.lang.String str21 = optionalInt10.toString();
        java.lang.String str22 = optionalInt10.toString();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OptionalInt[-1]" + "'", str22, "OptionalInt[-1]");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        int int15 = optionalInt1.orElse((int) '4');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        boolean boolean17 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream18 = optionalInt1.stream();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isPresent();
        boolean boolean11 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        int int11 = optionalInt1.orElse((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt11.orElseGet(intSupplier17);
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        boolean boolean26 = optionalInt20.isEmpty();
        boolean boolean27 = optionalInt11.equals((java.lang.Object) optionalInt20);
        java.lang.String str28 = optionalInt11.toString();
        boolean boolean29 = optionalInt1.equals((java.lang.Object) str28);
        java.util.function.IntConsumer intConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer30);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OptionalInt[-1]" + "'", str28, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        boolean boolean4 = optionalInt0.isEmpty();
        boolean boolean5 = optionalInt0.isEmpty();
        boolean boolean6 = optionalInt0.isPresent();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.lang.String str8 = optionalInt1.toString();
        java.lang.String str9 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[-1]" + "'", str9, "OptionalInt[-1]");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        boolean boolean7 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.util.function.IntSupplier intSupplier22 = null;
        int int23 = optionalInt9.orElseGet(intSupplier22);
        int int25 = optionalInt9.orElse((int) '#');
        boolean boolean26 = optionalInt9.isPresent();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        boolean boolean7 = optionalInt1.equals((java.lang.Object) (short) 1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) (short) -1);
        int int12 = optionalInt1.orElse((int) (byte) 1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        int int14 = optionalInt11.getAsInt();
        int int15 = optionalInt11.getAsInt();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt11.orElseGet(intSupplier16);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.String str14 = optionalInt1.toString();
        java.lang.String str15 = optionalInt1.toString();
        int int17 = optionalInt1.orElse((int) (short) 100);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[-1]" + "'", str14, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[-1]" + "'", str15, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        java.lang.Class<?> wildcardClass13 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int2 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        boolean boolean6 = optionalInt4.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt4.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        boolean boolean10 = optionalInt4.equals((java.lang.Object) optionalInt9);
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt12.orElseGet(intSupplier13);
        java.util.stream.IntStream intStream15 = optionalInt12.stream();
        boolean boolean16 = optionalInt9.equals((java.lang.Object) intStream15);
        boolean boolean17 = optionalInt9.isEmpty();
        boolean boolean18 = optionalInt1.equals((java.lang.Object) optionalInt9);
        boolean boolean19 = optionalInt9.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt6.orElse(32);
        java.util.function.IntConsumer intConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt6.ifPresentOrElse(intConsumer10, runnable11);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.lang.String str6 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[0]" + "'", str6, "OptionalInt[0]");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.lang.String str16 = optionalInt1.toString();
        java.util.stream.IntStream intStream17 = optionalInt1.stream();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalInt[0]" + "'", str16, "OptionalInt[0]");
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        boolean boolean16 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        boolean boolean3 = optionalInt0.isEmpty();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt5.orElseGet(intSupplier6);
        java.util.stream.IntStream intStream8 = optionalInt5.stream();
        java.util.stream.IntStream intStream9 = optionalInt5.stream();
        int int10 = optionalInt5.orElseThrow();
        boolean boolean11 = optionalInt5.isPresent();
        boolean boolean13 = optionalInt5.equals((java.lang.Object) "OptionalInt[10]");
        int int15 = optionalInt5.orElse((int) (byte) -1);
        int int17 = optionalInt5.orElse(32);
        java.lang.String str18 = optionalInt5.toString();
        boolean boolean19 = optionalInt5.isEmpty();
        int int20 = optionalInt5.getAsInt();
        int int21 = optionalInt5.orElseThrow();
        boolean boolean22 = optionalInt0.equals((java.lang.Object) int21);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[0]" + "'", str18, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream12 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        boolean boolean4 = optionalInt1.isEmpty();
        int int5 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        int int11 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int8 = optionalInt1.orElse(32);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.lang.String str3 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        int int7 = optionalInt0.orElse(10);
        java.lang.Class<?> wildcardClass8 = optionalInt0.getClass();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt.empty" + "'", str3, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.orElseThrow();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        boolean boolean7 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElse((int) '#');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isPresent();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.function.IntConsumer intConsumer5 = null;
        optionalInt0.ifPresent(intConsumer5);
        java.lang.String str7 = optionalInt0.toString();
        java.lang.String str8 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt.empty" + "'", str7, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
        java.lang.String str10 = optionalInt1.toString();
        int int12 = optionalInt1.orElse((int) '4');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        int int10 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElse((int) (short) 10);
        boolean boolean13 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        int int13 = optionalInt0.orElse(100);
        boolean boolean14 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt.empty" + "'", str9, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        java.lang.String str6 = optionalInt1.toString();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt8.orElseGet(intSupplier9);
        java.lang.String str11 = optionalInt8.toString();
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt8.orElseGet(intSupplier12);
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream16 = optionalInt15.stream();
        boolean boolean17 = optionalInt15.isEmpty();
        boolean boolean19 = optionalInt15.equals((java.lang.Object) 0.0f);
        java.lang.String str20 = optionalInt15.toString();
        boolean boolean21 = optionalInt8.equals((java.lang.Object) str20);
        boolean boolean22 = optionalInt1.equals((java.lang.Object) boolean21);
        java.util.function.IntSupplier intSupplier23 = null;
        int int24 = optionalInt1.orElseGet(intSupplier23);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[10]" + "'", str6, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[10]" + "'", str11, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[-1]" + "'", str20, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.util.function.IntSupplier intSupplier22 = null;
        int int23 = optionalInt9.orElseGet(intSupplier22);
        boolean boolean24 = optionalInt9.isPresent();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = optionalInt0.getAsInt();
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
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        java.lang.String str3 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream9 = optionalInt8.stream();
        boolean boolean10 = optionalInt8.isEmpty();
        boolean boolean12 = optionalInt8.equals((java.lang.Object) 0.0f);
        java.lang.String str13 = optionalInt8.toString();
        boolean boolean14 = optionalInt1.equals((java.lang.Object) str13);
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of(0);
        int int17 = optionalInt16.getAsInt();
        int int18 = optionalInt16.orElseThrow();
        int int19 = optionalInt16.getAsInt();
        int int20 = optionalInt16.orElseThrow();
        java.util.stream.IntStream intStream21 = optionalInt16.stream();
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt16);
        java.util.stream.IntStream intStream23 = optionalInt16.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        int int3 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.isPresent();
        boolean boolean5 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.util.function.IntConsumer intConsumer19 = null;
        optionalInt6.ifPresent(intConsumer19);
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
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        int int5 = optionalInt4.getAsInt();
        boolean boolean7 = optionalInt4.equals((java.lang.Object) (-1));
        java.lang.String str8 = optionalInt4.toString();
        java.util.stream.IntStream intStream9 = optionalInt4.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) intStream9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.util.function.IntConsumer intConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt6.ifPresentOrElse(intConsumer15, runnable16);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt7.orElseGet(intSupplier8);
        java.util.stream.IntStream intStream10 = optionalInt7.stream();
        java.lang.String str11 = optionalInt7.toString();
        java.util.stream.IntStream intStream12 = optionalInt7.stream();
        boolean boolean13 = optionalInt1.equals((java.lang.Object) optionalInt7);
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt7.orElseGet(intSupplier14);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[10]" + "'", str11, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        int int14 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt1.orElseGet(intSupplier15);
        int int17 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean8 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        boolean boolean6 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt1.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier20 = null;
        int int21 = optionalInt19.orElseGet(intSupplier20);
        int int23 = optionalInt19.orElse((int) (short) 10);
        java.lang.String str24 = optionalInt19.toString();
        boolean boolean25 = optionalInt19.isPresent();
        int int26 = optionalInt19.orElseThrow();
        java.util.OptionalInt optionalInt28 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream29 = optionalInt28.stream();
        boolean boolean30 = optionalInt28.isEmpty();
        boolean boolean32 = optionalInt28.equals((java.lang.Object) 0.0f);
        boolean boolean33 = optionalInt28.isEmpty();
        java.util.function.IntSupplier intSupplier34 = null;
        int int35 = optionalInt28.orElseGet(intSupplier34);
        java.util.OptionalInt optionalInt37 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream38 = optionalInt37.stream();
        boolean boolean39 = optionalInt37.isEmpty();
        boolean boolean41 = optionalInt37.equals((java.lang.Object) 0.0f);
        boolean boolean42 = optionalInt37.isEmpty();
        boolean boolean43 = optionalInt37.isEmpty();
        boolean boolean44 = optionalInt28.equals((java.lang.Object) optionalInt37);
        int int46 = optionalInt37.orElse((int) (short) 1);
        boolean boolean47 = optionalInt19.equals((java.lang.Object) optionalInt37);
        java.util.OptionalInt optionalInt49 = java.util.OptionalInt.of(1);
        boolean boolean50 = optionalInt49.isPresent();
        java.util.function.IntSupplier intSupplier51 = null;
        int int52 = optionalInt49.orElseGet(intSupplier51);
        int int53 = optionalInt49.orElseThrow();
        int int54 = optionalInt49.getAsInt();
        boolean boolean55 = optionalInt37.equals((java.lang.Object) optionalInt49);
        java.util.stream.IntStream intStream56 = optionalInt37.stream();
        boolean boolean57 = optionalInt1.equals((java.lang.Object) intStream56);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OptionalInt[1]" + "'", str24, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(optionalInt28);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(optionalInt37);
        org.junit.Assert.assertNotNull(intStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(optionalInt49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        boolean boolean35 = optionalInt31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalInt31.isEmpty();
        java.util.function.IntSupplier intSupplier37 = null;
        int int38 = optionalInt31.orElseGet(intSupplier37);
        java.util.OptionalInt optionalInt40 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream41 = optionalInt40.stream();
        boolean boolean42 = optionalInt40.isEmpty();
        boolean boolean44 = optionalInt40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalInt40.isEmpty();
        boolean boolean46 = optionalInt40.isEmpty();
        boolean boolean47 = optionalInt31.equals((java.lang.Object) optionalInt40);
        boolean boolean48 = optionalInt7.equals((java.lang.Object) optionalInt40);
        boolean boolean49 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier50 = null;
        int int51 = optionalInt7.orElseGet(intSupplier50);
        java.util.function.IntConsumer intConsumer52 = null;
        java.lang.Runnable runnable53 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt7.ifPresentOrElse(intConsumer52, runnable53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(optionalInt40);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt10.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt10.toString();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt10.orElseGet(intSupplier14);
        boolean boolean16 = optionalInt1.equals((java.lang.Object) int15);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[10]" + "'", str13, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        int int5 = optionalInt1.orElse((int) (byte) 0);
        int int6 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        boolean boolean35 = optionalInt31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalInt31.isEmpty();
        java.util.function.IntSupplier intSupplier37 = null;
        int int38 = optionalInt31.orElseGet(intSupplier37);
        java.util.OptionalInt optionalInt40 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream41 = optionalInt40.stream();
        boolean boolean42 = optionalInt40.isEmpty();
        boolean boolean44 = optionalInt40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalInt40.isEmpty();
        boolean boolean46 = optionalInt40.isEmpty();
        boolean boolean47 = optionalInt31.equals((java.lang.Object) optionalInt40);
        boolean boolean48 = optionalInt7.equals((java.lang.Object) optionalInt40);
        boolean boolean49 = optionalInt7.isEmpty();
        java.util.stream.IntStream intStream50 = optionalInt7.stream();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(optionalInt40);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intStream50);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        java.util.function.IntSupplier intSupplier19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = optionalInt6.orElseGet(intSupplier19);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        int int8 = optionalInt1.orElse(0);
        int int9 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt1.orElseGet(intSupplier12);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        int int11 = optionalInt1.orElse((int) ' ');
        boolean boolean12 = optionalInt1.isPresent();
        boolean boolean13 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        boolean boolean19 = optionalInt1.isEmpty();
        int int20 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        boolean boolean18 = optionalInt8.isEmpty();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt20.orElseGet(intSupplier21);
        java.util.stream.IntStream intStream23 = optionalInt20.stream();
        java.util.stream.IntStream intStream24 = optionalInt20.stream();
        boolean boolean25 = optionalInt8.equals((java.lang.Object) optionalInt20);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        int int10 = optionalInt1.orElse((int) '#');
        java.lang.String str11 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[1]" + "'", str11, "OptionalInt[1]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        boolean boolean4 = optionalInt0.isPresent();
        boolean boolean5 = optionalInt0.isPresent();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElseThrow();
        int int8 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        int int18 = optionalInt1.orElseThrow();
        boolean boolean19 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.lang.String str31 = optionalInt21.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OptionalInt[-1]" + "'", str31, "OptionalInt[-1]");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream14 = optionalInt13.stream();
        boolean boolean15 = optionalInt13.isEmpty();
        int int16 = optionalInt13.getAsInt();
        java.lang.Object obj17 = null;
        boolean boolean18 = optionalInt13.equals(obj17);
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt13.orElseGet(intSupplier19);
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt13.orElseGet(intSupplier21);
        boolean boolean23 = optionalInt1.equals((java.lang.Object) int22);
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
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt10.orElseGet(intSupplier11);
        int int14 = optionalInt10.orElse((int) (short) 10);
        java.lang.String str15 = optionalInt10.toString();
        int int16 = optionalInt10.orElseThrow();
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of(10);
        boolean boolean19 = optionalInt10.equals((java.lang.Object) optionalInt18);
        boolean boolean20 = optionalInt1.equals((java.lang.Object) boolean19);
        boolean boolean21 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer22);
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
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[1]" + "'", str15, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt5.orElseGet(intSupplier6);
        int int9 = optionalInt5.orElse((int) (short) 10);
        java.lang.String str10 = optionalInt5.toString();
        boolean boolean11 = optionalInt5.isPresent();
        int int12 = optionalInt5.orElseThrow();
        boolean boolean13 = optionalInt5.isPresent();
        boolean boolean14 = optionalInt5.isPresent();
        boolean boolean15 = optionalInt1.equals((java.lang.Object) optionalInt5);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[1]" + "'", str10, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElseThrow();
        boolean boolean10 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass11 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream5 = optionalInt4.stream();
        java.util.stream.IntStream intStream6 = optionalInt4.stream();
        java.util.stream.IntStream intStream7 = optionalInt4.stream();
        int int9 = optionalInt4.orElse(10);
        boolean boolean10 = optionalInt4.isEmpty();
        boolean boolean11 = optionalInt4.isEmpty();
        boolean boolean12 = optionalInt4.isPresent();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream14 = optionalInt13.stream();
        boolean boolean15 = optionalInt4.equals((java.lang.Object) intStream14);
        boolean boolean16 = optionalInt0.equals((java.lang.Object) optionalInt4);
        java.util.stream.IntStream intStream17 = optionalInt4.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        boolean boolean8 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer9 = null;
        optionalInt0.ifPresent(intConsumer9);
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt1.orElseThrow();
        int int12 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        boolean boolean13 = optionalInt1.isEmpty();
        boolean boolean14 = optionalInt1.isPresent();
        boolean boolean15 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) ' ');
        java.util.stream.IntStream intStream17 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) (short) -1);
        int int12 = optionalInt11.getAsInt();
        boolean boolean14 = optionalInt11.equals((java.lang.Object) (-1));
        java.lang.String str15 = optionalInt11.toString();
        boolean boolean16 = optionalInt11.isEmpty();
        int int18 = optionalInt11.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream19 = optionalInt11.stream();
        boolean boolean20 = optionalInt11.isEmpty();
        java.lang.String str21 = optionalInt11.toString();
        java.util.OptionalInt optionalInt23 = java.util.OptionalInt.of(1);
        boolean boolean25 = optionalInt23.equals((java.lang.Object) (short) -1);
        boolean boolean26 = optionalInt11.equals((java.lang.Object) (short) -1);
        boolean boolean27 = optionalInt1.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[-1]" + "'", str15, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        boolean boolean9 = optionalInt1.isPresent();
        int int11 = optionalInt1.orElse((int) (byte) 100);
        java.lang.String str12 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        int int20 = optionalInt1.getAsInt();
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream9 = optionalInt8.stream();
        java.util.stream.IntStream intStream10 = optionalInt8.stream();
        java.util.function.IntConsumer intConsumer11 = null;
        optionalInt8.ifPresent(intConsumer11);
        java.util.stream.IntStream intStream13 = optionalInt8.stream();
        int int15 = optionalInt8.orElse((int) 'a');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) int15);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        boolean boolean30 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt32 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream33 = optionalInt32.stream();
        boolean boolean34 = optionalInt32.isEmpty();
        boolean boolean36 = optionalInt32.equals((java.lang.Object) 0.0f);
        boolean boolean37 = optionalInt32.isEmpty();
        boolean boolean38 = optionalInt32.isEmpty();
        boolean boolean40 = optionalInt32.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream41 = optionalInt32.stream();
        java.lang.String str42 = optionalInt32.toString();
        boolean boolean43 = optionalInt32.isPresent();
        java.util.stream.IntStream intStream44 = optionalInt32.stream();
        boolean boolean45 = optionalInt1.equals((java.lang.Object) optionalInt32);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(optionalInt32);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "OptionalInt[-1]" + "'", str42, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt6.orElse(32);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) 'a');
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream13 = optionalInt12.stream();
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of((int) (short) -1);
        int int16 = optionalInt15.getAsInt();
        boolean boolean18 = optionalInt15.equals((java.lang.Object) (-1));
        boolean boolean19 = optionalInt12.equals((java.lang.Object) boolean18);
        int int21 = optionalInt12.orElse((int) (short) 0);
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
        boolean boolean41 = optionalInt12.equals((java.lang.Object) optionalInt23);
        boolean boolean42 = optionalInt11.equals((java.lang.Object) optionalInt23);
        boolean boolean43 = optionalInt6.equals((java.lang.Object) optionalInt23);
        java.lang.String str44 = optionalInt23.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "OptionalInt[-1]" + "'", str44, "OptionalInt[-1]");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        boolean boolean6 = optionalInt1.isEmpty();
        java.lang.String str7 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        boolean boolean15 = optionalInt0.isPresent();
        java.util.stream.IntStream intStream16 = optionalInt0.stream();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElseThrow();
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
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        java.util.stream.IntStream intStream19 = optionalInt6.stream();
        java.lang.String str20 = optionalInt6.toString();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream23 = optionalInt22.stream();
        boolean boolean24 = optionalInt22.isEmpty();
        boolean boolean25 = optionalInt22.isPresent();
        int int26 = optionalInt22.getAsInt();
        java.util.function.IntSupplier intSupplier27 = null;
        int int28 = optionalInt22.orElseGet(intSupplier27);
        boolean boolean30 = optionalInt22.equals((java.lang.Object) '#');
        java.lang.String str31 = optionalInt22.toString();
        boolean boolean32 = optionalInt22.isPresent();
        java.util.OptionalInt optionalInt34 = java.util.OptionalInt.of((int) (short) -1);
        int int35 = optionalInt34.getAsInt();
        boolean boolean37 = optionalInt34.equals((java.lang.Object) (-1));
        java.lang.String str38 = optionalInt34.toString();
        boolean boolean39 = optionalInt34.isEmpty();
        boolean boolean40 = optionalInt22.equals((java.lang.Object) optionalInt34);
        boolean boolean41 = optionalInt6.equals((java.lang.Object) optionalInt22);
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
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt.empty" + "'", str20, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OptionalInt[-1]" + "'", str31, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(optionalInt34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "OptionalInt[-1]" + "'", str38, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        int int19 = optionalInt1.orElseThrow();
        int int21 = optionalInt1.orElse((int) (short) 100);
        boolean boolean22 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.util.stream.IntStream intStream19 = optionalInt6.stream();
        int int21 = optionalInt6.orElse((int) '#');
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
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        boolean boolean4 = optionalInt0.isEmpty();
        int int6 = optionalInt0.orElse((int) (byte) 1);
        int int8 = optionalInt0.orElse(97);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        java.lang.String str11 = optionalInt1.toString();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of(1);
        boolean boolean15 = optionalInt13.equals((java.lang.Object) (short) -1);
        boolean boolean16 = optionalInt1.equals((java.lang.Object) (short) -1);
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt1.orElseGet(intSupplier17);
        java.lang.Class<?> wildcardClass19 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 1);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[1]" + "'", str2, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        int int14 = optionalInt11.orElseThrow();
        int int15 = optionalInt11.getAsInt();
        int int17 = optionalInt11.orElse(52);
        java.util.function.IntSupplier intSupplier18 = null;
        int int19 = optionalInt11.orElseGet(intSupplier18);
        java.lang.String str20 = optionalInt11.toString();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[52]" + "'", str20, "OptionalInt[52]");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        int int14 = optionalInt11.orElseThrow();
        boolean boolean15 = optionalInt11.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        int int15 = optionalInt1.orElse(0);
        int int17 = optionalInt1.orElse((int) '#');
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        boolean boolean19 = optionalInt0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = optionalInt0.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        java.lang.Object obj5 = null;
        boolean boolean6 = optionalInt1.equals(obj5);
        int int8 = optionalInt1.orElse((-1));
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        int int7 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        int int11 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        int int9 = optionalInt1.orElseThrow();
        int int11 = optionalInt1.orElse((int) (short) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        java.lang.String str8 = optionalInt1.toString();
        int int10 = optionalInt1.orElse(97);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        boolean boolean2 = optionalInt0.isPresent();
        int int4 = optionalInt0.orElse((int) (short) 1);
        java.lang.String str5 = optionalInt0.toString();
        java.lang.String str6 = optionalInt0.toString();
        java.util.function.IntConsumer intConsumer7 = null;
        optionalInt0.ifPresent(intConsumer7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of(10);
        java.lang.String str11 = optionalInt10.toString();
        int int12 = optionalInt10.orElseThrow();
        java.util.stream.IntStream intStream13 = optionalInt10.stream();
        int int15 = optionalInt10.orElse((int) (byte) 0);
        int int17 = optionalInt10.orElse((int) (short) 0);
        boolean boolean18 = optionalInt0.equals((java.lang.Object) optionalInt10);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt.empty" + "'", str5, "OptionalInt.empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt.empty" + "'", str6, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[10]" + "'", str11, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        int int7 = optionalInt1.orElse((int) (short) 0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        java.lang.String str14 = optionalInt1.toString();
        boolean boolean15 = optionalInt1.isEmpty();
        int int16 = optionalInt1.getAsInt();
        boolean boolean17 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[0]" + "'", str14, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int3 = optionalInt1.orElse((int) '4');
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElse((int) (byte) 100);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 1);
        java.lang.String str2 = optionalInt1.toString();
        java.lang.String str3 = optionalInt1.toString();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[1]" + "'", str2, "OptionalInt[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[1]" + "'", str3, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt15.orElseGet(intSupplier16);
        int int19 = optionalInt15.orElse((int) (short) 10);
        java.lang.String str20 = optionalInt15.toString();
        boolean boolean21 = optionalInt15.isPresent();
        boolean boolean22 = optionalInt15.isPresent();
        java.util.function.IntSupplier intSupplier23 = null;
        int int24 = optionalInt15.orElseGet(intSupplier23);
        boolean boolean25 = optionalInt1.equals((java.lang.Object) intSupplier23);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[1]" + "'", str20, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        int int9 = optionalInt8.getAsInt();
        boolean boolean11 = optionalInt8.equals((java.lang.Object) (-1));
        java.lang.String str12 = optionalInt8.toString();
        int int13 = optionalInt8.getAsInt();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt8.orElseGet(intSupplier14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt8);
        boolean boolean18 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        boolean boolean10 = optionalInt1.isPresent();
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
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        int int5 = optionalInt4.getAsInt();
        boolean boolean7 = optionalInt4.equals((java.lang.Object) (-1));
        java.lang.String str8 = optionalInt4.toString();
        int int9 = optionalInt4.getAsInt();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt4.orElseGet(intSupplier10);
        java.util.stream.IntStream intStream12 = optionalInt4.stream();
        boolean boolean13 = optionalInt4.isEmpty();
        int int14 = optionalInt4.getAsInt();
        int int15 = optionalInt4.orElseThrow();
        int int16 = optionalInt4.orElseThrow();
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of((-1));
        boolean boolean19 = optionalInt4.equals((java.lang.Object) (-1));
        boolean boolean20 = optionalInt0.equals((java.lang.Object) (-1));
        boolean boolean21 = optionalInt0.isEmpty();
        java.util.function.IntSupplier intSupplier22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = optionalInt0.orElseGet(intSupplier22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt3.orElseGet(intSupplier4);
        int int7 = optionalInt3.orElse(0);
        boolean boolean8 = optionalInt3.isEmpty();
        java.util.stream.IntStream intStream9 = optionalInt3.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt3);
        int int11 = optionalInt3.orElseThrow();
        boolean boolean12 = optionalInt3.isEmpty();
        java.lang.Class<?> wildcardClass13 = optionalInt3.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        boolean boolean6 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        boolean boolean7 = optionalInt1.equals((java.lang.Object) (short) 1);
        boolean boolean8 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.isPresent();
        int int11 = optionalInt1.orElse((int) '4');
        int int12 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.util.stream.IntStream intStream19 = optionalInt10.stream();
        java.lang.Class<?> wildcardClass20 = optionalInt10.getClass();
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
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        int int13 = optionalInt0.orElse((int) '4');
        int int15 = optionalInt0.orElse(52);
        java.lang.Class<?> wildcardClass16 = optionalInt0.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt10.orElseGet(intSupplier11);
        int int14 = optionalInt10.orElse((int) (short) 10);
        java.lang.String str15 = optionalInt10.toString();
        int int16 = optionalInt10.orElseThrow();
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of(10);
        boolean boolean19 = optionalInt10.equals((java.lang.Object) optionalInt18);
        boolean boolean20 = optionalInt1.equals((java.lang.Object) boolean19);
        int int22 = optionalInt1.orElse(0);
        int int23 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier24 = null;
        int int25 = optionalInt1.orElseGet(intSupplier24);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[1]" + "'", str15, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        boolean boolean19 = optionalInt0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = optionalInt0.orElseThrow();
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
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        int int10 = optionalInt7.getAsInt();
        java.lang.String str11 = optionalInt7.toString();
        boolean boolean12 = optionalInt1.equals((java.lang.Object) optionalInt7);
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.lang.String str10 = optionalInt1.toString();
        int int12 = optionalInt1.orElse((int) ' ');
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[1]" + "'", str10, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt15.orElseGet(intSupplier16);
        int int19 = optionalInt15.orElse((int) (short) 10);
        java.lang.String str20 = optionalInt15.toString();
        int int21 = optionalInt15.orElseThrow();
        java.util.OptionalInt optionalInt23 = java.util.OptionalInt.of(10);
        boolean boolean24 = optionalInt15.equals((java.lang.Object) optionalInt23);
        java.lang.Object obj25 = null;
        boolean boolean26 = optionalInt23.equals(obj25);
        boolean boolean27 = optionalInt23.isEmpty();
        boolean boolean28 = optionalInt1.equals((java.lang.Object) optionalInt23);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[1]" + "'", str20, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(optionalInt23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt1.orElseGet(intSupplier13);
        int int15 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        java.lang.Object obj5 = null;
        boolean boolean6 = optionalInt1.equals(obj5);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of((int) (short) -1);
        int int10 = optionalInt9.getAsInt();
        boolean boolean12 = optionalInt9.equals((java.lang.Object) (-1));
        java.lang.String str13 = optionalInt9.toString();
        int int14 = optionalInt9.getAsInt();
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt9.orElseGet(intSupplier15);
        java.util.stream.IntStream intStream17 = optionalInt9.stream();
        boolean boolean18 = optionalInt9.isEmpty();
        int int19 = optionalInt9.getAsInt();
        int int20 = optionalInt9.orElseThrow();
        boolean boolean21 = optionalInt9.isEmpty();
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.String str23 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalInt[-1]" + "'", str23, "OptionalInt[-1]");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        int int11 = optionalInt1.getAsInt();
        boolean boolean12 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.Object obj19 = null;
        boolean boolean20 = optionalInt1.equals(obj19);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        boolean boolean5 = optionalInt1.isEmpty();
        int int6 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        int int2 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        int int9 = optionalInt1.orElse((int) ' ');
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
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = optionalInt6.orElseThrow();
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
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        java.lang.String str6 = optionalInt1.toString();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt8.orElseGet(intSupplier9);
        java.lang.String str11 = optionalInt8.toString();
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt8.orElseGet(intSupplier12);
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream16 = optionalInt15.stream();
        boolean boolean17 = optionalInt15.isEmpty();
        boolean boolean19 = optionalInt15.equals((java.lang.Object) 0.0f);
        java.lang.String str20 = optionalInt15.toString();
        boolean boolean21 = optionalInt8.equals((java.lang.Object) str20);
        boolean boolean22 = optionalInt1.equals((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[10]" + "'", str6, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[10]" + "'", str11, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[-1]" + "'", str20, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int4 = optionalInt1.orElseThrow();
        boolean boolean5 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.String str19 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass20 = optionalInt1.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass6 = intStream5.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream23 = optionalInt22.stream();
        boolean boolean24 = optionalInt22.isEmpty();
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt22.orElseGet(intSupplier25);
        java.util.OptionalInt optionalInt27 = java.util.OptionalInt.empty();
        boolean boolean28 = optionalInt22.equals((java.lang.Object) optionalInt27);
        int int30 = optionalInt22.orElse((int) (byte) 1);
        boolean boolean31 = optionalInt22.isEmpty();
        boolean boolean32 = optionalInt1.equals((java.lang.Object) optionalInt22);
        boolean boolean33 = optionalInt22.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(optionalInt27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isEmpty();
        int int13 = optionalInt1.orElse((int) '4');
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.util.stream.IntStream intStream14 = optionalInt1.stream();
        java.util.stream.IntStream intStream15 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt1.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntSupplier intSupplier20 = null;
        int int21 = optionalInt19.orElseGet(intSupplier20);
        int int23 = optionalInt19.orElse((int) (byte) 1);
        int int24 = optionalInt19.orElseThrow();
        boolean boolean25 = optionalInt1.equals((java.lang.Object) optionalInt19);
        int int26 = optionalInt19.orElseThrow();
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
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) (short) 100);
        int int9 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of(35);
        boolean boolean21 = optionalInt1.equals((java.lang.Object) optionalInt20);
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
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        boolean boolean8 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of((int) (short) -1);
        int int10 = optionalInt9.getAsInt();
        boolean boolean12 = optionalInt9.equals((java.lang.Object) (-1));
        java.lang.String str13 = optionalInt9.toString();
        boolean boolean14 = optionalInt9.isEmpty();
        int int16 = optionalInt9.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream17 = optionalInt9.stream();
        int int18 = optionalInt9.getAsInt();
        java.lang.String str19 = optionalInt9.toString();
        boolean boolean20 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int21 = optionalInt9.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
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
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        boolean boolean11 = optionalInt1.isEmpty();
        boolean boolean12 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        boolean boolean12 = optionalInt0.isEmpty();
        java.util.function.IntSupplier intSupplier13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = optionalInt0.orElseGet(intSupplier13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        int int6 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElseThrow();
        boolean boolean8 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        boolean boolean9 = optionalInt1.isEmpty();
        java.lang.String str10 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[0]" + "'", str10, "OptionalInt[0]");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt6.orElse(32);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = optionalInt6.getAsInt();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        java.lang.Object obj5 = null;
        boolean boolean6 = optionalInt1.equals(obj5);
        int int8 = optionalInt1.orElse(97);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 100);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(52);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        int int4 = optionalInt1.orElse((int) (byte) 100);
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.lang.Class<?> wildcardClass7 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        int int8 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.lang.String str10 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt.empty" + "'", str10, "OptionalInt.empty");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        boolean boolean13 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt15.orElseGet(intSupplier16);
        int int19 = optionalInt15.orElse((int) (short) 10);
        java.lang.String str20 = optionalInt15.toString();
        int int21 = optionalInt15.orElseThrow();
        java.util.OptionalInt optionalInt23 = java.util.OptionalInt.of(10);
        boolean boolean24 = optionalInt15.equals((java.lang.Object) optionalInt23);
        java.util.stream.IntStream intStream25 = optionalInt23.stream();
        boolean boolean26 = optionalInt1.equals((java.lang.Object) optionalInt23);
        java.util.OptionalInt optionalInt28 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier29 = null;
        int int30 = optionalInt28.orElseGet(intSupplier29);
        int int32 = optionalInt28.orElse((int) (short) 10);
        java.lang.String str33 = optionalInt28.toString();
        int int34 = optionalInt28.orElseThrow();
        java.util.OptionalInt optionalInt36 = java.util.OptionalInt.of((int) (short) -1);
        int int37 = optionalInt36.getAsInt();
        boolean boolean39 = optionalInt36.equals((java.lang.Object) (-1));
        java.lang.String str40 = optionalInt36.toString();
        int int41 = optionalInt36.getAsInt();
        java.util.function.IntSupplier intSupplier42 = null;
        int int43 = optionalInt36.orElseGet(intSupplier42);
        java.util.function.IntSupplier intSupplier44 = null;
        int int45 = optionalInt36.orElseGet(intSupplier44);
        java.util.stream.IntStream intStream46 = optionalInt36.stream();
        boolean boolean47 = optionalInt36.isEmpty();
        boolean boolean48 = optionalInt28.equals((java.lang.Object) optionalInt36);
        java.util.function.IntSupplier intSupplier49 = null;
        int int50 = optionalInt36.orElseGet(intSupplier49);
        boolean boolean51 = optionalInt1.equals((java.lang.Object) int50);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OptionalInt[1]" + "'", str20, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(optionalInt23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(optionalInt28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OptionalInt[1]" + "'", str33, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(optionalInt36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "OptionalInt[-1]" + "'", str40, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        int int6 = optionalInt1.orElse((int) (short) 1);
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        int int9 = optionalInt1.orElseThrow();
        int int10 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        java.lang.String str3 = optionalInt1.toString();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        int int8 = optionalInt1.getAsInt();
        int int10 = optionalInt1.orElse(10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        int int40 = optionalInt1.orElse(1);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 1);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.lang.String str5 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[1]" + "'", str2, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[1]" + "'", str5, "OptionalInt[1]");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        int int5 = optionalInt1.orElse(10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        int int15 = optionalInt5.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.lang.String str8 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[32]" + "'", str8, "OptionalInt[32]");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        int int6 = optionalInt1.orElse(0);
        int int7 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) "OptionalInt[10]");
        int int11 = optionalInt1.orElse((int) (byte) -1);
        java.lang.String str12 = optionalInt1.toString();
        boolean boolean13 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[0]" + "'", str12, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) '#');
        int int8 = optionalInt6.orElse((int) '4');
        java.lang.String str9 = optionalInt6.toString();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean12 = optionalInt1.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[35]" + "'", str9, "OptionalInt[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        java.lang.String str4 = optionalInt1.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        java.util.function.IntConsumer intConsumer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.lang.String str12 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        boolean boolean15 = optionalInt0.isPresent();
        java.lang.Class<?> wildcardClass16 = optionalInt0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        int int14 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        boolean boolean19 = optionalInt16.isPresent();
        int int20 = optionalInt16.getAsInt();
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt16.orElseGet(intSupplier21);
        boolean boolean24 = optionalInt16.equals((java.lang.Object) '#');
        boolean boolean25 = optionalInt16.isPresent();
        java.util.stream.IntStream intStream26 = optionalInt16.stream();
        boolean boolean27 = optionalInt1.equals((java.lang.Object) optionalInt16);
        java.util.stream.IntStream intStream28 = optionalInt1.stream();
        boolean boolean29 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean8 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        boolean boolean17 = optionalInt6.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        int int16 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        java.util.function.IntConsumer intConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer24);
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
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        int int10 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        int int10 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.util.OptionalInt optionalInt31 = java.util.OptionalInt.of(1);
        boolean boolean32 = optionalInt31.isPresent();
        java.util.function.IntSupplier intSupplier33 = null;
        int int34 = optionalInt31.orElseGet(intSupplier33);
        int int35 = optionalInt31.orElseThrow();
        int int36 = optionalInt31.getAsInt();
        boolean boolean37 = optionalInt19.equals((java.lang.Object) optionalInt31);
        java.util.stream.IntStream intStream38 = optionalInt19.stream();
        java.lang.Class<?> wildcardClass39 = intStream38.getClass();
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
        org.junit.Assert.assertNotNull(optionalInt31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intStream38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        boolean boolean11 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        boolean boolean20 = optionalInt10.isPresent();
        int int21 = optionalInt10.getAsInt();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElse((int) (byte) 0);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer12);
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
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        java.lang.String str5 = optionalInt1.toString();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt7.orElseGet(intSupplier8);
        int int11 = optionalInt7.orElse((int) (short) 10);
        int int12 = optionalInt7.getAsInt();
        boolean boolean13 = optionalInt1.equals((java.lang.Object) optionalInt7);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[0]" + "'", str5, "OptionalInt[0]");
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = optionalInt6.orElseThrow();
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
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt10.orElseGet(intSupplier11);
        int int14 = optionalInt10.orElse((int) (short) 10);
        java.lang.String str15 = optionalInt10.toString();
        int int16 = optionalInt10.orElseThrow();
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of(10);
        boolean boolean19 = optionalInt10.equals((java.lang.Object) optionalInt18);
        boolean boolean20 = optionalInt1.equals((java.lang.Object) boolean19);
        int int22 = optionalInt1.orElse(0);
        int int23 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer24);
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
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt[1]" + "'", str15, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        int int14 = optionalInt11.getAsInt();
        java.util.stream.IntStream intStream15 = optionalInt11.stream();
        int int16 = optionalInt11.orElseThrow();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.util.stream.IntStream intStream39 = optionalInt1.stream();
        int int41 = optionalInt1.orElse((int) (short) -1);
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
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass4 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of(0);
        int int13 = optionalInt12.getAsInt();
        int int14 = optionalInt12.orElseThrow();
        int int15 = optionalInt12.getAsInt();
        int int16 = optionalInt12.orElseThrow();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt12.orElseGet(intSupplier17);
        boolean boolean19 = optionalInt12.isPresent();
        boolean boolean20 = optionalInt9.equals((java.lang.Object) optionalInt12);
        int int22 = optionalInt9.orElse((int) (byte) 0);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream25 = optionalInt24.stream();
        boolean boolean26 = optionalInt24.isEmpty();
        boolean boolean27 = optionalInt24.isPresent();
        java.util.stream.IntStream intStream28 = optionalInt24.stream();
        java.lang.Class<?> wildcardClass29 = optionalInt24.getClass();
        boolean boolean30 = optionalInt9.equals((java.lang.Object) optionalInt24);
        java.util.function.IntSupplier intSupplier31 = null;
        int int32 = optionalInt9.orElseGet(intSupplier31);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intStream28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt7.orElseGet(intSupplier8);
        int int11 = optionalInt7.orElse((int) (short) 10);
        java.lang.String str12 = optionalInt7.toString();
        boolean boolean13 = optionalInt7.isPresent();
        int int14 = optionalInt7.orElseThrow();
        java.util.stream.IntStream intStream15 = optionalInt7.stream();
        boolean boolean16 = optionalInt1.equals((java.lang.Object) intStream15);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) (short) 100);
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isEmpty();
        int int12 = optionalInt1.orElse(0);
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        boolean boolean7 = optionalInt0.isEmpty();
        boolean boolean8 = optionalInt0.isPresent();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream10 = optionalInt9.stream();
        boolean boolean11 = optionalInt0.equals((java.lang.Object) intStream10);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream9 = optionalInt8.stream();
        boolean boolean10 = optionalInt8.isEmpty();
        boolean boolean12 = optionalInt8.equals((java.lang.Object) 0.0f);
        java.lang.String str13 = optionalInt8.toString();
        boolean boolean14 = optionalInt1.equals((java.lang.Object) str13);
        boolean boolean15 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isEmpty();
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        boolean boolean8 = optionalInt0.isEmpty();
        boolean boolean9 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        boolean boolean13 = optionalInt1.isEmpty();
        boolean boolean14 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(52);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        int int4 = optionalInt1.orElse((int) (byte) 100);
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        int int7 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 1);
        java.lang.String str2 = optionalInt1.toString();
        boolean boolean3 = optionalInt1.isPresent();
        int int4 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[1]" + "'", str2, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(52);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        int int4 = optionalInt1.orElse((int) (byte) 100);
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.lang.String str6 = optionalInt1.toString();
        int int8 = optionalInt1.orElse((int) (byte) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[100]" + "'", str6, "OptionalInt[100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        boolean boolean5 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[-1]" + "'", str6, "OptionalInt[-1]");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        boolean boolean6 = optionalInt0.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt0.stream();
        boolean boolean8 = optionalInt0.isPresent();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.lang.String str7 = optionalInt1.toString();
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[10]" + "'", str7, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt5.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream8 = optionalInt5.stream();
        java.util.stream.IntStream intStream9 = optionalInt5.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt5);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        boolean boolean14 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        int int12 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier5 = null;
        int int6 = optionalInt1.orElseGet(intSupplier5);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream9 = optionalInt8.stream();
        boolean boolean10 = optionalInt8.isEmpty();
        boolean boolean12 = optionalInt8.equals((java.lang.Object) 0.0f);
        java.lang.String str13 = optionalInt8.toString();
        boolean boolean14 = optionalInt1.equals((java.lang.Object) str13);
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of(0);
        int int17 = optionalInt16.getAsInt();
        int int18 = optionalInt16.orElseThrow();
        int int19 = optionalInt16.getAsInt();
        int int20 = optionalInt16.orElseThrow();
        java.util.stream.IntStream intStream21 = optionalInt16.stream();
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt16);
        boolean boolean23 = optionalInt1.isEmpty();
        int int25 = optionalInt1.orElse(10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int12 = optionalInt9.orElseThrow();
        boolean boolean13 = optionalInt9.isPresent();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        int int8 = optionalInt1.orElse((int) (short) 0);
        int int10 = optionalInt1.orElse((int) 'a');
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.String str14 = optionalInt1.toString();
        boolean boolean15 = optionalInt1.isEmpty();
        int int16 = optionalInt1.getAsInt();
        java.lang.String str17 = optionalInt1.toString();
        java.util.stream.IntStream intStream18 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[0]" + "'", str14, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[0]" + "'", str17, "OptionalInt[0]");
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        int int14 = optionalInt1.orElse((int) (short) 1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        int int2 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt4 = java.util.OptionalInt.of((int) (short) -1);
        int int5 = optionalInt4.getAsInt();
        boolean boolean7 = optionalInt4.equals((java.lang.Object) (-1));
        java.lang.String str8 = optionalInt4.toString();
        java.util.stream.IntStream intStream9 = optionalInt4.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) intStream9);
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
        org.junit.Assert.assertNotNull(optionalInt4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.util.stream.IntStream intStream19 = optionalInt6.stream();
        java.util.function.IntConsumer intConsumer20 = null;
        optionalInt6.ifPresent(intConsumer20);
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
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str16 = optionalInt1.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalInt[1]" + "'", str16, "OptionalInt[1]");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        int int11 = optionalInt1.getAsInt();
        boolean boolean12 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        boolean boolean14 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt1.orElseThrow();
        int int12 = optionalInt1.getAsInt();
        int int13 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.lang.String str4 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt.empty" + "'", str4, "OptionalInt.empty");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(52);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        int int4 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.lang.String str10 = optionalInt1.toString();
        int int12 = optionalInt1.orElse((int) ' ');
        boolean boolean13 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[1]" + "'", str10, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        int int3 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.lang.Class<?> wildcardClass9 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.orElseThrow();
        int int7 = optionalInt1.orElse(0);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        boolean boolean14 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        int int40 = optionalInt1.orElse((int) (short) 10);
        boolean boolean41 = optionalInt1.isPresent();
        boolean boolean42 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        boolean boolean9 = optionalInt1.isEmpty();
        boolean boolean10 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.lang.String str4 = optionalInt1.toString();
        int int5 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[-1]" + "'", str4, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.orElseThrow();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean8 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElseThrow();
        java.lang.Class<?> wildcardClass10 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalInt.empty" + "'", str15, "OptionalInt.empty");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        java.lang.Object obj5 = null;
        boolean boolean6 = optionalInt1.equals(obj5);
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        int int8 = optionalInt1.getAsInt();
        int int9 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.String str13 = optionalInt1.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        int int45 = optionalInt42.orElse(0);
        java.util.function.IntSupplier intSupplier46 = null;
        int int47 = optionalInt42.orElseGet(intSupplier46);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        int int20 = optionalInt1.orElse((int) (byte) -1);
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElse((int) (byte) 10);
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Class<?> wildcardClass11 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        java.util.stream.IntStream intStream8 = optionalInt6.stream();
        java.util.stream.IntStream intStream9 = optionalInt6.stream();
        int int11 = optionalInt6.orElse(10);
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = optionalInt13.getClass();
        boolean boolean15 = optionalInt6.equals((java.lang.Object) optionalInt13);
        java.lang.Class<?> wildcardClass16 = optionalInt6.getClass();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) wildcardClass16);
        java.lang.String str18 = optionalInt1.toString();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt20.orElseGet(intSupplier21);
        java.util.stream.IntStream intStream23 = optionalInt20.stream();
        java.util.stream.IntStream intStream24 = optionalInt20.stream();
        boolean boolean25 = optionalInt1.equals((java.lang.Object) optionalInt20);
        java.lang.String str26 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[1]" + "'", str18, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OptionalInt[1]" + "'", str26, "OptionalInt[1]");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.orElseThrow();
        boolean boolean5 = optionalInt1.isPresent();
        int int6 = optionalInt1.getAsInt();
        int int8 = optionalInt1.orElse((int) (byte) 1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        java.lang.String str14 = optionalInt1.toString();
        boolean boolean15 = optionalInt1.isEmpty();
        int int16 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[0]" + "'", str14, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        int int18 = optionalInt1.getAsInt();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.lang.String str16 = optionalInt1.toString();
        java.lang.Class<?> wildcardClass17 = optionalInt1.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalInt[1]" + "'", str16, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        int int10 = optionalInt1.orElse((int) '#');
        boolean boolean11 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        int int8 = optionalInt1.orElse(1);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        boolean boolean2 = optionalInt1.isPresent();
        boolean boolean3 = optionalInt1.isPresent();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        boolean boolean2 = optionalInt1.isPresent();
        int int3 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        int int2 = optionalInt1.getAsInt();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.lang.String str8 = optionalInt1.toString();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[0]" + "'", str8, "OptionalInt[0]");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt1.orElseThrow();
        java.lang.String str12 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt5 = java.util.OptionalInt.of((int) ' ');
        boolean boolean6 = optionalInt5.isPresent();
        int int7 = optionalInt5.getAsInt();
        boolean boolean8 = optionalInt1.equals((java.lang.Object) optionalInt5);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(optionalInt5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        int int5 = optionalInt1.orElse((int) (byte) 0);
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = optionalInt1.equals(obj2);
        int int4 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        boolean boolean10 = optionalInt0.isPresent();
        boolean boolean11 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer12 = null;
        optionalInt0.ifPresent(intConsumer12);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        int int4 = optionalInt1.getAsInt();
        boolean boolean5 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) ' ');
        boolean boolean17 = optionalInt1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        java.lang.String str7 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        int int11 = optionalInt1.orElse((-1));
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 10);
        java.lang.String str2 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
    }
}

