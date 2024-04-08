package org.huawei.optional;

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
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableOptionalOptional0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableStreamOptional0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableStreamOptional0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.of("Optional[1]");
        java.lang.Class<?> wildcardClass2 = strOptional1.getClass();
        org.junit.Assert.assertNotNull(strOptional1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(charSequenceOptional0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOptional0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(constantDescOptional0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Optional<java.lang.constant.Constable> constableOptional1 = java.util.Optional.of((java.lang.constant.Constable) 1L);
        org.junit.Assert.assertNotNull(constableOptional1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.io.Serializable serializable9 = serializableOptional1.orElse((java.io.Serializable) (short) 10);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "Optional[1]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional8 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream7);
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional9 = java.util.Optional.of((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional8);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strComparableOptional0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("Optional[1]");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.constant.ConstantDesc constantDesc0 = null;
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable(constantDesc0);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass3 = serializableStream2.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional4 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass3);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional5 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass3);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeOptional4);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Optional<java.lang.String> strOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strOptional0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Optional<java.lang.constant.Constable> constableOptional1 = java.util.Optional.ofNullable((java.lang.constant.Constable) 1.0d);
        org.junit.Assert.assertNotNull(constableOptional1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(autoCloseableOptional0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Optional<java.lang.String> strOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strOptional0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.lang.String str14 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream15);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.lang.Class<?> wildcardClass14 = serializableStream12.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.constant.ConstantDesc constantDesc0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of(constantDesc0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass5 = serializableStream4.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(annotatedElementOptional0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional9 = java.util.Optional.of((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Class<?> wildcardClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Class<?>> wildcardClassOptional1 = java.util.Optional.of(wildcardClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(genericDeclarationOptional0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("Optional[1]");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(annotatedElementOptional0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional14 = java.util.Optional.of((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream12);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional14);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional8 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Optional<java.lang.reflect.Type> typeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeOptional0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(genericDeclarationOptional0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional5 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream4);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable20 = serializableOptional8.orElse((java.io.Serializable) (-1L));
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) (short) 0);
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional12.stream();
        java.io.Serializable serializable15 = serializableOptional12.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional12.stream();
        boolean boolean17 = serializableOptional8.equals((java.lang.Object) serializableOptional12);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) boolean17);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = null;
        java.io.Serializable serializable9 = serializableOptional1.orElse(serializable8);
        boolean boolean10 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.lang.String str7 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional1.equals((java.lang.Object) serializable10);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Object> objOptional1 = java.util.Optional.of(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.lang.String str5 = serializableOptional1.toString();
        boolean boolean6 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of(strComparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "Optional[1]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Optional<java.lang.Object> objOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(objOptional0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOptional0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional7.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional7.stream();
        java.io.Serializable serializable11 = serializableOptional7.get();
        java.io.Serializable serializable12 = serializableOptional7.orElseThrow();
        boolean boolean13 = serializableOptional7.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional7.stream();
        boolean boolean15 = serializableOptional7.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional7.stream();
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableStream16);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) 1);
        java.lang.Class<?> wildcardClass2 = constantDescOptional1.getClass();
        org.junit.Assert.assertNotNull(constantDescOptional1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass8 = serializableStream7.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional9 = java.util.Optional.of((java.lang.constant.Constable) wildcardClass8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(constableOptional9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass2 = constantDescOptional1.getClass();
        org.junit.Assert.assertNotNull(constantDescOptional1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional9.isPresent();
        java.io.Serializable serializable12 = serializableOptional9.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable13 = serializableOptional9.get();
        java.lang.String str14 = serializableOptional9.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional9.stream();
        java.lang.Class<?> wildcardClass16 = serializableOptional9.getClass();
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableOptional9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeDescriptorOptional0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isEmpty();
        boolean boolean6 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.io.Serializable serializable13 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable14 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Optional<java.lang.reflect.Type> typeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeOptional0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional0 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass1 = strComparableOptional0.getClass();
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional2 = java.util.Optional.of(wildcardClass1);
        org.junit.Assert.assertNotNull(strComparableOptional0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClassOptional2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.lang.String str5 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass6 = serializableOptional1.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional7 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableOptional7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Optional<java.io.Serializable> serializableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableOptional0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        boolean boolean6 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional4 = java.util.Optional.of(serializableOptional1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional7 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.io.Serializable serializable8 = serializableOptional1.orElse((java.io.Serializable) wildcardClass6);
        java.util.Optional<java.lang.reflect.Type> typeOptional9 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(genericDeclarationOptional7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(typeOptional9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional8 = java.util.Optional.of(serializableOptional1);
        boolean boolean9 = serializableOptional1.isPresent();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableOptionalOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.lang.String str10 = serializableOptional1.toString();
        java.lang.String str11 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional[1]" + "'", str11, "Optional[1]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.orElseThrow();
        java.lang.Class<?> wildcardClass14 = serializable13.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional15 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass14);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.io.Serializable serializable17 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(constableOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean12 = serializableOptional10.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass13 = serializableOptional10.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        boolean boolean15 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        boolean boolean10 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        boolean boolean4 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass5 = serializableOptional1.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional6 = java.util.Optional.ofNullable((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass5);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.lang.Class<?> wildcardClass12 = serializableStream11.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional13 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional14 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass12);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional15 = java.util.Optional.ofNullable(wildcardClass12);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass12);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass18 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeOptional13);
        org.junit.Assert.assertNotNull(annotatedElementOptional14);
        org.junit.Assert.assertNotNull(wildcardClassOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass8 = serializableStream7.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional9 = java.util.Optional.of((java.lang.reflect.Type) wildcardClass8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeOptional9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        boolean boolean12 = serializableOptional8.isPresent();
        boolean boolean13 = serializableOptional8.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional8.stream();
        java.lang.Class<?> wildcardClass15 = serializableStream14.getClass();
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass15);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(serializableStream10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional8 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional1 = java.util.Optional.ofNullable(genericDeclaration0);
        org.junit.Assert.assertNotNull(genericDeclarationOptional1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean16 = serializableOptional15.isPresent();
        java.io.Serializable serializable18 = serializableOptional15.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable19 = serializableOptional15.get();
        java.lang.String str20 = serializableOptional15.toString();
        java.lang.Class<?> wildcardClass21 = serializableOptional15.getClass();
        java.io.Serializable serializable22 = serializableOptional8.orElse((java.io.Serializable) wildcardClass21);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        boolean boolean24 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Optional[1]" + "'", str20, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable9 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean10 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable10 = serializableOptional7.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional7.stream();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        boolean boolean13 = serializableOptional7.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) "Optional[10.0]");
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "Optional[1]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean16 = serializableOptional15.isPresent();
        java.io.Serializable serializable18 = serializableOptional15.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable19 = serializableOptional15.get();
        java.lang.String str20 = serializableOptional15.toString();
        java.lang.Class<?> wildcardClass21 = serializableOptional15.getClass();
        java.io.Serializable serializable22 = serializableOptional8.orElse((java.io.Serializable) wildcardClass21);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        boolean boolean24 = serializableOptional8.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Optional[1]" + "'", str20, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable19 = serializableOptional8.orElseThrow();
        boolean boolean20 = serializableOptional8.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean14 = serializableOptional12.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional12.stream();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableStream15);
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional17 = java.util.Optional.of((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream15);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional17);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>> serializableBaseStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional1 = java.util.Optional.of(serializableBaseStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.lang.String str13 = serializableOptional8.toString();
        java.lang.Class<?> wildcardClass14 = serializableOptional8.getClass();
        java.io.Serializable serializable15 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional17 = java.util.Optional.of(serializableStream16);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertNotNull(serializableStreamOptional17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        boolean boolean5 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(autoCloseableOptional0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.lang.String str19 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Optional[1]" + "'", str19, "Optional[1]");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.lang.String str10 = serializableOptional1.toString();
        boolean boolean11 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "Optional[class java.util.Optional]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional10 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationOptional10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass6 = serializableOptional1.getClass();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) wildcardClass6);
        boolean boolean8 = serializableOptional7.isPresent();
        boolean boolean9 = serializableOptional7.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable11 = serializableOptional10.get();
        java.io.Serializable serializable12 = serializableOptional10.orElseThrow();
        java.lang.Class<?> wildcardClass13 = serializable12.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        java.io.Serializable serializable15 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable10 = serializableOptional7.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional7.stream();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.util.Optional<java.lang.Object> objOptional13 = java.util.Optional.ofNullable((java.lang.Object) serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objOptional13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.ofNullable((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = serializableOptional1.get();
        boolean boolean3 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + 10.0f + "'", serializable2, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable13 = serializableOptional12.get();
        java.io.Serializable serializable14 = serializableOptional12.get();
        java.io.Serializable serializable15 = serializableOptional12.get();
        boolean boolean16 = serializableOptional12.isEmpty();
        java.io.Serializable serializable17 = serializableOptional12.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableOptional12.stream();
        java.lang.Class<?> wildcardClass19 = serializableStream18.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional20 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass19);
        java.io.Serializable serializable21 = serializableOptional1.orElse((java.io.Serializable) wildcardClass19);
        java.io.Serializable serializable22 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeDescriptorOptional20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional4 = java.util.Optional.of(serializableOptional1);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional6 = java.util.Optional.ofNullable(serializableOptional1);
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass10 = serializableStream9.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional1.stream();
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.lang.Object> objOptional9 = java.util.Optional.of((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objOptional9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass3 = serializableStream2.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional4 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass3);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional5 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional6 = java.util.Optional.ofNullable(wildcardClass3);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional7 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass3);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeOptional4);
        org.junit.Assert.assertNotNull(annotatedElementOptional5);
        org.junit.Assert.assertNotNull(wildcardClassOptional6);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.lang.String str13 = serializableOptional8.toString();
        java.lang.Class<?> wildcardClass14 = serializableOptional8.getClass();
        java.io.Serializable serializable15 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.lang.String str16 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Optional[1]" + "'", str16, "Optional[1]");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        boolean boolean18 = serializableOptional11.isEmpty();
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional1.stream();
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional21 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream20);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertNotNull(autoCloseableOptional21);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.util.Optional<java.lang.Object> objOptional7 = java.util.Optional.ofNullable((java.lang.Object) serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objOptional7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional11 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream10);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(autoCloseableOptional11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable7 = serializableOptional6.get();
        java.io.Serializable serializable8 = serializableOptional6.get();
        java.io.Serializable serializable9 = serializableOptional6.get();
        boolean boolean10 = serializableOptional6.isEmpty();
        java.io.Serializable serializable11 = serializableOptional6.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional6.stream();
        java.lang.Class<?> wildcardClass13 = serializableStream12.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional14 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass13);
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) typeDescriptorOptional14);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableOptional17.stream();
        boolean boolean20 = serializableOptional17.equals((java.lang.Object) false);
        java.lang.String str21 = serializableOptional17.toString();
        java.io.Serializable serializable22 = serializableOptional17.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional17.stream();
        java.lang.Class<?> wildcardClass24 = serializableOptional17.getClass();
        boolean boolean25 = serializableOptional1.equals((java.lang.Object) serializableOptional17);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeDescriptorOptional14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertNotNull(serializableStream18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Optional[1]" + "'", str21, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.String str8 = serializableOptional1.toString();
        boolean boolean9 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strComparableOptional0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.lang.Class<?> wildcardClass10 = serializableStream9.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional11 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass10);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional12 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass10);
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional13 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass10);
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) genericDeclarationOptional13);
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional16.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional18 = java.util.Optional.ofNullable(serializableOptional16);
        boolean boolean19 = serializableOptional16.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional21.stream();
        boolean boolean23 = serializableOptional21.isEmpty();
        java.io.Serializable serializable24 = serializableOptional21.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional26 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean28 = serializableOptional26.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional26.stream();
        java.io.Serializable serializable30 = serializableOptional26.get();
        java.lang.Class<?> wildcardClass31 = serializableOptional26.getClass();
        java.io.Serializable serializable32 = serializableOptional21.orElse((java.io.Serializable) wildcardClass31);
        boolean boolean33 = serializableOptional16.equals((java.lang.Object) wildcardClass31);
        java.util.Optional<java.io.Serializable> serializableOptional35 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream36 = serializableOptional35.stream();
        java.io.Serializable serializable38 = serializableOptional35.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream39 = serializableOptional35.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional40 = java.util.Optional.ofNullable(serializableStream39);
        java.lang.Class<?> wildcardClass41 = serializableStreamOptional40.getClass();
        java.io.Serializable serializable42 = serializableOptional16.orElse((java.io.Serializable) wildcardClass41);
        java.lang.String str43 = serializableOptional16.toString();
        boolean boolean44 = serializableOptional1.equals((java.lang.Object) serializableOptional16);
        java.lang.String str45 = serializableOptional16.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeOptional11);
        org.junit.Assert.assertNotNull(typeDescriptorOptional12);
        org.junit.Assert.assertNotNull(genericDeclarationOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertNotNull(serializableOptionalOptional18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (byte) 1 + "'", serializable32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serializableOptional35);
        org.junit.Assert.assertNotNull(serializableStream36);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + (byte) 1 + "'", serializable38, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream39);
        org.junit.Assert.assertNotNull(serializableStreamOptional40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (byte) 1 + "'", serializable42, (byte) 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Optional[1]" + "'", str43, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Optional[1]" + "'", str45, "Optional[1]");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.lang.String str13 = serializableOptional8.toString();
        java.lang.Class<?> wildcardClass14 = serializableOptional8.getClass();
        java.io.Serializable serializable15 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.Optional<java.io.Serializable> serializableOptional19 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional19.stream();
        java.lang.Class<?> wildcardClass21 = serializableStream20.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional22 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass21);
        boolean boolean23 = serializableOptional17.equals((java.lang.Object) wildcardClass21);
        boolean boolean24 = serializableOptional1.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertNotNull(serializableOptional19);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(typeOptional22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) "");
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Optional<java.lang.Object> objOptional0 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass1 = objOptional0.getClass();
        org.junit.Assert.assertNotNull(objOptional0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.io.Serializable serializable13 = serializableOptional10.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable14 = serializableOptional10.get();
        boolean boolean15 = serializableOptional10.isPresent();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableOptional10);
        boolean boolean17 = serializableOptional10.isEmpty();
        java.io.Serializable serializable19 = serializableOptional10.orElse((java.io.Serializable) 10.0f);
        java.lang.Class<?> wildcardClass20 = serializableOptional10.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Object obj8 = null;
        boolean boolean9 = serializableOptional1.equals(obj8);
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean12 = serializableOptional11.isPresent();
        java.io.Serializable serializable14 = serializableOptional11.orElse((java.io.Serializable) (byte) 10);
        java.lang.String str15 = serializableOptional11.toString();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) str15);
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean20 = serializableOptional18.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional18.stream();
        java.io.Serializable serializable22 = serializableOptional18.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional1.equals((java.lang.Object) serializableStream23);
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional25 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream23);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Optional[1]" + "'", str15, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(autoCloseableOptional25);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Object obj8 = null;
        boolean boolean9 = serializableOptional1.equals(obj8);
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean12 = serializableOptional11.isPresent();
        java.io.Serializable serializable14 = serializableOptional11.orElse((java.io.Serializable) (byte) 10);
        java.lang.String str15 = serializableOptional11.toString();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) str15);
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean20 = serializableOptional18.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional18.stream();
        java.io.Serializable serializable22 = serializableOptional18.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional1.equals((java.lang.Object) serializableStream23);
        java.util.Optional<java.io.Serializable> serializableOptional26 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean28 = serializableOptional26.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional26.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional30 = java.util.Optional.empty();
        boolean boolean31 = serializableOptional26.equals((java.lang.Object) strComparableOptional30);
        boolean boolean32 = serializableOptional1.equals((java.lang.Object) strComparableOptional30);
        java.util.Optional<java.lang.Object> objOptional33 = java.util.Optional.of((java.lang.Object) strComparableOptional30);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Optional[1]" + "'", str15, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serializableOptional26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertNotNull(strComparableOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objOptional33);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable19 = serializableOptional8.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional8.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream20);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) (short) 0);
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.get();
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.io.Serializable serializable18 = serializableOptional11.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) "");
        java.lang.String str7 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass8 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        boolean boolean10 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        boolean boolean4 = serializableOptional1.isPresent();
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(charSequenceOptional0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        boolean boolean11 = serializableOptional1.isPresent();
        boolean boolean12 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        boolean boolean16 = serializableOptional8.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional18.stream();
        boolean boolean21 = serializableOptional18.equals((java.lang.Object) false);
        java.lang.String str22 = serializableOptional18.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional8.equals((java.lang.Object) serializableOptional18);
        java.util.stream.Stream<java.io.Serializable> serializableStream25 = serializableOptional8.stream();
        java.lang.Class<?> wildcardClass26 = serializableOptional8.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Optional[1]" + "'", str22, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(serializableStream25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "Optional[10.0]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Optional<java.io.Serializable> serializableOptional0 = java.util.Optional.empty();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional1 = java.util.Optional.empty();
        boolean boolean2 = serializableOptional0.equals((java.lang.Object) serializableBaseStreamOptional1);
        org.junit.Assert.assertNotNull(serializableOptional0);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableStreamOptional0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        boolean boolean10 = serializableOptional1.isEmpty();
        boolean boolean11 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.invoke.TypeDescriptor typeDescriptor0 = null;
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional1 = java.util.Optional.ofNullable(typeDescriptor0);
        org.junit.Assert.assertNotNull(typeDescriptorOptional1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional19 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional20 = java.util.Optional.of(wildcardClass16);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeDescriptorOptional19);
        org.junit.Assert.assertNotNull(wildcardClassOptional20);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        boolean boolean7 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(serializableStream11);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.io.Serializable serializable10 = serializableOptional1.get();
        java.io.Serializable serializable11 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.lang.Class<?> wildcardClass8 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        boolean boolean19 = serializableOptional8.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional8.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableStream20);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Object obj8 = null;
        boolean boolean9 = serializableOptional1.equals(obj8);
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean12 = serializableOptional11.isPresent();
        java.io.Serializable serializable14 = serializableOptional11.orElse((java.io.Serializable) (byte) 10);
        java.lang.String str15 = serializableOptional11.toString();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) str15);
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean20 = serializableOptional18.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional18.stream();
        java.io.Serializable serializable22 = serializableOptional18.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional1.equals((java.lang.Object) serializableStream23);
        java.util.Optional<java.io.Serializable> serializableOptional26 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean28 = serializableOptional26.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional26.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional30 = java.util.Optional.empty();
        boolean boolean31 = serializableOptional26.equals((java.lang.Object) strComparableOptional30);
        boolean boolean32 = serializableOptional1.equals((java.lang.Object) strComparableOptional30);
        java.util.Optional<java.io.Serializable> serializableOptional34 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream35 = serializableOptional34.stream();
        boolean boolean36 = serializableOptional34.isPresent();
        boolean boolean38 = serializableOptional34.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass39 = serializableOptional34.getClass();
        java.util.Optional<java.io.Serializable> serializableOptional40 = java.util.Optional.of((java.io.Serializable) wildcardClass39);
        java.lang.String str41 = serializableOptional40.toString();
        boolean boolean42 = serializableOptional1.equals((java.lang.Object) str41);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Optional[1]" + "'", str15, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serializableOptional26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertNotNull(strComparableOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableOptional34);
        org.junit.Assert.assertNotNull(serializableStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(serializableOptional40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Optional[class java.util.Optional]" + "'", str41, "Optional[class java.util.Optional]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass8 = serializableStream7.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.io.Serializable serializable23 = serializableOptional20.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional20.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional25 = java.util.Optional.ofNullable(serializableStream24);
        java.lang.Class<?> wildcardClass26 = serializableStreamOptional25.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        java.lang.String str28 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional30 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean32 = serializableOptional30.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableOptional30.stream();
        java.io.Serializable serializable34 = serializableOptional30.get();
        java.lang.Class<?> wildcardClass35 = serializableOptional30.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional36 = java.util.Optional.ofNullable((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass35);
        java.io.Serializable serializable37 = serializableOptional1.orElse((java.io.Serializable) wildcardClass35);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableStreamOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Optional[1]" + "'", str28, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableStream33);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional36);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (byte) 1 + "'", serializable37, (byte) 1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.lang.Class<?> wildcardClass4 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional5 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericDeclarationOptional5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.io.Serializable serializable9 = serializableOptional1.get();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional10 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass11 = strComparableOptional10.getClass();
        java.io.Serializable serializable12 = serializableOptional1.orElse((java.io.Serializable) wildcardClass11);
        java.util.Optional<java.io.Serializable> serializableOptional13 = java.util.Optional.of(serializable12);
        boolean boolean14 = serializableOptional13.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(strComparableOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.io.Serializable serializable23 = serializableOptional20.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional20.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional25 = java.util.Optional.ofNullable(serializableStream24);
        java.lang.Class<?> wildcardClass26 = serializableStreamOptional25.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        boolean boolean28 = serializableOptional1.isPresent();
        boolean boolean29 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableStreamOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        boolean boolean10 = serializableOptional1.isEmpty();
        java.io.Serializable serializable11 = serializableOptional1.get();
        java.io.Serializable serializable12 = serializableOptional1.get();
        boolean boolean13 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable9 = serializableOptional1.orElse((java.io.Serializable) 100L);
        java.lang.String str10 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable13 = serializableOptional12.get();
        java.io.Serializable serializable14 = serializableOptional12.get();
        java.io.Serializable serializable15 = serializableOptional12.get();
        boolean boolean16 = serializableOptional12.isEmpty();
        java.io.Serializable serializable17 = serializableOptional12.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableOptional12.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional12.stream();
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional21.stream();
        java.lang.Class<?> wildcardClass23 = serializableStream22.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional24 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass23);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional25 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass23);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional26 = java.util.Optional.ofNullable(wildcardClass23);
        java.io.Serializable serializable27 = serializableOptional12.orElse((java.io.Serializable) wildcardClass23);
        java.io.Serializable serializable28 = serializableOptional1.orElse(serializable27);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeOptional24);
        org.junit.Assert.assertNotNull(annotatedElementOptional25);
        org.junit.Assert.assertNotNull(wildcardClassOptional26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass8 = serializableOptional1.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional9 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(constableOptional9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional1.stream();
        java.lang.Object obj15 = null;
        boolean boolean16 = serializableOptional1.equals(obj15);
        java.io.Serializable serializable17 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        java.io.Serializable serializable16 = serializableOptional8.get();
        java.lang.String str17 = serializableOptional8.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Optional[1]" + "'", str17, "Optional[1]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.io.Serializable serializable23 = serializableOptional20.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional20.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional25 = java.util.Optional.ofNullable(serializableStream24);
        java.lang.Class<?> wildcardClass26 = serializableStreamOptional25.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        boolean boolean28 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional30 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream29);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableStreamOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional30);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) "Optional[10.0]");
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Optional<java.io.Serializable> serializableOptional0 = java.util.Optional.empty();
        java.io.Serializable serializable2 = serializableOptional0.orElse((java.io.Serializable) 1);
        org.junit.Assert.assertNotNull(serializableOptional0);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + 1 + "'", serializable2, 1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional8 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(annotatedElementOptional8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional8 = java.util.Optional.of(serializableOptional1);
        java.io.Serializable serializable9 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableOptionalOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional5 = java.util.Optional.of((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream4);
        java.lang.Class<?> wildcardClass6 = serializableStream4.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional8 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional9 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeOptional8);
        org.junit.Assert.assertNotNull(annotatedElementOptional9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.Optional<java.lang.constant.Constable> constableOptional9 = java.util.Optional.of((java.lang.constant.Constable) 100);
        java.lang.Class<?> wildcardClass10 = constableOptional9.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional11 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass10);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional12 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass10);
        java.io.Serializable serializable13 = serializableOptional1.orElse((java.io.Serializable) wildcardClass10);
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable16 = serializableOptional15.get();
        java.io.Serializable serializable17 = serializableOptional15.get();
        java.io.Serializable serializable18 = serializableOptional15.get();
        boolean boolean19 = serializableOptional15.isEmpty();
        java.io.Serializable serializable20 = serializableOptional15.orElseThrow();
        boolean boolean22 = serializableOptional15.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable23 = serializableOptional15.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional15.stream();
        java.io.Serializable serializable25 = serializableOptional15.get();
        java.lang.Class<?> wildcardClass26 = serializableOptional15.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        java.io.Serializable serializable28 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(constableOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeOptional11);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOptional0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.io.Serializable serializable9 = serializableOptional1.get();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional1 = java.util.Optional.of(wildcardClassOfField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.lang.Class<?> wildcardClass15 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional5.stream();
        java.lang.Class<?> wildcardClass7 = serializableStream6.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional8 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional9 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass7);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional10 = java.util.Optional.ofNullable(wildcardClass7);
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional11 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass7);
        java.io.Serializable serializable12 = serializableOptional1.orElse((java.io.Serializable) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeOptional8);
        org.junit.Assert.assertNotNull(annotatedElementOptional9);
        org.junit.Assert.assertNotNull(wildcardClassOptional10);
        org.junit.Assert.assertNotNull(genericDeclarationOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        boolean boolean14 = serializableOptional8.isEmpty();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        boolean boolean16 = serializableOptional1.isEmpty();
        java.lang.String str17 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Optional[1]" + "'", str17, "Optional[1]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) 1.0f);
        java.util.Optional<java.io.Serializable> serializableOptional3 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean5 = serializableOptional3.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional3.stream();
        java.lang.String str7 = serializableOptional3.toString();
        boolean boolean8 = serializableOptional3.isEmpty();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        boolean boolean13 = serializableOptional7.isEmpty();
        java.io.Serializable serializable14 = serializableOptional7.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional11 = java.util.Optional.of(serializableOptional8);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional14 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass13);
        java.io.Serializable serializable15 = serializableOptional8.orElse((java.io.Serializable) wildcardClass13);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional17 = java.util.Optional.ofNullable((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass13);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(genericDeclarationOptional14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional17);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional5 = java.util.Optional.of((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream4);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean4 = serializableOptional1.isPresent();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.Optional<java.io.Serializable> serializableOptional3 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional3.stream();
        java.lang.Class<?> wildcardClass5 = serializableStream4.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional6 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = serializableOptional1.equals((java.lang.Object) wildcardClass5);
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional10 = java.util.Optional.ofNullable(wildcardClass9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional3);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClassOptional10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.ofNullable((java.io.Serializable) 10.0f);
        java.lang.String str2 = serializableOptional1.toString();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Optional[10.0]" + "'", str2, "Optional[10.0]");
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + 10.0f + "'", serializable3, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) "Optional[1]");
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional11.stream();
        boolean boolean13 = serializableOptional11.isPresent();
        boolean boolean14 = serializableOptional11.isPresent();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean18 = serializableOptional17.isPresent();
        java.io.Serializable serializable20 = serializableOptional17.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable21 = serializableOptional17.get();
        java.lang.String str22 = serializableOptional17.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional17.stream();
        java.util.Optional<java.io.Serializable> serializableOptional25 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean26 = serializableOptional25.isPresent();
        java.io.Serializable serializable28 = serializableOptional25.orElse((java.io.Serializable) (byte) 10);
        boolean boolean29 = serializableOptional17.equals((java.lang.Object) serializable28);
        java.lang.Class<?> wildcardClass30 = serializableOptional17.getClass();
        java.io.Serializable serializable31 = serializableOptional11.orElse((java.io.Serializable) wildcardClass30);
        java.io.Serializable serializable32 = serializableOptional1.orElse(serializable31);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Optional[1]" + "'", str22, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertNotNull(serializableOptional25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + (byte) 1 + "'", serializable31, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (byte) 1 + "'", serializable32, (byte) 1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean8 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable10 = serializableOptional7.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional7.stream();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.lang.Class<?> wildcardClass13 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "Optional[1]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        boolean boolean10 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "Optional[1]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.AutoCloseable autoCloseable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional1 = java.util.Optional.of(autoCloseable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        boolean boolean4 = serializableOptional1.isEmpty();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Optional<java.lang.constant.Constable> constableOptional1 = java.util.Optional.of((java.lang.constant.Constable) (-1));
        org.junit.Assert.assertNotNull(constableOptional1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.lang.constant.Constable> constableOptional19 = java.util.Optional.of((java.lang.constant.Constable) boolean18);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(constableOptional19);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional8 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass7);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional9 = java.util.Optional.of(wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(constableOptional8);
        org.junit.Assert.assertNotNull(wildcardClassOptional9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.lang.String str9 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Optional[1]" + "'", str9, "Optional[1]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.of("Optional[10.0]");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) "");
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isPresent();
        boolean boolean10 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Optional<java.lang.reflect.Type> typeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeOptional0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        boolean boolean18 = serializableOptional11.isEmpty();
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional1.stream();
        java.lang.String str21 = serializableOptional1.toString();
        java.io.Serializable serializable22 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Optional[1]" + "'", str21, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional8.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional12 = java.util.Optional.empty();
        boolean boolean13 = serializableOptional8.equals((java.lang.Object) strComparableOptional12);
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) boolean13);
        java.io.Serializable serializable15 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(strComparableOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional1.get();
        java.lang.Class<?> wildcardClass11 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional12 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass11);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional13 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass11);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeOptional12);
        org.junit.Assert.assertNotNull(annotatedElementOptional13);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.invoke.TypeDescriptor typeDescriptor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional1 = java.util.Optional.of(typeDescriptor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        boolean boolean19 = serializableOptional8.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable22 = serializableOptional21.get();
        java.io.Serializable serializable23 = serializableOptional21.get();
        java.io.Serializable serializable24 = serializableOptional21.get();
        boolean boolean25 = serializableOptional21.isEmpty();
        java.io.Serializable serializable26 = serializableOptional21.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream27 = serializableOptional21.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream28 = serializableOptional21.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional21.stream();
        boolean boolean30 = serializableOptional8.equals((java.lang.Object) serializableStream29);
        boolean boolean31 = serializableOptional8.isEmpty();
        java.io.Serializable serializable32 = serializableOptional8.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream27);
        org.junit.Assert.assertNotNull(serializableStream28);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (byte) 1 + "'", serializable32, (byte) 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        boolean boolean6 = serializableOptional1.isPresent();
        boolean boolean7 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of((java.lang.Comparable<java.lang.String>) "Optional[1]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.constant.ConstantDesc constantDesc0 = null;
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable(constantDesc0);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.io.Serializable serializable13 = serializableOptional10.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable14 = serializableOptional10.get();
        boolean boolean15 = serializableOptional10.isPresent();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableOptional10);
        boolean boolean17 = serializableOptional10.isEmpty();
        boolean boolean18 = serializableOptional10.isPresent();
        java.io.Serializable serializable19 = serializableOptional10.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isEmpty();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.io.Serializable serializable7 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Optional<java.lang.Object> objOptional0 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass1 = objOptional0.getClass();
        org.junit.Assert.assertNotNull(objOptional0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "Optional[10.0]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable12 = serializableOptional8.get();
        boolean boolean13 = serializableOptional8.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean17 = serializableOptional15.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable19 = serializableOptional15.orElse((java.io.Serializable) '#');
        java.lang.String str20 = serializableOptional15.toString();
        boolean boolean21 = serializableOptional15.isEmpty();
        boolean boolean22 = serializableOptional8.equals((java.lang.Object) serializableOptional15);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) boolean22);
        java.io.Serializable serializable24 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Optional[1]" + "'", str20, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean16 = serializableOptional15.isPresent();
        java.io.Serializable serializable18 = serializableOptional15.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable19 = serializableOptional15.get();
        java.lang.String str20 = serializableOptional15.toString();
        java.lang.Class<?> wildcardClass21 = serializableOptional15.getClass();
        java.io.Serializable serializable22 = serializableOptional8.orElse((java.io.Serializable) wildcardClass21);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable24 = serializableOptional8.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Optional[1]" + "'", str20, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        boolean boolean11 = serializableOptional1.isPresent();
        java.io.Serializable serializable12 = serializableOptional1.get();
        java.lang.String str13 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass3 = serializableStream2.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional4 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass3);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional5 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional6 = java.util.Optional.ofNullable(wildcardClass3);
        java.lang.Class<?> wildcardClass7 = wildcardClassOptional6.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeOptional4);
        org.junit.Assert.assertNotNull(annotatedElementOptional5);
        org.junit.Assert.assertNotNull(wildcardClassOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable21 = serializableOptional20.get();
        java.io.Serializable serializable22 = serializableOptional20.get();
        java.io.Serializable serializable23 = serializableOptional20.get();
        boolean boolean24 = serializableOptional20.isEmpty();
        java.io.Serializable serializable25 = serializableOptional20.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream26 = serializableOptional20.stream();
        boolean boolean27 = serializableOptional20.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream28 = serializableOptional20.stream();
        java.lang.String str29 = serializableOptional20.toString();
        boolean boolean30 = serializableOptional1.equals((java.lang.Object) str29);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(serializableStream28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Optional[1]" + "'", str29, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        boolean boolean6 = serializableOptional1.isEmpty();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.lang.String str8 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        boolean boolean4 = serializableOptional1.isPresent();
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        boolean boolean7 = serializableOptional1.isPresent();
        java.lang.String str8 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.ofNullable((java.io.Serializable) false);
        java.io.Serializable serializable2 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional5.stream();
        java.io.Serializable serializable7 = serializableOptional5.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional5.stream();
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional9 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream8);
        boolean boolean10 = serializableOptional1.equals((java.lang.Object) autoCloseableOptional9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + false + "'", serializable2, false);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + false + "'", serializable3, false);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(autoCloseableOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.io.Serializable serializable9 = serializableOptional1.get();
        boolean boolean10 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional10 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        boolean boolean12 = serializableOptional10.isEmpty();
        java.lang.Class<?> wildcardClass13 = serializableOptional10.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) '#');
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional1.stream();
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional18 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream17);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertNotNull(autoCloseableOptional18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableOptional7.get();
        java.io.Serializable serializable9 = serializableOptional7.get();
        java.io.Serializable serializable10 = serializableOptional7.get();
        boolean boolean11 = serializableOptional7.isEmpty();
        java.io.Serializable serializable12 = serializableOptional7.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional7.stream();
        java.lang.Class<?> wildcardClass14 = serializableStream13.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional15 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass14);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(genericDeclarationOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.lang.String str10 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "Optional[1]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Object obj8 = null;
        boolean boolean9 = serializableOptional1.equals(obj8);
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean12 = serializableOptional11.isPresent();
        java.io.Serializable serializable14 = serializableOptional11.orElse((java.io.Serializable) (byte) 10);
        java.lang.String str15 = serializableOptional11.toString();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) str15);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional1.stream();
        boolean boolean18 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Optional[1]" + "'", str15, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableStream19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass6 = serializableStream5.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional7 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeDescriptorOptional7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional9.stream();
        java.io.Serializable serializable12 = serializableOptional9.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable13 = serializableOptional9.get();
        boolean boolean14 = serializableOptional9.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean18 = serializableOptional16.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional16.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional20 = java.util.Optional.empty();
        boolean boolean21 = serializableOptional16.equals((java.lang.Object) strComparableOptional20);
        boolean boolean22 = serializableOptional9.equals((java.lang.Object) boolean21);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) boolean22);
        java.io.Serializable serializable24 = null;
        java.io.Serializable serializable25 = serializableOptional1.orElse(serializable24);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertNotNull(strComparableOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableStream7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        boolean boolean16 = serializableOptional8.isEmpty();
        java.io.Serializable serializable17 = serializableOptional8.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.ofNullable((java.io.Serializable) 10.0f);
        java.lang.String str2 = serializableOptional1.toString();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.Optional<java.lang.CharSequence> charSequenceOptional4 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass5 = charSequenceOptional4.getClass();
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional6 = java.util.Optional.of(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = wildcardClassOptional6.getClass();
        java.io.Serializable serializable8 = serializableOptional1.orElse((java.io.Serializable) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Optional[10.0]" + "'", str2, "Optional[10.0]");
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + 10.0f + "'", serializable3, 10.0f);
        org.junit.Assert.assertNotNull(charSequenceOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClassOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + 10.0f + "'", serializable8, 10.0f);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.util.Optional<java.lang.Object> objOptional10 = java.util.Optional.of((java.lang.Object) serializableStream9);
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional11 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(objOptional10);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(annotatedElementOptional0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(annotatedElementOptional0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean7 = serializableOptional1.isEmpty();
        boolean boolean8 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        java.io.Serializable serializable11 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.Optional<java.io.Serializable> serializableOptional3 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional3.stream();
        java.lang.Class<?> wildcardClass5 = serializableStream4.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional6 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = serializableOptional1.equals((java.lang.Object) wildcardClass5);
        java.io.Serializable serializable8 = serializableOptional1.get();
        boolean boolean9 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional3);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.ofNullable((java.io.Serializable) 10.0f);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.lang.String str4 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + 10.0f + "'", serializable2, 10.0f);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + 10.0f + "'", serializable3, 10.0f);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Optional[10.0]" + "'", str4, "Optional[10.0]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (-1L));
        boolean boolean8 = serializableOptional1.isEmpty();
        java.util.Optional<java.lang.Object> objOptional9 = java.util.Optional.of((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objOptional9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) false);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) false);
        boolean boolean4 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.get();
        java.lang.String str10 = serializableOptional1.toString();
        boolean boolean11 = serializableOptional1.isEmpty();
        java.lang.Class<?> wildcardClass12 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        boolean boolean5 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable9 = serializableOptional1.orElse((java.io.Serializable) 100L);
        java.lang.String str10 = serializableOptional1.toString();
        java.io.Serializable serializable11 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.lang.String str10 = serializableOptional1.toString();
        boolean boolean11 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable9 = serializableOptional1.orElse((java.io.Serializable) 100L);
        java.lang.String str10 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass11 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableOptionalOptional0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.Optional<java.lang.constant.Constable> constableOptional9 = java.util.Optional.of((java.lang.constant.Constable) 100);
        java.lang.Class<?> wildcardClass10 = constableOptional9.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional11 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass10);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional12 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass10);
        java.io.Serializable serializable13 = serializableOptional1.orElse((java.io.Serializable) wildcardClass10);
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable16 = serializableOptional15.get();
        java.io.Serializable serializable17 = serializableOptional15.get();
        java.io.Serializable serializable18 = serializableOptional15.get();
        boolean boolean19 = serializableOptional15.isEmpty();
        java.io.Serializable serializable20 = serializableOptional15.orElseThrow();
        boolean boolean22 = serializableOptional15.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable23 = serializableOptional15.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional15.stream();
        java.io.Serializable serializable25 = serializableOptional15.get();
        java.lang.Class<?> wildcardClass26 = serializableOptional15.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        java.util.Optional<java.io.Serializable> serializableOptional29 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableOptional29.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional31 = java.util.Optional.ofNullable(serializableOptional29);
        boolean boolean32 = serializableOptional29.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional34 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream35 = serializableOptional34.stream();
        boolean boolean36 = serializableOptional34.isEmpty();
        java.io.Serializable serializable37 = serializableOptional34.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional39 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean41 = serializableOptional39.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream42 = serializableOptional39.stream();
        java.io.Serializable serializable43 = serializableOptional39.get();
        java.lang.Class<?> wildcardClass44 = serializableOptional39.getClass();
        java.io.Serializable serializable45 = serializableOptional34.orElse((java.io.Serializable) wildcardClass44);
        boolean boolean46 = serializableOptional29.equals((java.lang.Object) wildcardClass44);
        java.util.Optional<java.io.Serializable> serializableOptional48 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream49 = serializableOptional48.stream();
        java.io.Serializable serializable51 = serializableOptional48.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream52 = serializableOptional48.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional53 = java.util.Optional.ofNullable(serializableStream52);
        java.lang.Class<?> wildcardClass54 = serializableStreamOptional53.getClass();
        java.io.Serializable serializable55 = serializableOptional29.orElse((java.io.Serializable) wildcardClass54);
        java.lang.String str56 = serializableOptional29.toString();
        boolean boolean57 = serializableOptional1.equals((java.lang.Object) str56);
        java.io.Serializable serializable58 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(constableOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeOptional11);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional29);
        org.junit.Assert.assertNotNull(serializableStream30);
        org.junit.Assert.assertNotNull(serializableOptionalOptional31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(serializableOptional34);
        org.junit.Assert.assertNotNull(serializableStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (byte) 1 + "'", serializable37, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(serializableStream42);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + serializable45 + "' != '" + (byte) 1 + "'", serializable45, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serializableOptional48);
        org.junit.Assert.assertNotNull(serializableStream49);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) 1 + "'", serializable51, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream52);
        org.junit.Assert.assertNotNull(serializableStreamOptional53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + (byte) 1 + "'", serializable55, (byte) 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Optional[1]" + "'", str56, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + serializable58 + "' != '" + (byte) 1 + "'", serializable58, (byte) 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean7 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.ofNullable((java.lang.CharSequence) "Optional[1]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        boolean boolean16 = serializableOptional8.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional18.stream();
        boolean boolean21 = serializableOptional18.equals((java.lang.Object) false);
        java.lang.String str22 = serializableOptional18.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional8.equals((java.lang.Object) serializableOptional18);
        java.util.Optional<java.io.Serializable> serializableOptional26 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean27 = serializableOptional26.isPresent();
        java.io.Serializable serializable29 = serializableOptional26.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable30 = serializableOptional26.get();
        java.lang.String str31 = serializableOptional26.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream32 = serializableOptional26.stream();
        java.util.Optional<java.io.Serializable> serializableOptional34 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableOptional34.isPresent();
        java.io.Serializable serializable37 = serializableOptional34.orElse((java.io.Serializable) (byte) 10);
        boolean boolean38 = serializableOptional26.equals((java.lang.Object) serializable37);
        java.lang.Class<?> wildcardClass39 = serializableOptional26.getClass();
        java.io.Serializable serializable40 = serializableOptional18.orElse((java.io.Serializable) wildcardClass39);
        java.io.Serializable serializable41 = serializableOptional18.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Optional[1]" + "'", str22, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(serializableOptional26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Optional[1]" + "'", str31, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream32);
        org.junit.Assert.assertNotNull(serializableOptional34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (byte) 1 + "'", serializable37, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 1 + "'", serializable40, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 1 + "'", serializable41, (byte) 1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean11 = serializableOptional9.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional9.stream();
        java.io.Serializable serializable13 = serializableOptional9.get();
        boolean boolean14 = serializableOptional9.isPresent();
        java.lang.String str15 = serializableOptional9.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional9.stream();
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableStream16);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Optional[1]" + "'", str15, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass6 = serializableOptional1.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional7 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.lang.String str13 = serializableOptional8.toString();
        java.lang.Class<?> wildcardClass14 = serializableOptional8.getClass();
        java.io.Serializable serializable15 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertNotNull(serializableStream17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional0 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass1 = strComparableOptional0.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional2 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass1);
        java.lang.Class<?> wildcardClass3 = annotatedElementOptional2.getClass();
        org.junit.Assert.assertNotNull(strComparableOptional0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(annotatedElementOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        boolean boolean4 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable7 = serializableOptional6.get();
        java.io.Serializable serializable8 = serializableOptional6.get();
        java.io.Serializable serializable9 = serializableOptional6.get();
        boolean boolean10 = serializableOptional6.isEmpty();
        java.io.Serializable serializable11 = serializableOptional6.orElseThrow();
        boolean boolean13 = serializableOptional6.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable14 = serializableOptional6.orElseThrow();
        java.io.Serializable serializable15 = serializableOptional6.get();
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional17.stream();
        boolean boolean21 = serializableOptional6.equals((java.lang.Object) serializableStream20);
        boolean boolean22 = serializableOptional1.equals((java.lang.Object) serializableOptional6);
        java.io.Serializable serializable23 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional6 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass7 = strComparableOptional6.getClass();
        java.io.Serializable serializable8 = serializableOptional1.orElse((java.io.Serializable) wildcardClass7);
        java.util.Optional<java.lang.Object> objOptional10 = java.util.Optional.ofNullable((java.lang.Object) (-1.0d));
        boolean boolean11 = serializableOptional1.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(strComparableOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(objOptional10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional5.stream();
        java.io.Serializable serializable8 = serializableOptional5.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional5.stream();
        boolean boolean10 = serializableOptional1.equals((java.lang.Object) serializableOptional5);
        boolean boolean11 = serializableOptional1.isPresent();
        boolean boolean12 = serializableOptional1.isPresent();
        java.io.Serializable serializable13 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isEmpty();
        boolean boolean10 = serializableOptional1.isPresent();
        boolean boolean11 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass5 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional6 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional7 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass5);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(annotatedElementOptional6);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        java.lang.String str7 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.io.Serializable serializable11 = serializableOptional1.orElse((java.io.Serializable) (-1.0d));
        java.util.Optional<java.io.Serializable> serializableOptional13 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable14 = serializableOptional13.get();
        java.io.Serializable serializable15 = serializableOptional13.get();
        java.io.Serializable serializable16 = serializableOptional13.get();
        boolean boolean17 = serializableOptional13.isEmpty();
        java.io.Serializable serializable18 = serializableOptional13.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional13.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional13.stream();
        boolean boolean21 = serializableOptional13.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional23 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable24 = serializableOptional23.get();
        java.io.Serializable serializable25 = serializableOptional23.get();
        java.io.Serializable serializable26 = serializableOptional23.get();
        boolean boolean27 = serializableOptional23.isEmpty();
        java.io.Serializable serializable28 = serializableOptional23.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional23.stream();
        boolean boolean30 = serializableOptional23.isEmpty();
        boolean boolean31 = serializableOptional13.equals((java.lang.Object) serializableOptional23);
        java.util.Optional<java.io.Serializable> serializableOptional33 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableOptional33.stream();
        java.io.Serializable serializable36 = serializableOptional33.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable38 = serializableOptional33.orElse((java.io.Serializable) "");
        boolean boolean39 = serializableOptional33.isPresent();
        boolean boolean40 = serializableOptional13.equals((java.lang.Object) serializableOptional33);
        java.util.Optional<java.io.Serializable> serializableOptional42 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream43 = serializableOptional42.stream();
        java.io.Serializable serializable45 = serializableOptional42.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream46 = serializableOptional42.stream();
        java.lang.String str47 = serializableOptional42.toString();
        java.lang.Class<?> wildcardClass48 = serializableOptional42.getClass();
        java.io.Serializable serializable49 = serializableOptional33.orElse((java.io.Serializable) wildcardClass48);
        java.io.Serializable serializable50 = serializableOptional1.orElse(serializable49);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(serializableOptional23);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(serializableOptional33);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertEquals("'" + serializable36 + "' != '" + (byte) 1 + "'", serializable36, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + (byte) 1 + "'", serializable38, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(serializableOptional42);
        org.junit.Assert.assertNotNull(serializableStream43);
        org.junit.Assert.assertEquals("'" + serializable45 + "' != '" + (byte) 1 + "'", serializable45, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Optional[1]" + "'", str47, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + serializable49 + "' != '" + (byte) 1 + "'", serializable49, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + (byte) 1 + "'", serializable50, (byte) 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional4 = java.util.Optional.of(serializableOptional1);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional6 = java.util.Optional.ofNullable(serializableOptional1);
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable10 = serializableOptional9.get();
        java.io.Serializable serializable11 = serializableOptional9.get();
        java.io.Serializable serializable12 = serializableOptional9.get();
        boolean boolean13 = serializableOptional9.isEmpty();
        java.io.Serializable serializable14 = serializableOptional9.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional9.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional9.stream();
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional18.stream();
        java.lang.Class<?> wildcardClass20 = serializableStream19.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional21 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass20);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional22 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass20);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional23 = java.util.Optional.ofNullable(wildcardClass20);
        java.io.Serializable serializable24 = serializableOptional9.orElse((java.io.Serializable) wildcardClass20);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional25 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass20);
        java.io.Serializable serializable26 = serializableOptional1.orElse((java.io.Serializable) wildcardClass20);
        java.io.Serializable serializable27 = serializableOptional1.get();
        boolean boolean28 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeOptional21);
        org.junit.Assert.assertNotNull(annotatedElementOptional22);
        org.junit.Assert.assertNotNull(wildcardClassOptional23);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional25);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isEmpty();
        boolean boolean10 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass11 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.get();
        boolean boolean8 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.lang.String str5 = serializableOptional1.toString();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        boolean boolean12 = serializableOptional8.isPresent();
        boolean boolean13 = serializableOptional8.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional8.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional8.stream();
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass20 = serializableOptional17.getClass();
        java.io.Serializable serializable21 = serializableOptional8.orElse((java.io.Serializable) wildcardClass20);
        java.io.Serializable serializable22 = serializableOptional1.orElse((java.io.Serializable) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = serializable22.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strComparableOptional0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.io.Serializable serializable9 = serializableOptional1.get();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional10 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass11 = strComparableOptional10.getClass();
        java.io.Serializable serializable12 = serializableOptional1.orElse((java.io.Serializable) wildcardClass11);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional13 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass11);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(strComparableOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable10 = serializableOptional9.get();
        java.io.Serializable serializable11 = serializableOptional9.get();
        java.io.Serializable serializable12 = serializableOptional9.get();
        boolean boolean13 = serializableOptional9.isEmpty();
        java.io.Serializable serializable14 = serializableOptional9.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional9.stream();
        java.lang.Class<?> wildcardClass16 = serializableStream15.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional17 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional18 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass16);
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) typeDescriptorOptional18);
        java.io.Serializable serializable20 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(typeDescriptorOptional17);
        org.junit.Assert.assertNotNull(typeDescriptorOptional18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        boolean boolean11 = serializableOptional1.isEmpty();
        java.lang.Class<?> wildcardClass12 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional4 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass5 = strComparableOptional4.getClass();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) wildcardClass5);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional9.stream();
        java.lang.Class<?> wildcardClass11 = serializableStream10.getClass();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertNotNull(strComparableOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean7 = serializableOptional1.isEmpty();
        boolean boolean8 = serializableOptional1.isPresent();
        java.lang.String str9 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Optional[1]" + "'", str9, "Optional[1]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.isEmpty();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional7.stream();
        boolean boolean10 = serializableOptional7.equals((java.lang.Object) false);
        java.lang.String str11 = serializableOptional7.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional7.stream();
        java.io.Serializable serializable13 = serializableOptional7.orElseThrow();
        boolean boolean14 = serializableOptional7.isEmpty();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable18 = serializableOptional17.get();
        java.io.Serializable serializable19 = serializableOptional17.get();
        java.io.Serializable serializable20 = serializableOptional17.get();
        java.io.Serializable serializable22 = serializableOptional17.orElse((java.io.Serializable) 100L);
        boolean boolean23 = serializableOptional17.isPresent();
        boolean boolean24 = serializableOptional17.isPresent();
        boolean boolean25 = serializableOptional17.isPresent();
        java.io.Serializable serializable26 = serializableOptional17.orElseThrow();
        java.io.Serializable serializable27 = serializableOptional17.get();
        boolean boolean28 = serializableOptional7.equals((java.lang.Object) serializable27);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional[1]" + "'", str11, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable12 = serializableOptional8.get();
        boolean boolean13 = serializableOptional8.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean17 = serializableOptional15.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable19 = serializableOptional15.orElse((java.io.Serializable) '#');
        java.lang.String str20 = serializableOptional15.toString();
        boolean boolean21 = serializableOptional15.isEmpty();
        boolean boolean22 = serializableOptional8.equals((java.lang.Object) serializableOptional15);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) boolean22);
        boolean boolean24 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass25 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Optional[1]" + "'", str20, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.String str8 = serializableOptional1.toString();
        java.lang.String str9 = serializableOptional1.toString();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Optional[1]" + "'", str9, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeDescriptorOptional0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        boolean boolean11 = serializableOptional1.isPresent();
        java.io.Serializable serializable12 = serializableOptional1.get();
        boolean boolean13 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "Optional[10.0]");
        java.util.Optional<java.lang.Object> objOptional2 = java.util.Optional.ofNullable((java.lang.Object) "Optional[10.0]");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
        org.junit.Assert.assertNotNull(objOptional2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(autoCloseableOptional0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.Optional<java.lang.constant.Constable> constableOptional1 = java.util.Optional.of((java.lang.constant.Constable) 100);
        java.lang.Class<?> wildcardClass2 = constableOptional1.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional3 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass2);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional4 = java.util.Optional.of(wildcardClass2);
        org.junit.Assert.assertNotNull(constableOptional1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeOptional3);
        org.junit.Assert.assertNotNull(wildcardClassOptional4);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.lang.Class<?> wildcardClass12 = serializableStream11.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional13 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional14 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass12);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional15 = java.util.Optional.ofNullable(wildcardClass12);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass12);
        java.util.Optional<java.lang.Object> objOptional17 = java.util.Optional.empty();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) objOptional17);
        java.lang.Class<?> wildcardClass19 = objOptional17.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional20 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass19);
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional21 = java.util.Optional.ofNullable((java.lang.reflect.GenericDeclaration) wildcardClass19);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeOptional13);
        org.junit.Assert.assertNotNull(annotatedElementOptional14);
        org.junit.Assert.assertNotNull(wildcardClassOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(objOptional17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(annotatedElementOptional20);
        org.junit.Assert.assertNotNull(genericDeclarationOptional21);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.lang.Object> objOptional6 = java.util.Optional.of((java.lang.Object) serializableOptional1);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(objOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.lang.String str13 = serializableOptional7.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.io.Serializable serializable23 = serializableOptional20.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional20.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional25 = java.util.Optional.ofNullable(serializableStream24);
        java.lang.Class<?> wildcardClass26 = serializableStreamOptional25.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        boolean boolean28 = serializableOptional1.isPresent();
        java.lang.String str29 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableStreamOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Optional[1]" + "'", str29, "Optional[1]");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Optional<java.io.Serializable> serializableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableOptional0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.Optional<java.lang.constant.Constable> constableOptional9 = java.util.Optional.of((java.lang.constant.Constable) 100);
        java.lang.Class<?> wildcardClass10 = constableOptional9.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional11 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass10);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional12 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass10);
        java.io.Serializable serializable13 = serializableOptional1.orElse((java.io.Serializable) wildcardClass10);
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable16 = serializableOptional15.get();
        java.io.Serializable serializable17 = serializableOptional15.get();
        java.io.Serializable serializable18 = serializableOptional15.get();
        boolean boolean19 = serializableOptional15.isEmpty();
        java.io.Serializable serializable20 = serializableOptional15.orElseThrow();
        boolean boolean22 = serializableOptional15.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable23 = serializableOptional15.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional15.stream();
        java.io.Serializable serializable25 = serializableOptional15.get();
        java.lang.Class<?> wildcardClass26 = serializableOptional15.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        java.util.Optional<java.io.Serializable> serializableOptional29 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableOptional29.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional31 = java.util.Optional.ofNullable(serializableOptional29);
        boolean boolean32 = serializableOptional29.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional34 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream35 = serializableOptional34.stream();
        boolean boolean36 = serializableOptional34.isEmpty();
        java.io.Serializable serializable37 = serializableOptional34.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional39 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean41 = serializableOptional39.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream42 = serializableOptional39.stream();
        java.io.Serializable serializable43 = serializableOptional39.get();
        java.lang.Class<?> wildcardClass44 = serializableOptional39.getClass();
        java.io.Serializable serializable45 = serializableOptional34.orElse((java.io.Serializable) wildcardClass44);
        boolean boolean46 = serializableOptional29.equals((java.lang.Object) wildcardClass44);
        java.util.Optional<java.io.Serializable> serializableOptional48 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream49 = serializableOptional48.stream();
        java.io.Serializable serializable51 = serializableOptional48.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream52 = serializableOptional48.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional53 = java.util.Optional.ofNullable(serializableStream52);
        java.lang.Class<?> wildcardClass54 = serializableStreamOptional53.getClass();
        java.io.Serializable serializable55 = serializableOptional29.orElse((java.io.Serializable) wildcardClass54);
        java.lang.String str56 = serializableOptional29.toString();
        boolean boolean57 = serializableOptional1.equals((java.lang.Object) str56);
        java.util.Optional<java.io.Serializable> serializableOptional59 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable60 = serializableOptional59.get();
        java.io.Serializable serializable61 = serializableOptional59.get();
        java.io.Serializable serializable62 = serializableOptional59.get();
        java.io.Serializable serializable64 = serializableOptional59.orElse((java.io.Serializable) 100L);
        boolean boolean65 = serializableOptional59.isPresent();
        boolean boolean66 = serializableOptional59.isPresent();
        boolean boolean67 = serializableOptional59.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional69 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable70 = serializableOptional69.get();
        java.io.Serializable serializable71 = serializableOptional69.orElseThrow();
        java.lang.Class<?> wildcardClass72 = serializable71.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional73 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass72);
        java.io.Serializable serializable74 = serializableOptional59.orElse((java.io.Serializable) wildcardClass72);
        java.util.Optional<java.io.Serializable> serializableOptional75 = java.util.Optional.of((java.io.Serializable) wildcardClass72);
        boolean boolean76 = serializableOptional1.equals((java.lang.Object) wildcardClass72);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(constableOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeOptional11);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional29);
        org.junit.Assert.assertNotNull(serializableStream30);
        org.junit.Assert.assertNotNull(serializableOptionalOptional31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(serializableOptional34);
        org.junit.Assert.assertNotNull(serializableStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (byte) 1 + "'", serializable37, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(serializableStream42);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + serializable45 + "' != '" + (byte) 1 + "'", serializable45, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serializableOptional48);
        org.junit.Assert.assertNotNull(serializableStream49);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) 1 + "'", serializable51, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream52);
        org.junit.Assert.assertNotNull(serializableStreamOptional53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + (byte) 1 + "'", serializable55, (byte) 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Optional[1]" + "'", str56, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serializableOptional59);
        org.junit.Assert.assertEquals("'" + serializable60 + "' != '" + (byte) 1 + "'", serializable60, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable61 + "' != '" + (byte) 1 + "'", serializable61, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable62 + "' != '" + (byte) 1 + "'", serializable62, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable64 + "' != '" + (byte) 1 + "'", serializable64, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(serializableOptional69);
        org.junit.Assert.assertEquals("'" + serializable70 + "' != '" + (byte) 1 + "'", serializable70, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable71 + "' != '" + (byte) 1 + "'", serializable71, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(constableOptional73);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + (byte) 1 + "'", serializable74, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.get();
        boolean boolean8 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass3 = serializableStream2.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional4 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass3);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional5 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = typeDescriptorOptional5.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional7 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeOptional4);
        org.junit.Assert.assertNotNull(typeDescriptorOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeOptional7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(genericDeclarationOptional0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(genericDeclarationOptional0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of((java.lang.Comparable<java.lang.String>) "Optional[10.0]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable10 = serializableOptional9.get();
        java.io.Serializable serializable11 = serializableOptional9.get();
        java.io.Serializable serializable12 = serializableOptional9.get();
        java.lang.String str13 = serializableOptional9.toString();
        boolean boolean14 = serializableOptional9.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean17 = serializableOptional16.isPresent();
        java.io.Serializable serializable19 = serializableOptional16.orElse((java.io.Serializable) (byte) 10);
        boolean boolean20 = serializableOptional16.isPresent();
        boolean boolean21 = serializableOptional16.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional16.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional16.stream();
        java.util.Optional<java.io.Serializable> serializableOptional25 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean27 = serializableOptional25.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass28 = serializableOptional25.getClass();
        java.io.Serializable serializable29 = serializableOptional16.orElse((java.io.Serializable) wildcardClass28);
        java.io.Serializable serializable30 = serializableOptional9.orElse((java.io.Serializable) wildcardClass28);
        java.util.Optional<java.io.Serializable> serializableOptional32 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableOptional32.stream();
        boolean boolean34 = serializableOptional32.isPresent();
        boolean boolean36 = serializableOptional32.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass37 = serializableOptional32.getClass();
        java.util.Optional<java.io.Serializable> serializableOptional38 = java.util.Optional.of((java.io.Serializable) wildcardClass37);
        java.io.Serializable serializable39 = serializableOptional9.orElse((java.io.Serializable) wildcardClass37);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional40 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass37);
        java.io.Serializable serializable41 = serializableOptional1.orElse((java.io.Serializable) wildcardClass37);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertNotNull(serializableOptional25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional32);
        org.junit.Assert.assertNotNull(serializableStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(serializableOptional38);
        org.junit.Assert.assertEquals("'" + serializable39 + "' != '" + (byte) 1 + "'", serializable39, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional40);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 1 + "'", serializable41, (byte) 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.lang.String str9 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Optional[1]" + "'", str9, "Optional[1]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isEmpty();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.lang.Class<?> wildcardClass8 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Optional<java.lang.String> strOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strOptional0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.ofNullable((java.lang.Comparable<java.lang.String>) "Optional[class java.util.Optional]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        boolean boolean6 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableOptional5.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable9 = serializableOptional5.orElse((java.io.Serializable) '#');
        java.lang.String str10 = serializableOptional5.toString();
        boolean boolean11 = serializableOptional5.isEmpty();
        java.lang.Class<?> wildcardClass12 = serializableOptional5.getClass();
        java.io.Serializable serializable13 = serializableOptional1.orElse((java.io.Serializable) wildcardClass12);
        boolean boolean14 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.ofNullable((java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.util.Optional<java.io.Serializable> serializableOptional14 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean16 = serializableOptional14.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional14.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional18 = java.util.Optional.empty();
        boolean boolean19 = serializableOptional14.equals((java.lang.Object) strComparableOptional18);
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional21.stream();
        java.io.Serializable serializable24 = serializableOptional21.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream25 = serializableOptional21.stream();
        boolean boolean26 = serializableOptional14.equals((java.lang.Object) serializableStream25);
        java.lang.String str27 = serializableOptional14.toString();
        boolean boolean28 = serializableOptional7.equals((java.lang.Object) serializableOptional14);
        java.util.Optional<java.io.Serializable> serializableOptional30 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean32 = serializableOptional30.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableOptional30.stream();
        java.io.Serializable serializable34 = serializableOptional30.orElseThrow();
        java.io.Serializable serializable35 = serializableOptional30.orElseThrow();
        boolean boolean36 = serializableOptional30.isPresent();
        boolean boolean37 = serializableOptional30.isEmpty();
        boolean boolean38 = serializableOptional14.equals((java.lang.Object) serializableOptional30);
        java.lang.String str39 = serializableOptional14.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(serializableOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertNotNull(strComparableOptional18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Optional[1]" + "'", str27, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(serializableOptional30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableStream33);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + (byte) 1 + "'", serializable35, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Optional[1]" + "'", str39, "Optional[1]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional7.stream();
        java.io.Serializable serializable9 = serializableOptional7.get();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional11.stream();
        java.io.Serializable serializable14 = serializableOptional11.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional11.stream();
        boolean boolean16 = serializableOptional7.equals((java.lang.Object) serializableOptional11);
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.util.Optional<java.io.Serializable> serializableOptional19 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional19.stream();
        boolean boolean21 = serializableOptional19.isEmpty();
        java.io.Serializable serializable22 = serializableOptional19.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional19.stream();
        java.io.Serializable serializable24 = serializableOptional19.get();
        boolean boolean25 = serializableOptional1.equals((java.lang.Object) serializableOptional19);
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) 1L);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(serializableOptional19);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.of("hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass6 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.String str7 = serializableOptional1.toString();
        java.util.Optional<java.lang.Object> objOptional8 = java.util.Optional.ofNullable((java.lang.Object) str7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertNotNull(objOptional8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional8 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(annotatedElementOptional8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        boolean boolean4 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable7 = serializableOptional6.get();
        java.io.Serializable serializable8 = serializableOptional6.get();
        java.io.Serializable serializable9 = serializableOptional6.get();
        boolean boolean10 = serializableOptional6.isEmpty();
        java.io.Serializable serializable11 = serializableOptional6.orElseThrow();
        boolean boolean13 = serializableOptional6.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable14 = serializableOptional6.orElseThrow();
        java.io.Serializable serializable15 = serializableOptional6.get();
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional17.stream();
        boolean boolean21 = serializableOptional6.equals((java.lang.Object) serializableStream20);
        boolean boolean22 = serializableOptional1.equals((java.lang.Object) serializableOptional6);
        java.lang.Class<?> wildcardClass23 = serializableOptional6.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional8 = java.util.Optional.of(serializableOptional1);
        boolean boolean9 = serializableOptional1.isPresent();
        boolean boolean10 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableOptionalOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(serializableStream11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional4 = java.util.Optional.of(serializableOptional1);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional6 = java.util.Optional.ofNullable(serializableOptional1);
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.util.Optional<java.lang.Object> objOptional9 = java.util.Optional.ofNullable((java.lang.Object) serializableOptional1);
        boolean boolean10 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(objOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        java.io.Serializable serializable14 = serializableOptional8.orElseThrow();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        boolean boolean14 = serializableOptional8.isEmpty();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable18 = serializableOptional17.get();
        java.io.Serializable serializable19 = serializableOptional17.get();
        java.io.Serializable serializable20 = serializableOptional17.get();
        java.io.Serializable serializable22 = serializableOptional17.orElse((java.io.Serializable) 100L);
        boolean boolean23 = serializableOptional17.isPresent();
        boolean boolean24 = serializableOptional17.isPresent();
        boolean boolean25 = serializableOptional17.isPresent();
        java.lang.Class<?> wildcardClass26 = serializableOptional17.getClass();
        java.io.Serializable serializable27 = serializableOptional8.orElse((java.io.Serializable) wildcardClass26);
        boolean boolean28 = serializableOptional8.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(autoCloseableOptional0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable13 = serializableOptional12.get();
        java.io.Serializable serializable14 = serializableOptional12.get();
        java.io.Serializable serializable15 = serializableOptional12.get();
        boolean boolean16 = serializableOptional12.isEmpty();
        java.io.Serializable serializable17 = serializableOptional12.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableOptional12.stream();
        java.lang.Class<?> wildcardClass19 = serializableStream18.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional20 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass19);
        java.io.Serializable serializable21 = serializableOptional1.orElse((java.io.Serializable) wildcardClass19);
        java.lang.String str22 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeDescriptorOptional20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Optional[1]" + "'", str22, "Optional[1]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean6 = serializableOptional5.isPresent();
        java.io.Serializable serializable8 = serializableOptional5.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable9 = serializableOptional5.get();
        java.lang.String str10 = serializableOptional5.toString();
        java.io.Serializable serializable11 = serializableOptional5.orElseThrow();
        java.io.Serializable serializable12 = serializableOptional5.orElseThrow();
        boolean boolean13 = serializableOptional5.isEmpty();
        java.io.Serializable serializable14 = serializableOptional5.get();
        java.lang.Class<?> wildcardClass15 = serializable14.getClass();
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass15);
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional18.stream();
        boolean boolean20 = serializableOptional18.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional18.stream();
        java.lang.Class<?> wildcardClass22 = serializableOptional18.getClass();
        java.io.Serializable serializable23 = serializableOptional1.orElse((java.io.Serializable) wildcardClass22);
        java.util.Optional<java.io.Serializable> serializableOptional25 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable26 = serializableOptional25.get();
        java.io.Serializable serializable27 = serializableOptional25.get();
        java.io.Serializable serializable28 = serializableOptional25.get();
        java.io.Serializable serializable30 = serializableOptional25.orElse((java.io.Serializable) 100L);
        boolean boolean31 = serializableOptional25.isPresent();
        boolean boolean32 = serializableOptional25.isPresent();
        boolean boolean33 = serializableOptional25.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional35 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable36 = serializableOptional35.get();
        java.io.Serializable serializable37 = serializableOptional35.orElseThrow();
        java.lang.Class<?> wildcardClass38 = serializable37.getClass();
        java.util.Optional<java.lang.constant.Constable> constableOptional39 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass38);
        java.io.Serializable serializable40 = serializableOptional25.orElse((java.io.Serializable) wildcardClass38);
        java.io.Serializable serializable41 = serializableOptional1.orElse(serializable40);
        java.io.Serializable serializable42 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable43 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional25);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(serializableOptional35);
        org.junit.Assert.assertEquals("'" + serializable36 + "' != '" + (byte) 1 + "'", serializable36, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (byte) 1 + "'", serializable37, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(constableOptional39);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 1 + "'", serializable40, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 1 + "'", serializable41, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (byte) 1 + "'", serializable42, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        java.io.Serializable serializable14 = serializableOptional8.orElseThrow();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional17.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional21 = java.util.Optional.empty();
        boolean boolean22 = serializableOptional17.equals((java.lang.Object) strComparableOptional21);
        java.util.Optional<java.io.Serializable> serializableOptional24 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream25 = serializableOptional24.stream();
        java.io.Serializable serializable27 = serializableOptional24.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream28 = serializableOptional24.stream();
        boolean boolean29 = serializableOptional17.equals((java.lang.Object) serializableStream28);
        java.util.Optional<java.io.Serializable> serializableOptional31 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream32 = serializableOptional31.stream();
        java.lang.Class<?> wildcardClass33 = serializableStream32.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional34 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass33);
        java.io.Serializable serializable35 = serializableOptional17.orElse((java.io.Serializable) wildcardClass33);
        java.io.Serializable serializable36 = serializableOptional1.orElse(serializable35);
        boolean boolean37 = serializableOptional1.isEmpty();
        java.io.Serializable serializable38 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertNotNull(strComparableOptional21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(serializableOptional24);
        org.junit.Assert.assertNotNull(serializableStream25);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(serializableOptional31);
        org.junit.Assert.assertNotNull(serializableStream32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(typeOptional34);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + (byte) 1 + "'", serializable35, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable36 + "' != '" + (byte) 1 + "'", serializable36, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + (byte) 1 + "'", serializable38, (byte) 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.util.Optional<java.io.Serializable> serializableOptional14 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean16 = serializableOptional14.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass17 = serializableOptional14.getClass();
        java.io.Serializable serializable18 = serializableOptional1.orElse((java.io.Serializable) wildcardClass17);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional19 = java.util.Optional.ofNullable(wildcardClass17);
        java.util.Optional<java.lang.reflect.Type> typeOptional20 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass17);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(serializableOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClassOptional19);
        org.junit.Assert.assertNotNull(typeOptional20);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("Optional[class java.util.Optional]");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional11 = java.util.Optional.of(serializableStream10);
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional12 = java.util.Optional.of(serializableStream10);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(serializableStreamOptional11);
        org.junit.Assert.assertNotNull(serializableStreamOptional12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional6 = java.util.Optional.ofNullable(serializableStream5);
        java.lang.Class<?> wildcardClass7 = serializableStreamOptional6.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional8 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass7);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertNotNull(serializableStreamOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeOptional8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableOptional6.isPresent();
        java.io.Serializable serializable9 = serializableOptional6.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable10 = serializableOptional6.get();
        java.lang.String str11 = serializableOptional6.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional6.stream();
        java.lang.Class<?> wildcardClass13 = serializableOptional6.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        java.util.Optional<java.lang.constant.Constable> constableOptional15 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass13);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional[1]" + "'", str11, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(constableOptional15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass7 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional8 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeOptional8.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Optional<java.lang.Object> objOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(objOptional0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass4 = serializableOptional1.getClass();
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.ofNullable((java.io.Serializable) wildcardClass4);
        java.util.Optional<java.lang.constant.Constable> constableOptional7 = java.util.Optional.of((java.lang.constant.Constable) 100);
        java.lang.Class<?> wildcardClass8 = constableOptional7.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional9 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass8);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional10 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass8);
        java.io.Serializable serializable11 = serializableOptional5.orElse((java.io.Serializable) wildcardClass8);
        java.util.Optional<java.io.Serializable> serializableOptional13 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional13.stream();
        java.lang.Class<?> wildcardClass15 = serializableStream14.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional16 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass15);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional17 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional18 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass15);
        java.util.Optional<java.lang.reflect.Type> typeOptional19 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass15);
        java.util.Optional<java.lang.constant.Constable> constableOptional20 = java.util.Optional.of((java.lang.constant.Constable) wildcardClass15);
        boolean boolean21 = serializableOptional5.equals((java.lang.Object) constableOptional20);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertNotNull(constableOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeOptional9);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional10);
        org.junit.Assert.assertNotNull(serializable11);
        org.junit.Assert.assertNotNull(serializableOptional13);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeOptional16);
        org.junit.Assert.assertNotNull(typeDescriptorOptional17);
        org.junit.Assert.assertNotNull(genericDeclarationOptional18);
        org.junit.Assert.assertNotNull(typeOptional19);
        org.junit.Assert.assertNotNull(constableOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional10 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass9);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeOptional10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isEmpty();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean4 = serializableOptional1.isPresent();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional7 = java.util.Optional.ofNullable(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Optional<java.io.Serializable> serializableOptional0 = java.util.Optional.empty();
        boolean boolean1 = serializableOptional0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable2 = serializableOptional0.get();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableOptional0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableOptional11.stream();
        boolean boolean19 = serializableOptional11.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable22 = serializableOptional21.get();
        java.io.Serializable serializable23 = serializableOptional21.get();
        java.io.Serializable serializable24 = serializableOptional21.get();
        boolean boolean25 = serializableOptional21.isEmpty();
        java.io.Serializable serializable26 = serializableOptional21.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream27 = serializableOptional21.stream();
        boolean boolean28 = serializableOptional21.isEmpty();
        boolean boolean29 = serializableOptional11.equals((java.lang.Object) serializableOptional21);
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableOptional11.stream();
        java.util.Optional<java.io.Serializable> serializableOptional32 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableOptional32.stream();
        boolean boolean34 = serializableOptional32.isEmpty();
        java.io.Serializable serializable35 = serializableOptional32.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional37 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean39 = serializableOptional37.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream40 = serializableOptional37.stream();
        java.io.Serializable serializable41 = serializableOptional37.get();
        java.lang.Class<?> wildcardClass42 = serializableOptional37.getClass();
        java.io.Serializable serializable43 = serializableOptional32.orElse((java.io.Serializable) wildcardClass42);
        java.io.Serializable serializable44 = serializableOptional11.orElse((java.io.Serializable) wildcardClass42);
        boolean boolean45 = serializableOptional1.equals((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertNotNull(serializableStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(serializableStream30);
        org.junit.Assert.assertNotNull(serializableOptional32);
        org.junit.Assert.assertNotNull(serializableStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + (byte) 1 + "'", serializable35, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableStream40);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 1 + "'", serializable41, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + (byte) 1 + "'", serializable44, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable10 = serializableOptional7.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional7.stream();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.lang.String str13 = serializableOptional7.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional5 = java.util.Optional.of((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass4);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        boolean boolean18 = serializableOptional11.isEmpty();
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.io.Serializable serializable20 = serializableOptional1.get();
        boolean boolean21 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional23 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional23.stream();
        boolean boolean25 = serializableOptional23.isPresent();
        boolean boolean27 = serializableOptional23.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass28 = serializableOptional23.getClass();
        java.io.Serializable serializable29 = serializableOptional1.orElse((java.io.Serializable) wildcardClass28);
        java.io.Serializable serializable30 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(serializableOptional23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass4 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional5 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) wildcardClass4);
        java.lang.String str7 = serializableOptional6.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(annotatedElementOptional5);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[class java.util.Optional]" + "'", str7, "Optional[class java.util.Optional]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        boolean boolean12 = serializableOptional8.isPresent();
        boolean boolean13 = serializableOptional8.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional8.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional8.stream();
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass20 = serializableOptional17.getClass();
        java.io.Serializable serializable21 = serializableOptional8.orElse((java.io.Serializable) wildcardClass20);
        java.io.Serializable serializable22 = serializableOptional1.orElse((java.io.Serializable) wildcardClass20);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        boolean boolean12 = serializableOptional10.isEmpty();
        java.lang.Class<?> wildcardClass13 = serializableOptional10.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) '#');
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean20 = serializableOptional18.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable22 = serializableOptional18.orElse((java.io.Serializable) '#');
        java.lang.String str23 = serializableOptional18.toString();
        java.util.Optional<java.io.Serializable> serializableOptional25 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean26 = serializableOptional25.isPresent();
        java.io.Serializable serializable28 = serializableOptional25.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable29 = serializableOptional25.get();
        java.lang.String str30 = serializableOptional25.toString();
        java.lang.Class<?> wildcardClass31 = serializableOptional25.getClass();
        java.io.Serializable serializable32 = serializableOptional18.orElse((java.io.Serializable) wildcardClass31);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional33 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass31);
        java.io.Serializable serializable34 = serializableOptional1.orElse((java.io.Serializable) wildcardClass31);
        java.util.stream.Stream<java.io.Serializable> serializableStream35 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Optional[1]" + "'", str23, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Optional[1]" + "'", str30, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + (byte) 1 + "'", serializable32, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional33);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream35);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        boolean boolean16 = serializableOptional8.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional18.stream();
        boolean boolean21 = serializableOptional18.equals((java.lang.Object) false);
        java.lang.String str22 = serializableOptional18.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional8.equals((java.lang.Object) serializableOptional18);
        java.io.Serializable serializable25 = serializableOptional18.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Optional[1]" + "'", str22, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.lang.String str10 = serializableOptional8.toString();
        java.io.Serializable serializable11 = serializableOptional8.get();
        boolean boolean12 = serializableOptional8.isEmpty();
        java.lang.String str13 = serializableOptional8.toString();
        java.io.Serializable serializable14 = serializableOptional8.get();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializable14);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable18 = serializableOptional17.get();
        java.lang.String str19 = serializableOptional17.toString();
        java.lang.Class<?> wildcardClass20 = serializableOptional17.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional21 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass20);
        java.util.Optional<java.io.Serializable> serializableOptional22 = java.util.Optional.of((java.io.Serializable) wildcardClass20);
        boolean boolean23 = serializableOptional1.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Optional[1]" + "'", str19, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(annotatedElementOptional21);
        org.junit.Assert.assertNotNull(serializableOptional22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional8 = java.util.Optional.of(serializableOptional1);
        boolean boolean9 = serializableOptional1.isEmpty();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        boolean boolean11 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableOptionalOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.lang.Object> objOptional7 = java.util.Optional.ofNullable((java.lang.Object) serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objOptional7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableOptionalOptional0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeDescriptorOptional0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional8 = java.util.Optional.of(serializableOptional1);
        boolean boolean9 = serializableOptional1.isEmpty();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass11 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableOptionalOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional11.stream();
        java.io.Serializable serializable14 = serializableOptional11.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional11.stream();
        java.lang.Class<?> wildcardClass16 = serializableStream15.getClass();
        java.io.Serializable serializable17 = serializableOptional1.orElse((java.io.Serializable) wildcardClass16);
        java.lang.String str18 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Optional[1]" + "'", str18, "Optional[1]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean12 = serializableOptional10.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional10.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional14 = java.util.Optional.empty();
        boolean boolean15 = serializableOptional10.equals((java.lang.Object) strComparableOptional14);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableOptional17.stream();
        java.io.Serializable serializable20 = serializableOptional17.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional17.stream();
        boolean boolean22 = serializableOptional10.equals((java.lang.Object) serializableStream21);
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional23 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream21);
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional24 = java.util.Optional.of(serializableStream21);
        boolean boolean25 = serializableOptional1.equals((java.lang.Object) serializableStreamOptional24);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertNotNull(strComparableOptional14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertNotNull(serializableStream18);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional23);
        org.junit.Assert.assertNotNull(serializableStreamOptional24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) (short) 0);
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.get();
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        boolean boolean18 = serializableOptional11.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional11.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional20 = java.util.Optional.of(serializableStream19);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertNotNull(serializableStreamOptional20);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable16 = serializableOptional15.get();
        java.io.Serializable serializable17 = serializableOptional15.get();
        java.io.Serializable serializable18 = serializableOptional15.get();
        boolean boolean19 = serializableOptional15.isEmpty();
        java.io.Serializable serializable20 = serializableOptional15.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional15.stream();
        java.lang.Class<?> wildcardClass22 = serializableStream21.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional23 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass22);
        java.io.Serializable serializable24 = serializableOptional1.orElse((java.io.Serializable) wildcardClass22);
        java.util.stream.Stream<java.io.Serializable> serializableStream25 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional27 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream28 = serializableOptional27.stream();
        java.io.Serializable serializable30 = serializableOptional27.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable31 = serializableOptional27.get();
        boolean boolean32 = serializableOptional27.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableOptional27.stream();
        java.io.Serializable serializable34 = serializableOptional27.orElseThrow();
        java.lang.String str35 = serializableOptional27.toString();
        boolean boolean36 = serializableOptional1.equals((java.lang.Object) serializableOptional27);
        java.util.Optional<java.io.Serializable> serializableOptional38 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable39 = serializableOptional38.get();
        java.io.Serializable serializable40 = serializableOptional38.get();
        java.io.Serializable serializable41 = serializableOptional38.get();
        boolean boolean42 = serializableOptional38.isEmpty();
        java.lang.String str43 = serializableOptional38.toString();
        java.lang.Class<?> wildcardClass44 = serializableOptional38.getClass();
        java.io.Serializable serializable45 = serializableOptional27.orElse((java.io.Serializable) wildcardClass44);
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional46 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass44);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(genericDeclarationOptional23);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream25);
        org.junit.Assert.assertNotNull(serializableOptional27);
        org.junit.Assert.assertNotNull(serializableStream28);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + (byte) 1 + "'", serializable31, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(serializableStream33);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Optional[1]" + "'", str35, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serializableOptional38);
        org.junit.Assert.assertEquals("'" + serializable39 + "' != '" + (byte) 1 + "'", serializable39, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 1 + "'", serializable40, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 1 + "'", serializable41, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Optional[1]" + "'", str43, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + serializable45 + "' != '" + (byte) 1 + "'", serializable45, (byte) 1);
        org.junit.Assert.assertNotNull(genericDeclarationOptional46);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        java.lang.String str10 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional0 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass1 = charSequenceOptional0.getClass();
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional2 = java.util.Optional.of(wildcardClass1);
        java.lang.Class<?> wildcardClass3 = wildcardClassOptional2.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional4 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass3);
        org.junit.Assert.assertNotNull(charSequenceOptional0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClassOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(annotatedElementOptional4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.io.Serializable serializable8 = serializableOptional1.get();
        java.io.Serializable serializable9 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional4 = java.util.Optional.of(serializableOptional1);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional6 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean7 = serializableOptional1.isPresent();
        java.lang.String str8 = serializableOptional1.toString();
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional10 = java.util.Optional.ofNullable(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        boolean boolean14 = serializableOptional8.isEmpty();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable16 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable17 = serializableOptional1.get();
        boolean boolean18 = serializableOptional1.isEmpty();
        java.io.Serializable serializable19 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.of("hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable10 = serializableOptional1.orElse((java.io.Serializable) "Optional[10.0]");
        java.lang.String str11 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional[1]" + "'", str11, "Optional[1]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        java.lang.String str4 = serializableOptional1.toString();
        boolean boolean5 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Optional[1]" + "'", str4, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional5 = java.util.Optional.ofNullable(serializableStream4);
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional6 = java.util.Optional.ofNullable(serializableStream4);
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional7 = java.util.Optional.ofNullable(serializableStream4);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableStreamOptional5);
        org.junit.Assert.assertNotNull(serializableStreamOptional6);
        org.junit.Assert.assertNotNull(serializableStreamOptional7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(strComparableOptional0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional16.stream();
        java.io.Serializable serializable19 = serializableOptional16.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable20 = serializableOptional16.get();
        boolean boolean21 = serializableOptional16.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional16.stream();
        boolean boolean23 = serializableOptional8.equals((java.lang.Object) serializableOptional16);
        boolean boolean24 = serializableOptional8.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) "");
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional9.stream();
        java.io.Serializable serializable12 = serializableOptional9.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional9.stream();
        java.lang.String str14 = serializableOptional9.toString();
        java.io.Serializable serializable15 = serializableOptional9.get();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializable15);
        boolean boolean17 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(constantDescOptional0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass3 = serializableStream2.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional4 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass3);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional5 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional6 = java.util.Optional.ofNullable(wildcardClass3);
        java.util.Optional<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldOptional7 = java.util.Optional.ofNullable((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass3);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeOptional4);
        org.junit.Assert.assertNotNull(annotatedElementOptional5);
        org.junit.Assert.assertNotNull(wildcardClassOptional6);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldOptional7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.util.Optional<java.lang.String> strOptional10 = java.util.Optional.empty();
        boolean boolean11 = serializableOptional1.equals((java.lang.Object) strOptional10);
        boolean boolean12 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(strOptional10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableStream15);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        java.io.Serializable serializable13 = serializableOptional8.orElse((java.io.Serializable) 100L);
        boolean boolean14 = serializableOptional8.isPresent();
        boolean boolean15 = serializableOptional8.isPresent();
        java.io.Serializable serializable16 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional8.stream();
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable19 = serializableOptional8.get();
        java.lang.Class<?> wildcardClass20 = serializable19.getClass();
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional21 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass20);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(annotatedElementOptional21);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(autoCloseableOptional0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.io.Serializable serializable23 = serializableOptional20.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional20.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional25 = java.util.Optional.ofNullable(serializableStream24);
        java.lang.Class<?> wildcardClass26 = serializableStreamOptional25.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        boolean boolean28 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional30 = java.util.Optional.ofNullable(serializableStream29);
        java.lang.Class<?> wildcardClass31 = serializableStream29.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableStreamOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertNotNull(serializableStreamOptional30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable9 = serializableOptional1.orElse((java.io.Serializable) 'a');
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        boolean boolean18 = serializableOptional11.isEmpty();
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional22 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional22.stream();
        boolean boolean24 = serializableOptional22.isEmpty();
        java.io.Serializable serializable25 = serializableOptional22.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional27 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean29 = serializableOptional27.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableOptional27.stream();
        java.io.Serializable serializable31 = serializableOptional27.get();
        java.lang.Class<?> wildcardClass32 = serializableOptional27.getClass();
        java.io.Serializable serializable33 = serializableOptional22.orElse((java.io.Serializable) wildcardClass32);
        java.io.Serializable serializable34 = serializableOptional1.orElse((java.io.Serializable) wildcardClass32);
        java.lang.Class<?> wildcardClass35 = serializable34.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertNotNull(serializableOptional22);
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(serializableStream30);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + (byte) 1 + "'", serializable31, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + serializable33 + "' != '" + (byte) 1 + "'", serializable33, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.lang.String str13 = serializableOptional8.toString();
        java.lang.Class<?> wildcardClass14 = serializableOptional8.getClass();
        java.io.Serializable serializable15 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableOptional17.stream();
        java.io.Serializable serializable21 = serializableOptional17.get();
        java.io.Serializable serializable22 = serializableOptional17.orElseThrow();
        boolean boolean23 = serializableOptional17.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional17.stream();
        boolean boolean25 = serializableOptional1.equals((java.lang.Object) serializableOptional17);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.get();
        java.util.Optional<java.lang.CharSequence> charSequenceOptional8 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass9 = charSequenceOptional8.getClass();
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional10 = java.util.Optional.of(wildcardClass9);
        java.io.Serializable serializable11 = serializableOptional1.orElse((java.io.Serializable) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = serializableOptional1.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional13 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass12);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(charSequenceOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClassOptional10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationOptional13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.lang.Object> objOptional6 = java.util.Optional.of((java.lang.Object) serializableOptional1);
        boolean boolean7 = serializableOptional1.isPresent();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(objOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional1 = java.util.Optional.of((java.lang.Comparable<java.lang.String>) "Optional[class java.util.Optional]");
        org.junit.Assert.assertNotNull(strComparableOptional1);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        java.lang.String str4 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional6.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional6.stream();
        java.io.Serializable serializable10 = serializableOptional6.orElseThrow();
        java.io.Serializable serializable11 = serializableOptional6.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional6.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableOptional6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Optional[1]" + "'", str4, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional5 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional5.stream();
        java.io.Serializable serializable8 = serializableOptional5.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional5.stream();
        boolean boolean10 = serializableOptional1.equals((java.lang.Object) serializableOptional5);
        boolean boolean11 = serializableOptional1.isPresent();
        boolean boolean12 = serializableOptional1.isPresent();
        java.io.Serializable serializable13 = serializableOptional1.get();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional5);
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream14);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        boolean boolean12 = serializableOptional10.isEmpty();
        java.io.Serializable serializable13 = serializableOptional10.orElseThrow();
        boolean boolean14 = serializableOptional10.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean17 = serializableOptional16.isPresent();
        java.io.Serializable serializable18 = serializableOptional16.orElseThrow();
        java.io.Serializable serializable19 = serializableOptional16.orElseThrow();
        boolean boolean20 = serializableOptional16.isEmpty();
        boolean boolean21 = serializableOptional10.equals((java.lang.Object) serializableOptional16);
        java.lang.Class<?> wildcardClass22 = serializableOptional16.getClass();
        java.io.Serializable serializable23 = serializableOptional1.orElse((java.io.Serializable) wildcardClass22);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        boolean boolean16 = serializableOptional8.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional18.stream();
        boolean boolean21 = serializableOptional18.equals((java.lang.Object) false);
        java.lang.String str22 = serializableOptional18.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableOptional18.stream();
        boolean boolean24 = serializableOptional8.equals((java.lang.Object) serializableOptional18);
        java.util.stream.Stream<java.io.Serializable> serializableStream25 = serializableOptional8.stream();
        java.util.Optional<java.io.Serializable> serializableOptional27 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable28 = serializableOptional27.get();
        java.io.Serializable serializable29 = serializableOptional27.get();
        boolean boolean30 = serializableOptional27.isPresent();
        java.io.Serializable serializable31 = serializableOptional27.get();
        boolean boolean32 = serializableOptional27.isPresent();
        boolean boolean33 = serializableOptional27.isPresent();
        boolean boolean34 = serializableOptional8.equals((java.lang.Object) boolean33);
        java.lang.String str35 = serializableOptional8.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Optional[1]" + "'", str22, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(serializableStream25);
        org.junit.Assert.assertNotNull(serializableOptional27);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + (byte) 1 + "'", serializable31, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Optional[1]" + "'", str35, "Optional[1]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(autoCloseableOptional0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        boolean boolean14 = serializableOptional8.isEmpty();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable18 = serializableOptional17.get();
        java.io.Serializable serializable19 = serializableOptional17.get();
        java.io.Serializable serializable20 = serializableOptional17.get();
        java.io.Serializable serializable22 = serializableOptional17.orElse((java.io.Serializable) 100L);
        boolean boolean23 = serializableOptional17.isPresent();
        boolean boolean24 = serializableOptional17.isPresent();
        boolean boolean25 = serializableOptional17.isPresent();
        java.lang.Class<?> wildcardClass26 = serializableOptional17.getClass();
        java.io.Serializable serializable27 = serializableOptional8.orElse((java.io.Serializable) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = serializable27.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + (byte) 1 + "'", serializable20, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(wildcardClassOptional0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = serializableOptional1.orElse(serializable5);
        boolean boolean7 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.io.Serializable serializable13 = serializableOptional10.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable14 = serializableOptional10.get();
        boolean boolean15 = serializableOptional10.isPresent();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableOptional10);
        boolean boolean17 = serializableOptional10.isEmpty();
        java.io.Serializable serializable18 = serializableOptional10.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        boolean boolean22 = serializableOptional20.isEmpty();
        boolean boolean23 = serializableOptional20.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional25 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean26 = serializableOptional25.isPresent();
        java.io.Serializable serializable28 = serializableOptional25.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable29 = serializableOptional25.get();
        java.lang.String str30 = serializableOptional25.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableOptional25.stream();
        java.lang.Class<?> wildcardClass32 = serializableOptional25.getClass();
        java.io.Serializable serializable33 = serializableOptional20.orElse((java.io.Serializable) wildcardClass32);
        java.io.Serializable serializable34 = serializableOptional10.orElse((java.io.Serializable) wildcardClass32);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(serializableOptional25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Optional[1]" + "'", str30, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + serializable33 + "' != '" + (byte) 1 + "'", serializable33, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.lang.Class<?> wildcardClass12 = serializableStream11.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional13 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional14 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass12);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional15 = java.util.Optional.ofNullable(wildcardClass12);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass12);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional1.stream();
        java.io.Serializable serializable18 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional1.stream();
        boolean boolean20 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeOptional13);
        org.junit.Assert.assertNotNull(annotatedElementOptional14);
        org.junit.Assert.assertNotNull(wildcardClassOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.lang.String str7 = serializableOptional1.toString();
        java.lang.Class<?> wildcardClass8 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Optional<java.lang.reflect.Type> typeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeOptional0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional4 = java.util.Optional.of(serializableOptional1);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional6 = java.util.Optional.ofNullable(serializableOptional1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptionalOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("Optional[10.0]");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        boolean boolean15 = serializableOptional8.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.lang.String str5 = serializableOptional1.toString();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean14 = serializableOptional12.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional12.stream();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableStream15);
        java.io.Serializable serializable17 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable18 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable19 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        boolean boolean9 = serializableOptional1.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.lang.String str4 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable7 = serializableOptional6.get();
        java.io.Serializable serializable8 = serializableOptional6.get();
        java.io.Serializable serializable9 = serializableOptional6.get();
        boolean boolean10 = serializableOptional6.isEmpty();
        java.lang.String str11 = serializableOptional6.toString();
        boolean boolean12 = serializableOptional6.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional6.stream();
        java.lang.Class<?> wildcardClass14 = serializableStream13.getClass();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Optional[1]" + "'", str4, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional[1]" + "'", str11, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional7.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional7.stream();
        java.io.Serializable serializable11 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable12 = serializableOptional7.orElseThrow();
        java.lang.Class<?> wildcardClass13 = serializable12.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional1.stream();
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional16 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream15);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(autoCloseableOptional16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional5 = java.util.Optional.ofNullable(serializableStream4);
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional6 = java.util.Optional.ofNullable(serializableStream4);
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional7 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream4);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableStreamOptional5);
        org.junit.Assert.assertNotNull(serializableStreamOptional6);
        org.junit.Assert.assertNotNull(autoCloseableOptional7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        boolean boolean18 = serializableOptional11.isEmpty();
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional21.stream();
        java.io.Serializable serializable24 = serializableOptional21.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable26 = serializableOptional21.orElse((java.io.Serializable) "");
        boolean boolean27 = serializableOptional21.isPresent();
        boolean boolean28 = serializableOptional1.equals((java.lang.Object) serializableOptional21);
        java.util.Optional<java.io.Serializable> serializableOptional30 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableOptional30.stream();
        java.io.Serializable serializable33 = serializableOptional30.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableOptional30.stream();
        java.lang.String str35 = serializableOptional30.toString();
        java.lang.Class<?> wildcardClass36 = serializableOptional30.getClass();
        java.io.Serializable serializable37 = serializableOptional21.orElse((java.io.Serializable) wildcardClass36);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional38 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass36);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(serializableOptional30);
        org.junit.Assert.assertNotNull(serializableStream31);
        org.junit.Assert.assertEquals("'" + serializable33 + "' != '" + (byte) 1 + "'", serializable33, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Optional[1]" + "'", str35, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (byte) 1 + "'", serializable37, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional38);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Optional<java.lang.Object> objOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(objOptional0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional1 = java.util.Optional.of((java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertNotNull(constantDescOptional1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional13 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass14 = strComparableOptional13.getClass();
        java.io.Serializable serializable15 = serializableOptional8.orElse((java.io.Serializable) wildcardClass14);
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable17 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(strComparableOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean10 = serializableOptional8.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable12 = serializableOptional8.orElse((java.io.Serializable) '#');
        java.lang.String str13 = serializableOptional8.toString();
        boolean boolean14 = serializableOptional8.isEmpty();
        boolean boolean15 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = serializableOptional8.equals((java.lang.Object) wildcardClass17);
        boolean boolean19 = serializableOptional8.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable7 = serializableOptional1.get();
        java.util.Optional<java.lang.CharSequence> charSequenceOptional8 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass9 = charSequenceOptional8.getClass();
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional10 = java.util.Optional.of(wildcardClass9);
        java.io.Serializable serializable11 = serializableOptional1.orElse((java.io.Serializable) wildcardClass9);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional1.stream();
        java.io.Serializable serializable13 = serializableOptional1.orElseThrow();
        java.lang.String str14 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(charSequenceOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClassOptional10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.lang.String str4 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Optional[1]" + "'", str4, "Optional[1]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.Class<?> wildcardClass8 = serializableStream7.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional9 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass8);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional10 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass8);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional11 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeDescriptorOptional9);
        org.junit.Assert.assertNotNull(typeDescriptorOptional10);
        org.junit.Assert.assertNotNull(typeDescriptorOptional11);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        boolean boolean14 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean17 = serializableOptional16.isPresent();
        java.io.Serializable serializable19 = serializableOptional16.orElse((java.io.Serializable) (byte) 10);
        boolean boolean20 = serializableOptional16.isPresent();
        java.io.Serializable serializable22 = serializableOptional16.orElse((java.io.Serializable) (-1L));
        java.util.Optional<java.io.Serializable> serializableOptional24 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean26 = serializableOptional24.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream27 = serializableOptional24.stream();
        java.io.Serializable serializable28 = serializableOptional24.get();
        boolean boolean29 = serializableOptional24.isPresent();
        boolean boolean30 = serializableOptional24.isEmpty();
        boolean boolean31 = serializableOptional16.equals((java.lang.Object) boolean30);
        java.lang.String str32 = serializableOptional16.toString();
        boolean boolean33 = serializableOptional1.equals((java.lang.Object) serializableOptional16);
        boolean boolean34 = serializableOptional16.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableStream27);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Optional[1]" + "'", str32, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.lang.String str6 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.io.Serializable serializable13 = serializableOptional10.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable14 = serializableOptional10.get();
        boolean boolean15 = serializableOptional10.isPresent();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableOptional10);
        boolean boolean17 = serializableOptional10.isEmpty();
        java.lang.String str18 = serializableOptional10.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Optional[1]" + "'", str18, "Optional[1]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        java.io.Serializable serializable10 = serializableOptional1.orElseThrow();
        boolean boolean11 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(serializableStream12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional9 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream8);
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional10 = java.util.Optional.of(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional9);
        org.junit.Assert.assertNotNull(serializableStreamOptional10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable12 = serializableOptional8.get();
        java.lang.String str13 = serializableOptional8.toString();
        java.lang.Class<?> wildcardClass14 = serializableOptional8.getClass();
        java.io.Serializable serializable15 = serializableOptional1.orElse((java.io.Serializable) wildcardClass14);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional16 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass14);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional17 = java.util.Optional.of(wildcardClass14);
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.ofNullable((java.io.Serializable) wildcardClass14);
        java.lang.String str19 = serializableOptional18.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Optional[1]" + "'", str13, "Optional[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional16);
        org.junit.Assert.assertNotNull(wildcardClassOptional17);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Optional[class java.util.Optional]" + "'", str19, "Optional[class java.util.Optional]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        boolean boolean9 = serializableOptional1.isPresent();
        boolean boolean10 = serializableOptional1.isEmpty();
        java.io.Serializable serializable11 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional2 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Optional<java.lang.constant.Constable> constableOptional3 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericDeclarationOptional2);
        org.junit.Assert.assertNotNull(constableOptional3);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.io.Serializable serializable5 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable6 = serializableOptional1.get();
        java.io.Serializable serializable8 = serializableOptional1.orElse((java.io.Serializable) (short) 0);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.lang.String str10 = serializableOptional8.toString();
        java.io.Serializable serializable11 = serializableOptional8.get();
        boolean boolean12 = serializableOptional8.isEmpty();
        boolean boolean13 = serializableOptional8.isEmpty();
        java.lang.String str14 = serializableOptional8.toString();
        java.io.Serializable serializable15 = serializableOptional8.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional8.getClass();
        java.io.Serializable serializable17 = serializableOptional1.orElse((java.io.Serializable) wildcardClass16);
        java.util.Optional<java.lang.constant.Constable> constableOptional18 = java.util.Optional.ofNullable((java.lang.constant.Constable) wildcardClass16);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertNotNull(constableOptional18);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.lang.Class<?> wildcardClass12 = serializableStream11.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional13 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional14 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass12);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional15 = java.util.Optional.ofNullable(wildcardClass12);
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) wildcardClass12);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional1.stream();
        java.io.Serializable serializable18 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableOptional1.stream();
        java.util.Optional<java.lang.AutoCloseable> autoCloseableOptional20 = java.util.Optional.ofNullable((java.lang.AutoCloseable) serializableStream19);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeOptional13);
        org.junit.Assert.assertNotNull(annotatedElementOptional14);
        org.junit.Assert.assertNotNull(wildcardClassOptional15);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream19);
        org.junit.Assert.assertNotNull(autoCloseableOptional20);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = null;
        java.io.Serializable serializable7 = serializableOptional1.orElse(serializable6);
        boolean boolean8 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(serializableOptionalOptional0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        boolean boolean10 = serializableOptional1.isPresent();
        java.io.Serializable serializable11 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable12 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional6 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass7 = strComparableOptional6.getClass();
        java.io.Serializable serializable8 = serializableOptional1.orElse((java.io.Serializable) wildcardClass7);
        boolean boolean9 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(strComparableOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean4 = serializableOptional1.isPresent();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableOptional7.get();
        java.io.Serializable serializable9 = serializableOptional7.get();
        java.io.Serializable serializable10 = serializableOptional7.get();
        boolean boolean11 = serializableOptional7.isEmpty();
        java.io.Serializable serializable12 = serializableOptional7.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional7.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional7.stream();
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional16.stream();
        java.lang.Class<?> wildcardClass18 = serializableStream17.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional19 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass18);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional20 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass18);
        java.util.Optional<java.lang.Class<?>> wildcardClassOptional21 = java.util.Optional.ofNullable(wildcardClass18);
        java.io.Serializable serializable22 = serializableOptional7.orElse((java.io.Serializable) wildcardClass18);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional23 = java.util.Optional.ofNullable((java.lang.reflect.AnnotatedElement) wildcardClass18);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional24 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.io.Serializable serializable25 = serializableOptional1.orElse((java.io.Serializable) wildcardClass18);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(typeOptional19);
        org.junit.Assert.assertNotNull(annotatedElementOptional20);
        org.junit.Assert.assertNotNull(wildcardClassOptional21);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional23);
        org.junit.Assert.assertNotNull(typeDescriptorOptional24);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + (byte) 1 + "'", serializable25, (byte) 1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeDescriptorOptional0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamOptional5 = java.util.Optional.ofNullable((java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>) serializableStream4);
        java.lang.Class<?> wildcardClass6 = serializableStream4.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(serializableBaseStreamOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable11 = serializableOptional10.get();
        java.io.Serializable serializable12 = serializableOptional10.get();
        java.io.Serializable serializable13 = serializableOptional10.get();
        java.io.Serializable serializable15 = serializableOptional10.orElse((java.io.Serializable) 100L);
        boolean boolean16 = serializableOptional10.isPresent();
        boolean boolean17 = serializableOptional1.equals((java.lang.Object) serializableOptional10);
        boolean boolean18 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass9 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.io.Serializable serializable13 = serializableOptional1.orElseThrow();
        java.lang.String str14 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.util.Optional<java.lang.reflect.GenericDeclaration> genericDeclarationOptional6 = java.util.Optional.of((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) wildcardClass5);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(genericDeclarationOptional6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.lang.String str5 = serializableOptional1.toString();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean9 = serializableOptional8.isPresent();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (byte) 10);
        boolean boolean12 = serializableOptional8.isPresent();
        boolean boolean13 = serializableOptional8.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional8.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional8.stream();
        java.util.Optional<java.io.Serializable> serializableOptional17 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean19 = serializableOptional17.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass20 = serializableOptional17.getClass();
        java.io.Serializable serializable21 = serializableOptional8.orElse((java.io.Serializable) wildcardClass20);
        java.io.Serializable serializable22 = serializableOptional1.orElse((java.io.Serializable) wildcardClass20);
        java.io.Serializable serializable23 = serializableOptional1.get();
        boolean boolean24 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertNotNull(serializableOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + (byte) 1 + "'", serializable21, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        boolean boolean4 = serializableOptional1.isPresent();
        java.lang.String str5 = serializableOptional1.toString();
        boolean boolean6 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.orElse((java.io.Serializable) (-1L));
        boolean boolean8 = serializableOptional1.isEmpty();
        boolean boolean9 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable8 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableStream9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Optional<java.lang.CharSequence> charSequenceOptional1 = java.util.Optional.of((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(charSequenceOptional1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Optional<java.lang.String> strOptional1 = java.util.Optional.ofNullable("hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        java.io.Serializable serializable6 = serializableOptional1.orElse((java.io.Serializable) 100L);
        boolean boolean7 = serializableOptional1.isPresent();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        java.io.Serializable serializable13 = serializableOptional10.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable14 = serializableOptional10.get();
        boolean boolean15 = serializableOptional10.isPresent();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableOptional10);
        boolean boolean17 = serializableOptional10.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional19 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean21 = serializableOptional19.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional19.stream();
        java.io.Serializable serializable23 = serializableOptional19.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional19.stream();
        java.util.Optional<java.io.Serializable> serializableOptional26 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable27 = serializableOptional26.get();
        java.io.Serializable serializable28 = serializableOptional26.get();
        java.io.Serializable serializable29 = serializableOptional26.get();
        java.io.Serializable serializable31 = serializableOptional26.orElse((java.io.Serializable) 100L);
        boolean boolean32 = serializableOptional26.isPresent();
        boolean boolean33 = serializableOptional26.isPresent();
        java.io.Serializable serializable34 = serializableOptional26.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream35 = serializableOptional26.stream();
        boolean boolean36 = serializableOptional19.equals((java.lang.Object) serializableOptional26);
        boolean boolean37 = serializableOptional26.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional39 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable40 = serializableOptional39.get();
        java.io.Serializable serializable41 = serializableOptional39.get();
        java.io.Serializable serializable42 = serializableOptional39.get();
        boolean boolean43 = serializableOptional39.isEmpty();
        java.io.Serializable serializable44 = serializableOptional39.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream45 = serializableOptional39.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream46 = serializableOptional39.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream47 = serializableOptional39.stream();
        boolean boolean48 = serializableOptional26.equals((java.lang.Object) serializableStream47);
        boolean boolean49 = serializableOptional10.equals((java.lang.Object) serializableOptional26);
        java.lang.String str50 = serializableOptional26.toString();
        java.util.Optional<java.io.Serializable> serializableOptional52 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean53 = serializableOptional52.isPresent();
        java.io.Serializable serializable55 = serializableOptional52.orElse((java.io.Serializable) (byte) 10);
        boolean boolean56 = serializableOptional52.isPresent();
        boolean boolean57 = serializableOptional52.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional59 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream60 = serializableOptional59.stream();
        boolean boolean62 = serializableOptional59.equals((java.lang.Object) false);
        java.lang.String str63 = serializableOptional59.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream64 = serializableOptional59.stream();
        boolean boolean65 = serializableOptional52.equals((java.lang.Object) serializableOptional59);
        java.io.Serializable serializable66 = serializableOptional59.orElseThrow();
        boolean boolean67 = serializableOptional59.isEmpty();
        boolean boolean68 = serializableOptional26.equals((java.lang.Object) serializableOptional59);
        java.io.Serializable serializable69 = serializableOptional26.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableOptional26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + (byte) 1 + "'", serializable28, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + (byte) 1 + "'", serializable29, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + (byte) 1 + "'", serializable31, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 1 + "'", serializable34, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableOptional39);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 1 + "'", serializable40, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 1 + "'", serializable41, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (byte) 1 + "'", serializable42, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + (byte) 1 + "'", serializable44, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream45);
        org.junit.Assert.assertNotNull(serializableStream46);
        org.junit.Assert.assertNotNull(serializableStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Optional[1]" + "'", str50, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + serializable55 + "' != '" + (byte) 1 + "'", serializable55, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(serializableOptional59);
        org.junit.Assert.assertNotNull(serializableStream60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Optional[1]" + "'", str63, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + serializable66 + "' != '" + (byte) 1 + "'", serializable66, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable69 + "' != '" + (byte) 1 + "'", serializable69, (byte) 1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.get();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isEmpty();
        boolean boolean10 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        java.io.Serializable serializable4 = serializableOptional1.orElseThrow();
        boolean boolean5 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean8 = serializableOptional7.isPresent();
        java.io.Serializable serializable9 = serializableOptional7.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional7.orElseThrow();
        boolean boolean11 = serializableOptional7.isEmpty();
        boolean boolean12 = serializableOptional1.equals((java.lang.Object) serializableOptional7);
        java.lang.Class<?> wildcardClass13 = serializableOptional1.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional14 = java.util.Optional.ofNullable((java.lang.invoke.TypeDescriptor) wildcardClass13);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeDescriptorOptional14);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable9 = serializableOptional8.get();
        java.io.Serializable serializable10 = serializableOptional8.get();
        java.io.Serializable serializable11 = serializableOptional8.get();
        boolean boolean12 = serializableOptional8.isEmpty();
        java.io.Serializable serializable13 = serializableOptional8.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional8.stream();
        java.lang.Class<?> wildcardClass15 = serializableStream14.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional16 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional17 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.io.Serializable serializable18 = serializableOptional1.orElse((java.io.Serializable) wildcardClass15);
        boolean boolean19 = serializableOptional1.isEmpty();
        java.util.Optional<java.lang.constant.ConstantDesc> constantDescOptional20 = java.util.Optional.empty();
        boolean boolean21 = serializableOptional1.equals((java.lang.Object) constantDescOptional20);
        java.io.Serializable serializable22 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable23 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeDescriptorOptional16);
        org.junit.Assert.assertNotNull(typeDescriptorOptional17);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(constantDescOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (byte) 1 + "'", serializable22, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.lang.String str14 = serializableOptional1.toString();
        java.io.Serializable serializable16 = serializableOptional1.orElse((java.io.Serializable) false);
        java.lang.String str17 = serializableOptional1.toString();
        boolean boolean18 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Optional[1]" + "'", str17, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.lang.String str3 = serializableOptional1.toString();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        boolean boolean6 = serializableOptional1.isEmpty();
        java.lang.String str7 = serializableOptional1.toString();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional[1]" + "'", str7, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean4 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.isPresent();
        java.io.Serializable serializable6 = null;
        java.io.Serializable serializable7 = serializableOptional1.orElse(serializable6);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isEmpty();
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableOptional6.isPresent();
        java.io.Serializable serializable9 = serializableOptional6.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable10 = serializableOptional6.get();
        java.lang.String str11 = serializableOptional6.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional6.stream();
        java.lang.Class<?> wildcardClass13 = serializableOptional6.getClass();
        java.io.Serializable serializable14 = serializableOptional1.orElse((java.io.Serializable) wildcardClass13);
        boolean boolean15 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Optional[1]" + "'", str11, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableOptional1.stream();
        boolean boolean9 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable12 = serializableOptional11.get();
        java.io.Serializable serializable13 = serializableOptional11.get();
        java.io.Serializable serializable14 = serializableOptional11.get();
        boolean boolean15 = serializableOptional11.isEmpty();
        java.io.Serializable serializable16 = serializableOptional11.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream17 = serializableOptional11.stream();
        boolean boolean18 = serializableOptional11.isEmpty();
        boolean boolean19 = serializableOptional1.equals((java.lang.Object) serializableOptional11);
        java.util.Optional<java.io.Serializable> serializableOptional21 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableOptional21.stream();
        java.io.Serializable serializable24 = serializableOptional21.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable26 = serializableOptional21.orElse((java.io.Serializable) "");
        boolean boolean27 = serializableOptional21.isPresent();
        boolean boolean28 = serializableOptional1.equals((java.lang.Object) serializableOptional21);
        java.lang.String str29 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNotNull(serializableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableOptional21);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + (byte) 1 + "'", serializable26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Optional[1]" + "'", str29, "Optional[1]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isEmpty();
        java.lang.String str3 = serializableOptional1.toString();
        boolean boolean4 = serializableOptional1.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[1]" + "'", str3, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        boolean boolean3 = serializableOptional1.isEmpty();
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional5 = java.util.Optional.of(serializableOptional1);
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.empty();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        java.io.Serializable serializable8 = null;
        java.io.Serializable serializable9 = serializableOptional6.orElse(serializable8);
        java.util.Optional<java.lang.CharSequence> charSequenceOptional10 = java.util.Optional.empty();
        java.lang.Class<?> wildcardClass11 = charSequenceOptional10.getClass();
        java.io.Serializable serializable12 = serializableOptional6.orElse((java.io.Serializable) wildcardClass11);
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializable12);
        java.lang.String str14 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptionalOptional5);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(charSequenceOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(serializable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Optional[1]" + "'", str14, "Optional[1]");
    }
}

