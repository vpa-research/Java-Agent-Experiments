package org.huawei.optionaldouble;

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
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass3 = doubleStream2.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str2 = optionalDouble1.toString();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[100.0]" + "'", str2, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str2 = optionalDouble1.toString();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[100.0]" + "'", str2, "OptionalDouble[100.0]");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double2 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.lang.Class<?> wildcardClass6 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = optionalDouble0.orElseGet(doubleSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble10.ifPresent(doubleConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.function.DoubleConsumer doubleConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble6.ifPresentOrElse(doubleConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = optionalDouble6.orElseGet(doubleSupplier14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = optionalDouble6.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10.0f);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) boolean6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        boolean boolean10 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100);
        java.lang.Class<?> wildcardClass2 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleConsumer doubleConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble6.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.lang.Class<?> wildcardClass8 = optionalDouble7.getClass();
        boolean boolean9 = optionalDouble0.equals((java.lang.Object) optionalDouble7);
        boolean boolean10 = optionalDouble7.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.lang.Class<?> wildcardClass8 = optionalDouble7.getClass();
        boolean boolean9 = optionalDouble0.equals((java.lang.Object) optionalDouble7);
        java.lang.Class<?> wildcardClass10 = optionalDouble7.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.lang.Class<?> wildcardClass18 = optionalDouble10.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        boolean boolean7 = optionalDouble1.isPresent();
        boolean boolean8 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass9 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        boolean boolean18 = optionalDouble10.isPresent();
        java.util.function.DoubleConsumer doubleConsumer19 = null;
        java.lang.Runnable runnable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble10.ifPresentOrElse(doubleConsumer19, runnable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        java.util.function.DoubleConsumer doubleConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        java.lang.Class<?> wildcardClass7 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        boolean boolean3 = optionalDouble0.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble19 = java.util.OptionalDouble.empty();
        java.lang.Class<?> wildcardClass20 = optionalDouble19.getClass();
        boolean boolean21 = optionalDouble1.equals((java.lang.Object) optionalDouble19);
        boolean boolean22 = optionalDouble19.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble19 = java.util.OptionalDouble.empty();
        java.lang.Class<?> wildcardClass20 = optionalDouble19.getClass();
        boolean boolean21 = optionalDouble1.equals((java.lang.Object) optionalDouble19);
        java.util.function.DoubleConsumer doubleConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble19.ifPresentOrElse(doubleConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean1 = optionalDouble0.isPresent();
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = optionalDouble0.orElseGet(doubleSupplier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        boolean boolean7 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        double double8 = optionalDouble1.orElse((double) 1);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.lang.Class<?> wildcardClass2 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        boolean boolean3 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.lang.Class<?> wildcardClass8 = optionalDouble7.getClass();
        boolean boolean9 = optionalDouble0.equals((java.lang.Object) optionalDouble7);
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.lang.String str1 = optionalDouble0.toString();
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = optionalDouble0.orElseGet(doubleSupplier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OptionalDouble.empty" + "'", str1, "OptionalDouble.empty");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass5 = doubleStream4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass11 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        double double3 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 0L);
        java.lang.Class<?> wildcardClass2 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isPresent();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.lang.String str14 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble[100.0]" + "'", str14, "OptionalDouble[100.0]");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1.0f));
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 0);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean7 = optionalDouble3.equals((java.lang.Object) 0.0f);
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble3);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble3.ifPresentOrElse(doubleConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.lang.Class<?> wildcardClass2 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        double double12 = optionalDouble4.orElseThrow();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        double double15 = optionalDouble1.orElse((double) 0L);
        java.util.stream.DoubleStream doubleStream16 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) boolean6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        boolean boolean10 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = optionalDouble0.orElseGet(doubleSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.Class<?> wildcardClass16 = optionalDouble5.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        java.lang.String str8 = optionalDouble1.toString();
        java.lang.Class<?> wildcardClass9 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalDouble[100.0]" + "'", str8, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble1.orElseGet(doubleSupplier21);
        boolean boolean23 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass24 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double4 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass5 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isPresent();
        double double7 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double19 = optionalDouble1.orElseThrow();
        double double20 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.stream.DoubleStream doubleStream22 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream22);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier25 = null;
        double double26 = optionalDouble1.orElseGet(doubleSupplier25);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        double double3 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100.0f);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(1.0d);
        java.lang.Class<?> wildcardClass2 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        double double6 = optionalDouble1.orElse((double) 100.0f);
        java.lang.String str7 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalDouble[1.0]" + "'", str7, "OptionalDouble[1.0]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double10 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double19 = optionalDouble1.orElseThrow();
        boolean boolean20 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.getAsDouble();
        double double10 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass11 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.String str16 = optionalDouble0.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        boolean boolean2 = optionalDouble1.isPresent();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double5 = optionalDouble1.orElse((double) (-1L));
        double double7 = optionalDouble1.orElse((double) (short) 0);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        boolean boolean5 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[100.0]" + "'", str4, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) boolean6);
        java.lang.Class<?> wildcardClass8 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        boolean boolean20 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer21 = null;
        java.lang.Runnable runnable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer21, runnable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = optionalDouble0.orElseGet(doubleSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass5 = doubleStream4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        boolean boolean2 = optionalDouble1.isPresent();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double2 = optionalDouble1.getAsDouble();
        double double4 = optionalDouble1.orElse((double) '#');
        boolean boolean5 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        boolean boolean11 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.getAsDouble();
        double double10 = optionalDouble1.getAsDouble();
        boolean boolean11 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        java.lang.Class<?> wildcardClass20 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        boolean boolean12 = optionalDouble1.isPresent();
        double double13 = optionalDouble1.orElseThrow();
        boolean boolean14 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        boolean boolean4 = optionalDouble0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.lang.String str3 = optionalDouble0.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble.empty" + "'", str3, "OptionalDouble.empty");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double19 = optionalDouble1.orElseThrow();
        boolean boolean20 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean5 = optionalDouble4.isPresent();
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble7.stream();
        boolean boolean9 = optionalDouble7.isEmpty();
        boolean boolean11 = optionalDouble7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalDouble7.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble7.orElseGet(doubleSupplier13);
        double double15 = optionalDouble7.orElseThrow();
        boolean boolean16 = optionalDouble4.equals((java.lang.Object) optionalDouble7);
        boolean boolean17 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double19 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer20 = null;
        java.lang.Runnable runnable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer20, runnable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isPresent();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        double double15 = optionalDouble1.orElseGet(doubleSupplier14);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        boolean boolean11 = optionalDouble1.isEmpty();
        boolean boolean12 = optionalDouble1.isPresent();
        boolean boolean13 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass14 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(100.0d);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = optionalDouble6.orElseGet(doubleSupplier15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble6.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble6.ifPresent(doubleConsumer9);
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        boolean boolean2 = optionalDouble1.isEmpty();
        boolean boolean3 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double7 = optionalDouble1.orElse((double) 100);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double20 = optionalDouble1.orElse((double) (byte) 100);
        java.util.function.DoubleConsumer doubleConsumer21 = null;
        java.lang.Runnable runnable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer21, runnable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.lang.String str25 = optionalDouble4.toString();
        double double26 = optionalDouble4.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer27 = null;
        java.lang.Runnable runnable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble4.ifPresentOrElse(doubleConsumer27, runnable28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[100.0]" + "'", str25, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        double double3 = optionalDouble1.orElse((double) 10.0f);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.lang.String str25 = optionalDouble4.toString();
        double double26 = optionalDouble4.getAsDouble();
        java.lang.Class<?> wildcardClass27 = optionalDouble4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[100.0]" + "'", str25, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.orElseThrow();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        double double6 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        double double5 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble0.stream();
        java.lang.Class<?> wildcardClass7 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isPresent();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleConsumer doubleConsumer14 = null;
        optionalDouble10.ifPresent(doubleConsumer14);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.lang.String str25 = optionalDouble4.toString();
        java.util.function.DoubleSupplier doubleSupplier26 = null;
        double double27 = optionalDouble4.orElseGet(doubleSupplier26);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[100.0]" + "'", str25, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isPresent();
        boolean boolean10 = optionalDouble1.equals((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass11 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) boolean6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.lang.String str6 = optionalDouble0.toString();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble.empty" + "'", str6, "OptionalDouble.empty");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        boolean boolean20 = optionalDouble1.isPresent();
        java.lang.String str21 = optionalDouble1.toString();
        boolean boolean22 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalDouble[100.0]" + "'", str21, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) "OptionalDouble.empty");
        java.util.function.DoubleSupplier doubleSupplier27 = null;
        double double28 = optionalDouble1.orElseGet(doubleSupplier27);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        double double8 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = optionalDouble0.orElseGet(doubleSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 10);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        double double16 = optionalDouble5.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble5.ifPresentOrElse(doubleConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.lang.String str4 = optionalDouble1.toString();
        double double6 = optionalDouble1.orElse((double) (short) 1);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[10.0]" + "'", str4, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) "OptionalDouble.empty");
        java.util.function.DoubleConsumer doubleConsumer27 = null;
        java.lang.Runnable runnable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer27, runnable28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(1.0d);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass3 = doubleStream2.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.lang.String str4 = optionalDouble1.toString();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[10.0]" + "'", str4, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double7 = optionalDouble1.orElseThrow();
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        double double8 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.Class<?> wildcardClass5 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of(0.0d);
        double double13 = optionalDouble12.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        double double15 = optionalDouble12.orElseGet(doubleSupplier14);
        boolean boolean16 = optionalDouble1.equals((java.lang.Object) doubleSupplier14);
        java.lang.Class<?> wildcardClass17 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        boolean boolean11 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass12 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.orElseThrow();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.lang.String str4 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        double double12 = optionalDouble4.orElseThrow();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        java.lang.Class<?> wildcardClass14 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        java.lang.Class<?> wildcardClass6 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        java.util.stream.DoubleStream doubleStream17 = optionalDouble6.stream();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = optionalDouble6.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.of(0.0d);
        double double7 = optionalDouble6.getAsDouble();
        boolean boolean8 = optionalDouble6.isPresent();
        boolean boolean9 = optionalDouble6.isPresent();
        java.lang.Class<?> wildcardClass10 = optionalDouble6.getClass();
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        double double12 = optionalDouble6.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        double double6 = optionalDouble0.orElse((double) 1L);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.function.DoubleConsumer doubleConsumer25 = null;
        optionalDouble0.ifPresent(doubleConsumer25);
        java.lang.Class<?> wildcardClass27 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass3 = doubleStream2.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        java.lang.String str3 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double6 = optionalDouble1.orElse((double) (byte) 100);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble[0.0]" + "'", str3, "OptionalDouble[0.0]");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        boolean boolean7 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isPresent();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1.0f));
        double double3 = optionalDouble1.orElse((double) (byte) 1);
        double double4 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isPresent();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.orElseThrow();
        boolean boolean6 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean7 = optionalDouble3.equals((java.lang.Object) 0.0f);
        boolean boolean8 = optionalDouble3.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble3.orElseGet(doubleSupplier9);
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream13 = optionalDouble12.stream();
        boolean boolean14 = optionalDouble12.isEmpty();
        boolean boolean16 = optionalDouble12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalDouble12.isEmpty();
        boolean boolean18 = optionalDouble12.isEmpty();
        boolean boolean19 = optionalDouble3.equals((java.lang.Object) optionalDouble12);
        double double20 = optionalDouble3.orElseThrow();
        java.util.OptionalDouble optionalDouble21 = java.util.OptionalDouble.empty();
        java.lang.Class<?> wildcardClass22 = optionalDouble21.getClass();
        boolean boolean23 = optionalDouble3.equals((java.lang.Object) optionalDouble21);
        boolean boolean24 = optionalDouble1.equals((java.lang.Object) optionalDouble3);
        double double25 = optionalDouble3.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        boolean boolean25 = optionalDouble0.isEmpty();
        double double27 = optionalDouble0.orElse((double) '#');
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        double double8 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isPresent();
        java.lang.String str4 = optionalDouble1.toString();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.lang.String str1 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.lang.Class<?> wildcardClass3 = doubleStream2.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OptionalDouble.empty" + "'", str1, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double5 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        double double8 = optionalDouble1.orElse((double) (short) 100);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble1.orElseGet(doubleSupplier10);
        java.lang.Class<?> wildcardClass12 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        double double5 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble1.stream();
        double double21 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        double double8 = optionalDouble1.orElse((double) 100);
        double double10 = optionalDouble1.orElse((double) 1L);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean5 = optionalDouble4.isPresent();
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble7.stream();
        boolean boolean9 = optionalDouble7.isEmpty();
        boolean boolean11 = optionalDouble7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalDouble7.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble7.orElseGet(doubleSupplier13);
        double double15 = optionalDouble7.orElseThrow();
        boolean boolean16 = optionalDouble4.equals((java.lang.Object) optionalDouble7);
        boolean boolean17 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        double double12 = optionalDouble4.orElseThrow();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        double double15 = optionalDouble1.orElse((double) 0L);
        boolean boolean16 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        java.lang.String str11 = optionalDouble1.toString();
        double double13 = optionalDouble1.orElse(10.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalDouble[100.0]" + "'", str11, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble6.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble6.ifPresent(doubleConsumer9);
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 1L);
        double double6 = optionalDouble4.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble4.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        double double10 = optionalDouble1.orElse((double) ' ');
        java.util.function.DoubleSupplier doubleSupplier11 = null;
        double double12 = optionalDouble1.orElseGet(doubleSupplier11);
        java.util.function.DoubleConsumer doubleConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isEmpty();
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble7.stream();
        boolean boolean9 = optionalDouble7.isEmpty();
        boolean boolean11 = optionalDouble7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalDouble7.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble7.orElseGet(doubleSupplier13);
        java.util.OptionalDouble optionalDouble16 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream17 = optionalDouble16.stream();
        boolean boolean18 = optionalDouble16.isEmpty();
        boolean boolean20 = optionalDouble16.equals((java.lang.Object) 0.0f);
        boolean boolean21 = optionalDouble16.isEmpty();
        boolean boolean22 = optionalDouble16.isEmpty();
        boolean boolean23 = optionalDouble7.equals((java.lang.Object) optionalDouble16);
        double double25 = optionalDouble16.orElse((double) (byte) 0);
        boolean boolean26 = optionalDouble0.equals((java.lang.Object) double25);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble16);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        boolean boolean4 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str2 = optionalDouble1.toString();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.empty();
        boolean boolean4 = optionalDouble3.isPresent();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) boolean4);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[100.0]" + "'", str2, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isPresent();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        boolean boolean14 = optionalDouble10.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass6 = doubleStream5.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.lang.String str2 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass4 = doubleStream3.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElseThrow();
        java.lang.String str5 = optionalDouble1.toString();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 0);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 1L);
        double double6 = optionalDouble4.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble4.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        java.util.stream.DoubleStream doubleStream12 = optionalDouble10.stream();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.lang.Class<?> wildcardClass14 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        double double12 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElseThrow();
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.isEmpty();
        java.lang.String str9 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalDouble[100.0]" + "'", str9, "OptionalDouble[100.0]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        java.util.stream.DoubleStream doubleStream17 = optionalDouble6.stream();
        java.lang.Class<?> wildcardClass18 = optionalDouble6.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(1.0d);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        double double3 = optionalDouble1.orElseThrow();
        double double4 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass5 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        double double12 = optionalDouble4.orElseThrow();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        double double15 = optionalDouble1.orElse((double) 0L);
        java.lang.String str16 = optionalDouble1.toString();
        java.lang.String str17 = optionalDouble1.toString();
        double double19 = optionalDouble1.orElse((double) 10L);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble[100.0]" + "'", str16, "OptionalDouble[100.0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalDouble[100.0]" + "'", str17, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) '4');
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        java.lang.String str6 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble0.stream();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble.empty" + "'", str6, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        boolean boolean6 = optionalDouble0.isPresent();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean34 = optionalDouble31.isPresent();
        double double35 = optionalDouble31.getAsDouble();
        java.lang.Object obj36 = null;
        boolean boolean37 = optionalDouble31.equals(obj36);
        java.util.stream.DoubleStream doubleStream38 = optionalDouble31.stream();
        boolean boolean39 = optionalDouble4.equals((java.lang.Object) doubleStream38);
        double double41 = optionalDouble4.orElse((double) '#');
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double3 = optionalDouble1.orElse((double) (-1));
        double double4 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        java.util.OptionalDouble optionalDouble22 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble22.orElseGet(doubleSupplier23);
        java.lang.String str25 = optionalDouble22.toString();
        double double27 = optionalDouble22.orElse((double) 100.0f);
        boolean boolean28 = optionalDouble15.equals((java.lang.Object) double27);
        double double30 = optionalDouble15.orElse((double) 10L);
        double double31 = optionalDouble15.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalDouble22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[1.0]" + "'", str25, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double6 = optionalDouble1.orElse((double) (short) 100);
        java.lang.Class<?> wildcardClass7 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        boolean boolean4 = optionalDouble0.isPresent();
        java.lang.String str5 = optionalDouble0.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double19 = optionalDouble10.orElse((double) (byte) 0);
        double double20 = optionalDouble10.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble10.orElseGet(doubleSupplier21);
        java.lang.Class<?> wildcardClass23 = optionalDouble10.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble5.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream10 = optionalDouble9.stream();
        boolean boolean11 = optionalDouble9.isEmpty();
        boolean boolean13 = optionalDouble9.equals((java.lang.Object) 0.0f);
        boolean boolean14 = optionalDouble9.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        double double16 = optionalDouble9.orElseGet(doubleSupplier15);
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble18.stream();
        boolean boolean20 = optionalDouble18.isEmpty();
        boolean boolean22 = optionalDouble18.equals((java.lang.Object) 0.0f);
        boolean boolean23 = optionalDouble18.isEmpty();
        boolean boolean24 = optionalDouble18.isEmpty();
        boolean boolean25 = optionalDouble9.equals((java.lang.Object) optionalDouble18);
        double double26 = optionalDouble9.orElseThrow();
        boolean boolean27 = optionalDouble9.isEmpty();
        java.util.stream.DoubleStream doubleStream28 = optionalDouble9.stream();
        boolean boolean29 = optionalDouble5.equals((java.lang.Object) optionalDouble9);
        boolean boolean30 = optionalDouble5.isEmpty();
        boolean boolean31 = optionalDouble5.isPresent();
        boolean boolean32 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.Class<?> wildcardClass33 = optionalDouble5.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        double double10 = optionalDouble1.getAsDouble();
        double double12 = optionalDouble1.orElse(10.0d);
        java.util.OptionalDouble optionalDouble14 = java.util.OptionalDouble.of((double) 1L);
        java.util.stream.DoubleStream doubleStream15 = optionalDouble14.stream();
        boolean boolean16 = optionalDouble1.equals((java.lang.Object) optionalDouble14);
        boolean boolean17 = optionalDouble14.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        double double8 = optionalDouble1.orElse((double) 1);
        java.lang.String str9 = optionalDouble1.toString();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble1.orElseGet(doubleSupplier10);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalDouble[1.0]" + "'", str9, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        double double12 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble14 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream15 = optionalDouble14.stream();
        boolean boolean16 = optionalDouble14.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier17 = null;
        double double18 = optionalDouble14.orElseGet(doubleSupplier17);
        java.util.OptionalDouble optionalDouble19 = java.util.OptionalDouble.empty();
        boolean boolean20 = optionalDouble14.equals((java.lang.Object) optionalDouble19);
        java.util.OptionalDouble optionalDouble22 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble22.orElseGet(doubleSupplier23);
        java.util.stream.DoubleStream doubleStream25 = optionalDouble22.stream();
        boolean boolean26 = optionalDouble19.equals((java.lang.Object) doubleStream25);
        java.util.stream.DoubleStream doubleStream27 = optionalDouble19.stream();
        boolean boolean28 = optionalDouble19.isPresent();
        boolean boolean29 = optionalDouble1.equals((java.lang.Object) optionalDouble19);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalDouble22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        double double8 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream9 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double25 = optionalDouble1.orElse((double) '4');
        java.util.function.DoubleConsumer doubleConsumer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) '4');
        double double2 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.getAsDouble();
        double double10 = optionalDouble1.getAsDouble();
        boolean boolean11 = optionalDouble1.isEmpty();
        double double12 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        boolean boolean12 = optionalDouble1.isPresent();
        double double14 = optionalDouble1.orElse((double) (short) 100);
        double double15 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        boolean boolean12 = optionalDouble1.isPresent();
        double double13 = optionalDouble1.orElseThrow();
        java.lang.String str14 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble[100.0]" + "'", str14, "OptionalDouble[100.0]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 'a');
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double20 = optionalDouble1.orElse((double) (byte) 100);
        double double21 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double6 = optionalDouble1.orElse((-1.0d));
        java.lang.Class<?> wildcardClass7 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        double double6 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        double double16 = optionalDouble5.getAsDouble();
        boolean boolean17 = optionalDouble5.isEmpty();
        double double19 = optionalDouble5.orElse((-1.0d));
        boolean boolean20 = optionalDouble5.isEmpty();
        java.util.OptionalDouble optionalDouble22 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream23 = optionalDouble22.stream();
        boolean boolean24 = optionalDouble22.isEmpty();
        boolean boolean26 = optionalDouble22.equals((java.lang.Object) 0.0f);
        boolean boolean27 = optionalDouble22.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier28 = null;
        double double29 = optionalDouble22.orElseGet(doubleSupplier28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean35 = optionalDouble31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalDouble31.isEmpty();
        boolean boolean37 = optionalDouble31.isEmpty();
        boolean boolean38 = optionalDouble22.equals((java.lang.Object) optionalDouble31);
        double double39 = optionalDouble22.orElseThrow();
        boolean boolean40 = optionalDouble22.isEmpty();
        double double42 = optionalDouble22.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier43 = null;
        double double44 = optionalDouble22.orElseGet(doubleSupplier43);
        double double45 = optionalDouble22.orElseThrow();
        double double47 = optionalDouble22.orElse((double) (byte) -1);
        boolean boolean48 = optionalDouble5.equals((java.lang.Object) optionalDouble22);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalDouble22);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isPresent();
        double double4 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double8 = optionalDouble1.orElse((double) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble6.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble6.ifPresent(doubleConsumer9);
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        double double13 = optionalDouble6.orElse((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        java.util.function.DoubleConsumer doubleConsumer21 = null;
        java.lang.Runnable runnable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer21, runnable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        boolean boolean5 = optionalDouble1.isPresent();
        double double7 = optionalDouble1.orElse((double) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isPresent();
        java.lang.String str8 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalDouble[100.0]" + "'", str8, "OptionalDouble[100.0]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.lang.String str6 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[100.0]" + "'", str6, "OptionalDouble[100.0]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        double double12 = optionalDouble1.orElseThrow();
        java.lang.String str13 = optionalDouble1.toString();
        boolean boolean14 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalDouble[100.0]" + "'", str13, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble6.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble6.ifPresent(doubleConsumer9);
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        java.lang.Class<?> wildcardClass12 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double10 = optionalDouble1.orElse((double) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        java.lang.String str12 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalDouble[100.0]" + "'", str12, "OptionalDouble[100.0]");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        java.util.OptionalDouble optionalDouble8 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble8.orElseGet(doubleSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalDouble8.getClass();
        boolean boolean12 = optionalDouble1.equals((java.lang.Object) wildcardClass11);
        java.util.function.DoubleConsumer doubleConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer13, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalDouble8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double5 = optionalDouble1.orElseThrow();
        double double6 = optionalDouble1.orElseThrow();
        java.lang.Class<?> wildcardClass7 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        boolean boolean3 = optionalDouble0.isEmpty();
        double double5 = optionalDouble0.orElse((double) 10.0f);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.OptionalDouble optionalDouble11 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble11.stream();
        boolean boolean13 = optionalDouble11.isEmpty();
        boolean boolean15 = optionalDouble11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalDouble9.equals((java.lang.Object) optionalDouble11);
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble11);
        boolean boolean18 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream19 = optionalDouble1.stream();
        boolean boolean20 = optionalDouble1.isPresent();
        double double21 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(optionalDouble11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        double double8 = optionalDouble1.orElse((double) 100);
        double double9 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isPresent();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleConsumer doubleConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        double double6 = optionalDouble0.orElse((double) (-1L));
        boolean boolean7 = optionalDouble0.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        boolean boolean20 = optionalDouble1.isPresent();
        java.lang.String str21 = optionalDouble1.toString();
        double double22 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalDouble[100.0]" + "'", str21, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble1.orElseGet(doubleSupplier13);
        java.util.stream.DoubleStream doubleStream15 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream13 = optionalDouble12.stream();
        boolean boolean14 = optionalDouble12.isEmpty();
        boolean boolean16 = optionalDouble12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalDouble12.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble12.orElseGet(doubleSupplier18);
        java.util.OptionalDouble optionalDouble21 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream22 = optionalDouble21.stream();
        boolean boolean23 = optionalDouble21.isEmpty();
        boolean boolean25 = optionalDouble21.equals((java.lang.Object) 0.0f);
        boolean boolean26 = optionalDouble21.isEmpty();
        boolean boolean27 = optionalDouble21.isEmpty();
        boolean boolean28 = optionalDouble12.equals((java.lang.Object) optionalDouble21);
        double double29 = optionalDouble12.orElseThrow();
        boolean boolean30 = optionalDouble12.isEmpty();
        java.util.stream.DoubleStream doubleStream31 = optionalDouble12.stream();
        java.lang.Class<?> wildcardClass32 = doubleStream31.getClass();
        boolean boolean33 = optionalDouble1.equals((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble21);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 1);
        java.lang.String str2 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[1.0]" + "'", str2, "OptionalDouble[1.0]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        java.util.OptionalDouble optionalDouble22 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble22.orElseGet(doubleSupplier23);
        java.lang.String str25 = optionalDouble22.toString();
        double double27 = optionalDouble22.orElse((double) 100.0f);
        boolean boolean28 = optionalDouble15.equals((java.lang.Object) double27);
        java.util.function.DoubleConsumer doubleConsumer29 = null;
        java.lang.Runnable runnable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble15.ifPresentOrElse(doubleConsumer29, runnable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalDouble22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[1.0]" + "'", str25, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        boolean boolean11 = optionalDouble1.isEmpty();
        double double12 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer13, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 0);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElseThrow();
        double double5 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        boolean boolean4 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.lang.String str3 = optionalDouble0.toString();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        optionalDouble0.ifPresent(doubleConsumer4);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = optionalDouble0.orElseGet(doubleSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble.empty" + "'", str3, "OptionalDouble.empty");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        double double3 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.of(0.0d);
        double double7 = optionalDouble6.getAsDouble();
        boolean boolean8 = optionalDouble6.isPresent();
        boolean boolean9 = optionalDouble6.isPresent();
        java.lang.Class<?> wildcardClass10 = optionalDouble6.getClass();
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        double double12 = optionalDouble6.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass4 = doubleStream3.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean5 = optionalDouble4.isPresent();
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble7.stream();
        boolean boolean9 = optionalDouble7.isEmpty();
        boolean boolean11 = optionalDouble7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalDouble7.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble7.orElseGet(doubleSupplier13);
        double double15 = optionalDouble7.orElseThrow();
        boolean boolean16 = optionalDouble4.equals((java.lang.Object) optionalDouble7);
        boolean boolean17 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble4.ifPresentOrElse(doubleConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        boolean boolean6 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isPresent();
        double double9 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean35 = optionalDouble31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalDouble31.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier37 = null;
        double double38 = optionalDouble31.orElseGet(doubleSupplier37);
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream41 = optionalDouble40.stream();
        boolean boolean42 = optionalDouble40.isEmpty();
        boolean boolean44 = optionalDouble40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalDouble40.isEmpty();
        boolean boolean46 = optionalDouble40.isEmpty();
        boolean boolean47 = optionalDouble31.equals((java.lang.Object) optionalDouble40);
        boolean boolean48 = optionalDouble4.equals((java.lang.Object) optionalDouble31);
        java.lang.Class<?> wildcardClass49 = optionalDouble4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 0);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        double double6 = optionalDouble1.orElse((double) 100.0f);
        double double8 = optionalDouble1.orElse((double) (short) 10);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElseThrow();
        double double5 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        java.lang.String str17 = optionalDouble6.toString();
        double double19 = optionalDouble6.orElse((double) 1.0f);
        java.util.function.DoubleConsumer doubleConsumer20 = null;
        java.lang.Runnable runnable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble6.ifPresentOrElse(doubleConsumer20, runnable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalDouble.empty" + "'", str17, "OptionalDouble.empty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble0.stream();
        boolean boolean7 = optionalDouble0.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        boolean boolean25 = optionalDouble1.isEmpty();
        boolean boolean26 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        double double6 = optionalDouble1.orElse((double) 100.0f);
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double9 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isPresent();
        boolean boolean8 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[100.0]" + "'", str4, "OptionalDouble[100.0]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) -1);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double7 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double20 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble1.orElseGet(doubleSupplier21);
        double double24 = optionalDouble1.orElse(10.0d);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of((double) 1L);
        double double28 = optionalDouble26.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream29 = optionalDouble26.stream();
        boolean boolean30 = optionalDouble1.equals((java.lang.Object) doubleStream29);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 0.0f);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isEmpty();
        java.lang.Class<?> wildcardClass6 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double20 = optionalDouble1.getAsDouble();
        double double21 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        java.util.function.DoubleConsumer doubleConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(1.0d);
        double double2 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) 10);
        java.util.function.DoubleConsumer doubleConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double20 = optionalDouble1.getAsDouble();
        double double21 = optionalDouble1.getAsDouble();
        double double22 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble24 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.stream.DoubleStream doubleStream25 = optionalDouble24.stream();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble24);
        java.util.function.DoubleConsumer doubleConsumer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble24.ifPresent(doubleConsumer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble24);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double19 = optionalDouble10.orElse((double) 100);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        boolean boolean4 = optionalDouble0.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = optionalDouble0.orElseGet(doubleSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((-1.0d));
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double5 = optionalDouble1.orElse((double) 1L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        java.util.OptionalDouble optionalDouble23 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream24 = optionalDouble23.stream();
        boolean boolean25 = optionalDouble23.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble23);
        java.util.function.DoubleConsumer doubleConsumer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble23);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.isEmpty();
        double double8 = optionalDouble1.orElse((double) (byte) 10);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        java.util.OptionalDouble optionalDouble23 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream24 = optionalDouble23.stream();
        boolean boolean25 = optionalDouble23.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble23);
        boolean boolean27 = optionalDouble23.isPresent();
        double double28 = optionalDouble23.getAsDouble();
        java.lang.Class<?> wildcardClass29 = optionalDouble23.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble23);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double20 = optionalDouble1.getAsDouble();
        double double21 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream22 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream22);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10.0f);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean6 = optionalDouble3.isPresent();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble3.stream();
        boolean boolean8 = optionalDouble3.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) boolean8);
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double19 = optionalDouble10.orElse((double) (byte) 0);
        double double20 = optionalDouble10.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        double double22 = optionalDouble15.orElse((double) (short) -1);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble15.orElseGet(doubleSupplier23);
        boolean boolean25 = optionalDouble15.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer26 = null;
        java.lang.Runnable runnable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble15.ifPresentOrElse(doubleConsumer26, runnable27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        boolean boolean3 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        boolean boolean2 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10.0f);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean6 = optionalDouble3.isPresent();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble3.stream();
        boolean boolean8 = optionalDouble3.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) boolean8);
        double double11 = optionalDouble1.orElse((double) (short) 100);
        java.util.function.DoubleConsumer doubleConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble6.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble6.ifPresent(doubleConsumer9);
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleConsumer doubleConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble6.ifPresentOrElse(doubleConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isPresent();
        double double4 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) "");
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble5.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream10 = optionalDouble9.stream();
        boolean boolean11 = optionalDouble9.isEmpty();
        boolean boolean13 = optionalDouble9.equals((java.lang.Object) 0.0f);
        boolean boolean14 = optionalDouble9.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        double double16 = optionalDouble9.orElseGet(doubleSupplier15);
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble18.stream();
        boolean boolean20 = optionalDouble18.isEmpty();
        boolean boolean22 = optionalDouble18.equals((java.lang.Object) 0.0f);
        boolean boolean23 = optionalDouble18.isEmpty();
        boolean boolean24 = optionalDouble18.isEmpty();
        boolean boolean25 = optionalDouble9.equals((java.lang.Object) optionalDouble18);
        double double26 = optionalDouble9.orElseThrow();
        boolean boolean27 = optionalDouble9.isEmpty();
        java.util.stream.DoubleStream doubleStream28 = optionalDouble9.stream();
        boolean boolean29 = optionalDouble5.equals((java.lang.Object) optionalDouble9);
        boolean boolean30 = optionalDouble5.isEmpty();
        boolean boolean31 = optionalDouble5.isPresent();
        boolean boolean32 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.String str33 = optionalDouble0.toString();
        java.lang.Class<?> wildcardClass34 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OptionalDouble.empty" + "'", str33, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass10 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 0);
        double double2 = optionalDouble1.getAsDouble();
        double double3 = optionalDouble1.orElseThrow();
        double double5 = optionalDouble1.orElse((double) (byte) 10);
        double double6 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        boolean boolean18 = optionalDouble10.isPresent();
        java.lang.Class<?> wildcardClass19 = optionalDouble10.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 0L);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        boolean boolean4 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        boolean boolean7 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        java.lang.String str17 = optionalDouble6.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalDouble.empty" + "'", str17, "OptionalDouble.empty");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        boolean boolean11 = optionalDouble1.isEmpty();
        boolean boolean12 = optionalDouble1.isPresent();
        double double13 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream14 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        double double16 = optionalDouble1.orElseGet(doubleSupplier15);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        java.lang.String str5 = optionalDouble0.toString();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        java.lang.String str6 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble0.stream();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = optionalDouble0.orElseGet(doubleSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble.empty" + "'", str6, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) -1);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        double double30 = optionalDouble4.getAsDouble();
        double double31 = optionalDouble4.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.lang.String str6 = optionalDouble1.toString();
        java.lang.String str7 = optionalDouble1.toString();
        double double8 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[100.0]" + "'", str6, "OptionalDouble[100.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalDouble[100.0]" + "'", str7, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        boolean boolean8 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        java.util.OptionalDouble optionalDouble8 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble8.orElseGet(doubleSupplier9);
        java.lang.Class<?> wildcardClass11 = optionalDouble8.getClass();
        boolean boolean12 = optionalDouble1.equals((java.lang.Object) wildcardClass11);
        double double13 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionalDouble8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        double double22 = optionalDouble15.orElse((double) (short) -1);
        java.lang.Class<?> wildcardClass23 = optionalDouble15.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble8 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream9 = optionalDouble8.stream();
        boolean boolean10 = optionalDouble8.isEmpty();
        double double12 = optionalDouble8.orElse((double) 1L);
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) 1L);
        boolean boolean14 = optionalDouble1.isPresent();
        double double15 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        java.util.OptionalDouble optionalDouble23 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream24 = optionalDouble23.stream();
        boolean boolean25 = optionalDouble23.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble23);
        boolean boolean27 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble23);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        boolean boolean7 = optionalDouble1.isPresent();
        double double8 = optionalDouble1.getAsDouble();
        boolean boolean9 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass10 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        java.util.OptionalDouble optionalDouble23 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream24 = optionalDouble23.stream();
        boolean boolean25 = optionalDouble23.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble23);
        boolean boolean27 = optionalDouble23.isPresent();
        java.util.function.DoubleSupplier doubleSupplier28 = null;
        double double29 = optionalDouble23.orElseGet(doubleSupplier28);
        java.util.function.DoubleConsumer doubleConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble23.ifPresent(doubleConsumer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble23);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        boolean boolean25 = optionalDouble0.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer26 = null;
        optionalDouble0.ifPresent(doubleConsumer26);
        double double29 = optionalDouble0.orElse((double) 1);
        java.util.function.DoubleConsumer doubleConsumer30 = null;
        java.lang.Runnable runnable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer30, runnable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        boolean boolean17 = optionalDouble6.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) -1);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.lang.String str25 = optionalDouble4.toString();
        double double26 = optionalDouble4.getAsDouble();
        double double27 = optionalDouble4.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[100.0]" + "'", str25, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        double double12 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer13 = null;
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer13, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble10.isPresent();
        boolean boolean12 = optionalDouble1.equals((java.lang.Object) boolean11);
        java.lang.String str13 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalDouble[100.0]" + "'", str13, "OptionalDouble[100.0]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream12 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.String str6 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[10.0]" + "'", str6, "OptionalDouble[10.0]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        double double2 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass3 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        double double16 = optionalDouble5.getAsDouble();
        boolean boolean17 = optionalDouble5.isEmpty();
        boolean boolean18 = optionalDouble5.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        boolean boolean25 = optionalDouble0.isEmpty();
        java.util.stream.DoubleStream doubleStream26 = optionalDouble0.stream();
        java.lang.Class<?> wildcardClass27 = doubleStream26.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double5 = optionalDouble1.orElseThrow();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.lang.Class<?> wildcardClass25 = optionalDouble4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 0L);
        double double2 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double10 = optionalDouble1.orElse((double) (short) 0);
        java.lang.String str11 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalDouble[100.0]" + "'", str11, "OptionalDouble[100.0]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        java.lang.Object obj6 = null;
        boolean boolean7 = optionalDouble1.equals(obj6);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        boolean boolean5 = optionalDouble1.isPresent();
        double double7 = optionalDouble1.orElse(0.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier19 = null;
        double double20 = optionalDouble1.orElseGet(doubleSupplier19);
        double double22 = optionalDouble1.orElse((double) (-1));
        double double23 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.orElseThrow();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double20 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble1.orElseGet(doubleSupplier21);
        double double24 = optionalDouble1.orElse(10.0d);
        double double26 = optionalDouble1.orElse((double) (short) 100);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double5 = optionalDouble1.orElseThrow();
        double double6 = optionalDouble1.orElseThrow();
        double double8 = optionalDouble1.orElse((double) (short) 1);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        boolean boolean3 = optionalDouble0.isEmpty();
        boolean boolean4 = optionalDouble0.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) "");
        java.lang.String str7 = optionalDouble1.toString();
        boolean boolean8 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalDouble[10.0]" + "'", str7, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        boolean boolean25 = optionalDouble1.isEmpty();
        java.util.OptionalDouble optionalDouble27 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream28 = optionalDouble27.stream();
        boolean boolean29 = optionalDouble27.isEmpty();
        double double30 = optionalDouble27.orElseThrow();
        java.lang.String str31 = optionalDouble27.toString();
        java.util.stream.DoubleStream doubleStream32 = optionalDouble27.stream();
        boolean boolean33 = optionalDouble1.equals((java.lang.Object) doubleStream32);
        java.util.function.DoubleConsumer doubleConsumer34 = null;
        java.lang.Runnable runnable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer34, runnable35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(optionalDouble27);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OptionalDouble[100.0]" + "'", str31, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.lang.String str2 = optionalDouble0.toString();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble.empty" + "'", str2, "OptionalDouble.empty");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double3 = optionalDouble1.orElse((double) (-1));
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) boolean6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        boolean boolean10 = optionalDouble0.isEmpty();
        boolean boolean11 = optionalDouble0.isEmpty();
        boolean boolean12 = optionalDouble0.isPresent();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = optionalDouble0.orElseGet(doubleSupplier13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.OptionalDouble optionalDouble2 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream3 = optionalDouble2.stream();
        boolean boolean4 = optionalDouble2.isEmpty();
        boolean boolean5 = optionalDouble2.isEmpty();
        boolean boolean6 = optionalDouble2.isPresent();
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) optionalDouble2);
        boolean boolean8 = optionalDouble2.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        double double3 = optionalDouble1.orElseThrow();
        double double4 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble1.stream();
        boolean boolean4 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        double double3 = optionalDouble1.getAsDouble();
        double double5 = optionalDouble1.orElse((double) (-1.0f));
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream13 = optionalDouble12.stream();
        boolean boolean14 = optionalDouble12.isEmpty();
        boolean boolean15 = optionalDouble12.isPresent();
        java.util.stream.DoubleStream doubleStream16 = optionalDouble12.stream();
        boolean boolean17 = optionalDouble12.isEmpty();
        boolean boolean18 = optionalDouble1.equals((java.lang.Object) optionalDouble12);
        java.util.OptionalDouble optionalDouble20 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble20.orElseGet(doubleSupplier21);
        java.lang.String str23 = optionalDouble20.toString();
        double double25 = optionalDouble20.orElse((double) 100.0f);
        boolean boolean26 = optionalDouble12.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass27 = optionalDouble12.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(optionalDouble20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalDouble[1.0]" + "'", str23, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 1L);
        double double6 = optionalDouble4.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble4.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        java.lang.Class<?> wildcardClass9 = optionalDouble4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        double double6 = optionalDouble0.orElse((double) (-1L));
        boolean boolean7 = optionalDouble0.isEmpty();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble0.ifPresent(doubleConsumer9);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        boolean boolean6 = optionalDouble0.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 0);
        double double2 = optionalDouble1.getAsDouble();
        double double3 = optionalDouble1.orElseThrow();
        double double5 = optionalDouble1.orElse((double) (byte) 10);
        java.lang.Class<?> wildcardClass6 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean35 = optionalDouble31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalDouble31.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier37 = null;
        double double38 = optionalDouble31.orElseGet(doubleSupplier37);
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream41 = optionalDouble40.stream();
        boolean boolean42 = optionalDouble40.isEmpty();
        boolean boolean44 = optionalDouble40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalDouble40.isEmpty();
        boolean boolean46 = optionalDouble40.isEmpty();
        boolean boolean47 = optionalDouble31.equals((java.lang.Object) optionalDouble40);
        boolean boolean48 = optionalDouble4.equals((java.lang.Object) optionalDouble31);
        double double49 = optionalDouble4.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        boolean boolean8 = optionalDouble6.isPresent();
        java.lang.Class<?> wildcardClass9 = optionalDouble6.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        double double7 = optionalDouble0.orElse(52.0d);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = optionalDouble0.orElseGet(doubleSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        boolean boolean7 = optionalDouble1.isPresent();
        double double8 = optionalDouble1.getAsDouble();
        boolean boolean9 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str2 = optionalDouble1.toString();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.empty();
        boolean boolean4 = optionalDouble3.isPresent();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) boolean4);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble11 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble11.stream();
        boolean boolean13 = optionalDouble11.isEmpty();
        boolean boolean15 = optionalDouble11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalDouble11.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier17 = null;
        double double18 = optionalDouble11.orElseGet(doubleSupplier17);
        double double19 = optionalDouble11.orElseThrow();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble11.stream();
        boolean boolean21 = optionalDouble1.equals((java.lang.Object) doubleStream20);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[100.0]" + "'", str2, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 0);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double5 = optionalDouble1.orElse(10.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass3 = doubleStream2.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        java.lang.Object obj6 = null;
        boolean boolean7 = optionalDouble1.equals(obj6);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        boolean boolean9 = optionalDouble1.isEmpty();
        boolean boolean10 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        double double7 = optionalDouble0.orElse(52.0d);
        java.lang.Class<?> wildcardClass8 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.lang.Class<?> wildcardClass8 = optionalDouble7.getClass();
        boolean boolean9 = optionalDouble0.equals((java.lang.Object) optionalDouble7);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble7.orElseGet(doubleSupplier10);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        double double6 = optionalDouble0.orElse((double) (-1L));
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        optionalDouble0.ifPresent(doubleConsumer7);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble0.ifPresent(doubleConsumer9);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        java.util.function.DoubleConsumer doubleConsumer24 = null;
        java.lang.Runnable runnable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer24, runnable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        java.lang.String str9 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalDouble[100.0]" + "'", str9, "OptionalDouble[100.0]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        double double5 = optionalDouble0.orElse((double) 10L);
        boolean boolean6 = optionalDouble0.isPresent();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        double double3 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer3, runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        boolean boolean3 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.OptionalDouble optionalDouble2 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream3 = optionalDouble2.stream();
        boolean boolean4 = optionalDouble2.isEmpty();
        boolean boolean5 = optionalDouble2.isEmpty();
        boolean boolean6 = optionalDouble2.isPresent();
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) optionalDouble2);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        boolean boolean10 = optionalDouble0.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean35 = optionalDouble31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalDouble31.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier37 = null;
        double double38 = optionalDouble31.orElseGet(doubleSupplier37);
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream41 = optionalDouble40.stream();
        boolean boolean42 = optionalDouble40.isEmpty();
        boolean boolean44 = optionalDouble40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalDouble40.isEmpty();
        boolean boolean46 = optionalDouble40.isEmpty();
        boolean boolean47 = optionalDouble31.equals((java.lang.Object) optionalDouble40);
        boolean boolean48 = optionalDouble4.equals((java.lang.Object) optionalDouble31);
        java.lang.Class<?> wildcardClass49 = optionalDouble31.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        double double16 = optionalDouble5.getAsDouble();
        boolean boolean17 = optionalDouble5.isEmpty();
        double double18 = optionalDouble5.orElseThrow();
        double double19 = optionalDouble5.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream13 = optionalDouble12.stream();
        boolean boolean14 = optionalDouble12.isEmpty();
        boolean boolean16 = optionalDouble12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalDouble12.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble12.orElseGet(doubleSupplier18);
        java.util.OptionalDouble optionalDouble21 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream22 = optionalDouble21.stream();
        boolean boolean23 = optionalDouble21.isEmpty();
        boolean boolean25 = optionalDouble21.equals((java.lang.Object) 0.0f);
        boolean boolean26 = optionalDouble21.isEmpty();
        boolean boolean27 = optionalDouble21.isEmpty();
        boolean boolean28 = optionalDouble12.equals((java.lang.Object) optionalDouble21);
        double double29 = optionalDouble12.orElseThrow();
        boolean boolean30 = optionalDouble12.isEmpty();
        java.util.stream.DoubleStream doubleStream31 = optionalDouble12.stream();
        java.lang.Class<?> wildcardClass32 = doubleStream31.getClass();
        boolean boolean33 = optionalDouble1.equals((java.lang.Object) wildcardClass32);
        java.util.OptionalDouble optionalDouble35 = java.util.OptionalDouble.of((double) 100L);
        java.util.OptionalDouble optionalDouble37 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream38 = optionalDouble37.stream();
        boolean boolean39 = optionalDouble37.isEmpty();
        boolean boolean41 = optionalDouble37.equals((java.lang.Object) 0.0f);
        boolean boolean42 = optionalDouble35.equals((java.lang.Object) optionalDouble37);
        java.util.stream.DoubleStream doubleStream43 = optionalDouble37.stream();
        boolean boolean44 = optionalDouble1.equals((java.lang.Object) doubleStream43);
        java.util.function.DoubleConsumer doubleConsumer45 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble21);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(optionalDouble35);
        org.junit.Assert.assertNotNull(optionalDouble37);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean1 = optionalDouble0.isPresent();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean7 = optionalDouble3.equals((java.lang.Object) 0.0f);
        boolean boolean8 = optionalDouble3.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble3.orElseGet(doubleSupplier9);
        double double11 = optionalDouble3.orElseThrow();
        double double12 = optionalDouble3.getAsDouble();
        boolean boolean13 = optionalDouble0.equals((java.lang.Object) optionalDouble3);
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        double double15 = optionalDouble3.orElseGet(doubleSupplier14);
        java.lang.Class<?> wildcardClass16 = optionalDouble3.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean7 = optionalDouble3.equals((java.lang.Object) 0.0f);
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble3);
        java.util.stream.DoubleStream doubleStream9 = optionalDouble3.stream();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble3.orElseGet(doubleSupplier10);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        boolean boolean20 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.lang.String str6 = optionalDouble1.toString();
        double double7 = optionalDouble1.getAsDouble();
        double double9 = optionalDouble1.orElse(1.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[100.0]" + "'", str6, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        double double12 = optionalDouble4.orElseThrow();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        double double15 = optionalDouble1.orElse((double) 0L);
        java.lang.String str16 = optionalDouble1.toString();
        java.lang.String str17 = optionalDouble1.toString();
        double double18 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble20 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream21 = optionalDouble20.stream();
        boolean boolean22 = optionalDouble20.isEmpty();
        boolean boolean23 = optionalDouble20.isPresent();
        double double24 = optionalDouble20.getAsDouble();
        double double25 = optionalDouble20.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier26 = null;
        double double27 = optionalDouble20.orElseGet(doubleSupplier26);
        boolean boolean28 = optionalDouble20.isEmpty();
        java.util.OptionalDouble optionalDouble29 = java.util.OptionalDouble.empty();
        boolean boolean30 = optionalDouble29.isPresent();
        boolean boolean31 = optionalDouble20.equals((java.lang.Object) boolean30);
        boolean boolean32 = optionalDouble1.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble[100.0]" + "'", str16, "OptionalDouble[100.0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalDouble[100.0]" + "'", str17, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble20);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionalDouble29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double2 = optionalDouble1.getAsDouble();
        double double4 = optionalDouble1.orElse((double) '#');
        boolean boolean5 = optionalDouble1.isEmpty();
        boolean boolean6 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.util.OptionalDouble optionalDouble17 = java.util.OptionalDouble.of(10.0d);
        boolean boolean18 = optionalDouble5.equals((java.lang.Object) optionalDouble17);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble17.stream();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalDouble17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isPresent();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble0.stream();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        double double13 = optionalDouble1.orElse((double) 10.0f);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(35.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double25 = optionalDouble1.orElse((double) '4');
        double double26 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        java.util.stream.DoubleStream doubleStream21 = optionalDouble15.stream();
        double double22 = optionalDouble15.orElseThrow();
        java.lang.Class<?> wildcardClass23 = optionalDouble15.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        double double6 = optionalDouble0.orElse((double) (-1L));
        boolean boolean7 = optionalDouble0.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = optionalDouble0.orElseGet(doubleSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.OptionalDouble optionalDouble11 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble11.stream();
        boolean boolean13 = optionalDouble11.isEmpty();
        boolean boolean15 = optionalDouble11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalDouble9.equals((java.lang.Object) optionalDouble11);
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble11);
        java.util.OptionalDouble optionalDouble19 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream20 = optionalDouble19.stream();
        boolean boolean21 = optionalDouble19.isEmpty();
        boolean boolean23 = optionalDouble19.equals((java.lang.Object) 0.0f);
        boolean boolean24 = optionalDouble19.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier25 = null;
        double double26 = optionalDouble19.orElseGet(doubleSupplier25);
        double double27 = optionalDouble19.orElseThrow();
        java.util.stream.DoubleStream doubleStream28 = optionalDouble19.stream();
        java.util.OptionalDouble optionalDouble30 = java.util.OptionalDouble.of((double) 100L);
        double double31 = optionalDouble30.orElseThrow();
        java.util.OptionalDouble optionalDouble33 = java.util.OptionalDouble.of((double) 1L);
        double double35 = optionalDouble33.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream36 = optionalDouble33.stream();
        boolean boolean37 = optionalDouble30.equals((java.lang.Object) optionalDouble33);
        boolean boolean38 = optionalDouble19.equals((java.lang.Object) optionalDouble33);
        boolean boolean39 = optionalDouble11.equals((java.lang.Object) optionalDouble33);
        java.util.function.DoubleConsumer doubleConsumer40 = null;
        java.lang.Runnable runnable41 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble11.ifPresentOrElse(doubleConsumer40, runnable41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(optionalDouble11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionalDouble19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(optionalDouble30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        double double2 = optionalDouble1.getAsDouble();
        double double3 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str6 = optionalDouble5.toString();
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.empty();
        boolean boolean8 = optionalDouble7.isPresent();
        boolean boolean9 = optionalDouble5.equals((java.lang.Object) boolean8);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble5.orElseGet(doubleSupplier10);
        boolean boolean12 = optionalDouble1.equals((java.lang.Object) doubleSupplier10);
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble1.orElseGet(doubleSupplier13);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[100.0]" + "'", str6, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.getAsDouble();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(100.0d);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        double double4 = optionalDouble1.orElse(32.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        double double12 = optionalDouble4.orElseThrow();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        java.lang.Class<?> wildcardClass14 = optionalDouble4.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.String str16 = optionalDouble0.toString();
        boolean boolean17 = optionalDouble0.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.stream.DoubleStream doubleStream30 = optionalDouble4.stream();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleStream30);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        boolean boolean2 = optionalDouble1.isPresent();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double5 = optionalDouble1.orElse((double) (-1.0f));
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        java.util.OptionalDouble optionalDouble22 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble22.orElseGet(doubleSupplier23);
        java.lang.String str25 = optionalDouble22.toString();
        double double27 = optionalDouble22.orElse((double) 100.0f);
        boolean boolean28 = optionalDouble15.equals((java.lang.Object) double27);
        double double30 = optionalDouble15.orElse((double) 10L);
        java.util.OptionalDouble optionalDouble32 = java.util.OptionalDouble.of((double) 1L);
        double double34 = optionalDouble32.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble36 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean37 = optionalDouble32.equals((java.lang.Object) optionalDouble36);
        java.util.stream.DoubleStream doubleStream38 = optionalDouble32.stream();
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 100L);
        java.util.OptionalDouble optionalDouble42 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream43 = optionalDouble42.stream();
        boolean boolean44 = optionalDouble42.isEmpty();
        boolean boolean46 = optionalDouble42.equals((java.lang.Object) 0.0f);
        boolean boolean47 = optionalDouble40.equals((java.lang.Object) optionalDouble42);
        boolean boolean48 = optionalDouble32.equals((java.lang.Object) optionalDouble42);
        boolean boolean49 = optionalDouble32.isEmpty();
        java.util.stream.DoubleStream doubleStream50 = optionalDouble32.stream();
        java.lang.String str51 = optionalDouble32.toString();
        boolean boolean52 = optionalDouble15.equals((java.lang.Object) str51);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalDouble22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OptionalDouble[1.0]" + "'", str25, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertNotNull(optionalDouble42);
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "OptionalDouble[1.0]" + "'", str51, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        double double13 = optionalDouble12.orElseThrow();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 1L);
        double double17 = optionalDouble15.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream18 = optionalDouble15.stream();
        boolean boolean19 = optionalDouble12.equals((java.lang.Object) optionalDouble15);
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) optionalDouble15);
        double double22 = optionalDouble15.orElse((double) (short) -1);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble15.orElseGet(doubleSupplier23);
        double double25 = optionalDouble15.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double3 = optionalDouble1.orElse((double) (-1));
        double double4 = optionalDouble1.getAsDouble();
        double double5 = optionalDouble1.orElseThrow();
        double double7 = optionalDouble1.orElse(10.0d);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        double double4 = optionalDouble1.orElse((double) 0.0f);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.util.OptionalDouble optionalDouble17 = java.util.OptionalDouble.of(10.0d);
        boolean boolean18 = optionalDouble5.equals((java.lang.Object) optionalDouble17);
        boolean boolean19 = optionalDouble17.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalDouble17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        java.util.function.DoubleConsumer doubleConsumer22 = null;
        java.lang.Runnable runnable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer22, runnable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        double double12 = optionalDouble1.orElseThrow();
        java.lang.String str13 = optionalDouble1.toString();
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 100L);
        double double16 = optionalDouble15.orElseThrow();
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of((double) 1L);
        double double20 = optionalDouble18.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream21 = optionalDouble18.stream();
        boolean boolean22 = optionalDouble15.equals((java.lang.Object) optionalDouble18);
        double double24 = optionalDouble15.orElse((double) ' ');
        java.util.function.DoubleSupplier doubleSupplier25 = null;
        double double26 = optionalDouble15.orElseGet(doubleSupplier25);
        java.util.function.DoubleSupplier doubleSupplier27 = null;
        double double28 = optionalDouble15.orElseGet(doubleSupplier27);
        boolean boolean29 = optionalDouble1.equals((java.lang.Object) double28);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalDouble[100.0]" + "'", str13, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1));
        double double3 = optionalDouble1.orElse((double) 1L);
        boolean boolean4 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.lang.String str5 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[10.0]" + "'", str5, "OptionalDouble[10.0]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        optionalDouble0.ifPresent(doubleConsumer2);
        double double5 = optionalDouble0.orElse((double) 0L);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble6.stream();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        optionalDouble6.ifPresent(doubleConsumer9);
        boolean boolean11 = optionalDouble0.equals((java.lang.Object) optionalDouble6);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = optionalDouble0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1));
        java.lang.String str2 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[-1.0]" + "'", str2, "OptionalDouble[-1.0]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        boolean boolean22 = optionalDouble1.isEmpty();
        java.lang.Class<?> wildcardClass23 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100);
        double double2 = optionalDouble1.orElseThrow();
        boolean boolean3 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.util.OptionalDouble optionalDouble17 = java.util.OptionalDouble.of(10.0d);
        boolean boolean18 = optionalDouble5.equals((java.lang.Object) optionalDouble17);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble5.stream();
        java.lang.Class<?> wildcardClass20 = doubleStream19.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalDouble17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.OptionalDouble optionalDouble11 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble11.stream();
        boolean boolean13 = optionalDouble11.isEmpty();
        boolean boolean15 = optionalDouble11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalDouble11.isEmpty();
        boolean boolean17 = optionalDouble11.isEmpty();
        boolean boolean19 = optionalDouble11.equals((java.lang.Object) '4');
        double double20 = optionalDouble11.getAsDouble();
        double double21 = optionalDouble11.getAsDouble();
        boolean boolean22 = optionalDouble11.isPresent();
        java.lang.String str23 = optionalDouble11.toString();
        boolean boolean24 = optionalDouble1.equals((java.lang.Object) optionalDouble11);
        java.util.function.DoubleSupplier doubleSupplier25 = null;
        double double26 = optionalDouble11.orElseGet(doubleSupplier25);
        java.util.function.DoubleSupplier doubleSupplier27 = null;
        double double28 = optionalDouble11.orElseGet(doubleSupplier27);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalDouble11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OptionalDouble[100.0]" + "'", str23, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        double double10 = optionalDouble1.orElseThrow();
        double double11 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        boolean boolean5 = optionalDouble0.isEmpty();
        boolean boolean6 = optionalDouble0.isEmpty();
        java.lang.String str7 = optionalDouble0.toString();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalDouble.empty" + "'", str7, "OptionalDouble.empty");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        boolean boolean18 = optionalDouble10.isPresent();
        double double19 = optionalDouble10.getAsDouble();
        boolean boolean20 = optionalDouble10.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble1.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 0);
        double double3 = optionalDouble1.orElse((double) 0L);
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        boolean boolean7 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble1.orElseGet(doubleSupplier21);
        boolean boolean23 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream24 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass25 = doubleStream24.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        double double6 = optionalDouble1.orElse((double) 100.0f);
        double double8 = optionalDouble1.orElse((double) (short) 10);
        java.lang.Class<?> wildcardClass9 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble8 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream9 = optionalDouble8.stream();
        boolean boolean10 = optionalDouble8.isEmpty();
        double double12 = optionalDouble8.orElse((double) 1L);
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) 1L);
        double double14 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        double double2 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble3.stream();
        java.lang.Class<?> wildcardClass6 = doubleStream5.getClass();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) doubleStream5);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble8 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream9 = optionalDouble8.stream();
        boolean boolean10 = optionalDouble8.isEmpty();
        double double12 = optionalDouble8.orElse((double) 1L);
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) 1L);
        java.util.OptionalDouble optionalDouble15 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream16 = optionalDouble15.stream();
        boolean boolean17 = optionalDouble15.isEmpty();
        boolean boolean19 = optionalDouble15.equals((java.lang.Object) 0.0f);
        boolean boolean20 = optionalDouble15.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble15.orElseGet(doubleSupplier21);
        double double23 = optionalDouble15.orElseThrow();
        java.util.stream.DoubleStream doubleStream24 = optionalDouble15.stream();
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of((double) 100L);
        double double27 = optionalDouble26.orElseThrow();
        java.util.OptionalDouble optionalDouble29 = java.util.OptionalDouble.of((double) 1L);
        double double31 = optionalDouble29.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble29.stream();
        boolean boolean33 = optionalDouble26.equals((java.lang.Object) optionalDouble29);
        boolean boolean34 = optionalDouble15.equals((java.lang.Object) optionalDouble29);
        java.util.OptionalDouble optionalDouble36 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier37 = null;
        double double38 = optionalDouble36.orElseGet(doubleSupplier37);
        java.lang.String str39 = optionalDouble36.toString();
        double double41 = optionalDouble36.orElse((double) 100.0f);
        boolean boolean42 = optionalDouble29.equals((java.lang.Object) double41);
        java.util.stream.DoubleStream doubleStream43 = optionalDouble29.stream();
        boolean boolean44 = optionalDouble1.equals((java.lang.Object) optionalDouble29);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionalDouble15);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(optionalDouble36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "OptionalDouble[1.0]" + "'", str39, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        double double6 = optionalDouble1.orElse((double) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 100);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean7 = optionalDouble3.equals((java.lang.Object) 0.0f);
        boolean boolean8 = optionalDouble3.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble3.orElseGet(doubleSupplier9);
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream13 = optionalDouble12.stream();
        boolean boolean14 = optionalDouble12.isEmpty();
        boolean boolean16 = optionalDouble12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalDouble12.isEmpty();
        boolean boolean18 = optionalDouble12.isEmpty();
        boolean boolean19 = optionalDouble3.equals((java.lang.Object) optionalDouble12);
        double double20 = optionalDouble3.orElseThrow();
        java.util.OptionalDouble optionalDouble21 = java.util.OptionalDouble.empty();
        java.lang.Class<?> wildcardClass22 = optionalDouble21.getClass();
        boolean boolean23 = optionalDouble3.equals((java.lang.Object) optionalDouble21);
        boolean boolean24 = optionalDouble1.equals((java.lang.Object) optionalDouble3);
        double double25 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream26 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream26);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.OptionalDouble optionalDouble2 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream3 = optionalDouble2.stream();
        boolean boolean4 = optionalDouble2.isEmpty();
        boolean boolean5 = optionalDouble2.isEmpty();
        boolean boolean6 = optionalDouble2.isPresent();
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) optionalDouble2);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        boolean boolean10 = optionalDouble0.isPresent();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble12.orElseGet(doubleSupplier13);
        java.util.stream.DoubleStream doubleStream15 = optionalDouble12.stream();
        double double16 = optionalDouble12.orElseThrow();
        java.util.stream.DoubleStream doubleStream17 = optionalDouble12.stream();
        boolean boolean18 = optionalDouble0.equals((java.lang.Object) optionalDouble12);
        java.util.function.DoubleConsumer doubleConsumer19 = null;
        java.lang.Runnable runnable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble12.ifPresentOrElse(doubleConsumer19, runnable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        java.util.stream.DoubleStream doubleStream17 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        optionalDouble6.ifPresent(doubleConsumer18);
        java.util.stream.DoubleStream doubleStream20 = optionalDouble6.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        boolean boolean11 = optionalDouble1.isEmpty();
        double double12 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream13 = optionalDouble1.stream();
        java.lang.String str14 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble[100.0]" + "'", str14, "OptionalDouble[100.0]");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        java.lang.String str3 = optionalDouble1.toString();
        java.util.function.DoubleConsumer doubleConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble[0.0]" + "'", str3, "OptionalDouble[0.0]");
    }
}

