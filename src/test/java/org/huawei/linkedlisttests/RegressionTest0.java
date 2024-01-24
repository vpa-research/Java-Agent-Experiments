package org.huawei.linkedlisttests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableList0.stream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(serializableStream4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable3 = serializableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.add((int) (short) 100, (java.io.Serializable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList4 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean5 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable7 = serializableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.lang.String str4 = serializableList0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList4 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean5 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList4);
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray9 = serializableList6.toArray();
        boolean boolean11 = serializableList6.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList12 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean13 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList12);
        boolean boolean14 = serializableList4.containsAll((java.util.Collection<java.io.Serializable>) serializableList6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.Iterator<java.io.Serializable> serializableItor6 = serializableList0.descendingIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        java.io.Serializable serializable1 = serializableList0.pollLast();
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor7 = serializableList0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean7 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable9 = serializableList6.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.removeLast();
        java.util.LinkedList<java.io.Serializable> serializableList10 = new java.util.LinkedList<java.io.Serializable>();
        int int12 = serializableList10.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray13 = serializableList10.toArray();
        boolean boolean15 = serializableList10.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList16 = new java.util.LinkedList<java.io.Serializable>();
        int int18 = serializableList16.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray19 = serializableList16.toArray();
        boolean boolean21 = serializableList16.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean23 = serializableList16.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable24 = serializableList16.pollFirst();
        serializableList10.addFirst((java.io.Serializable) serializableList16);
        java.lang.String str26 = serializableList10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable27 = serializableList0.set(0, (java.io.Serializable) serializableList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[[]]" + "'", str26, "[[]]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList4 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean5 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList4);
        java.io.Serializable serializable6 = serializableList4.poll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor8 = serializableList4.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekFirst();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.io.Serializable serializable41 = serializableList6.peekFirst();
        java.lang.Object[] objArray42 = serializableList6.toArray();
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList69 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        java.lang.Object[] objArray71 = serializableList69.toArray();
        serializableList6.push((java.io.Serializable) objArray71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList41 = new java.util.LinkedList<java.io.Serializable>();
        int int43 = serializableList41.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray44 = serializableList41.toArray();
        boolean boolean46 = serializableList41.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean47 = serializableList6.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        java.util.LinkedList<java.io.Serializable> serializableList48 = new java.util.LinkedList<java.io.Serializable>();
        int int50 = serializableList48.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray51 = serializableList48.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator52 = serializableList48.spliterator();
        boolean boolean53 = serializableList6.removeLastOccurrence((java.lang.Object) serializableSpliterator52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(serializableSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean7 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList6);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator8 = serializableList0.spliterator();
        boolean boolean9 = serializableList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList4 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean5 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList4);
        int int7 = serializableList4.lastIndexOf((java.lang.Object) "[]");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = serializableList4.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.io.Serializable serializable41 = serializableList6.peekFirst();
        java.lang.Object[] objArray42 = serializableList6.toArray();
        serializableList6.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList4 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean5 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList4);
        java.io.Serializable serializable6 = serializableList4.pollFirst();
        java.io.Serializable serializable7 = serializableList4.peekFirst();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        java.lang.Object[] objArray1 = serializableList0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.element();
        java.io.Serializable serializable41 = serializableList6.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.io.Serializable serializable41 = serializableList6.peekFirst();
        java.io.Serializable serializable42 = serializableList6.element();
        boolean boolean44 = serializableList6.offer((java.io.Serializable) true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (byte) 0 + "'", serializable42, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.ListIterator<java.io.Serializable> serializableItor4 = serializableList0.listIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(serializableItor4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray9 = serializableList6.toArray();
        boolean boolean11 = serializableList6.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean13 = serializableList6.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable14 = serializableList6.pollFirst();
        serializableList0.addFirst((java.io.Serializable) serializableList6);
        java.lang.String str16 = serializableList6.toString();
        java.util.LinkedList<java.io.Serializable> serializableList17 = new java.util.LinkedList<java.io.Serializable>();
        int int19 = serializableList17.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray20 = serializableList17.toArray();
        boolean boolean22 = serializableList17.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList23 = new java.util.LinkedList<java.io.Serializable>();
        int int25 = serializableList23.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList52 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.lang.Object[] objArray54 = serializableList52.toArray();
        boolean boolean55 = serializableList23.addAll((java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = serializableList17.add((java.io.Serializable) serializableList23);
        boolean boolean57 = serializableList6.add((java.io.Serializable) serializableList17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator4 = serializableList0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = serializableList0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(serializableSpliterator4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.pollFirst();
        java.io.Serializable serializable9 = serializableList0.pollFirst();
        java.util.LinkedList<java.io.Serializable> serializableList10 = new java.util.LinkedList<java.io.Serializable>();
        int int12 = serializableList10.lastIndexOf((java.lang.Object) ' ');
        int int13 = serializableList0.lastIndexOf((java.lang.Object) int12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.contains((java.lang.Object) boolean38);
        serializableList0.push((java.io.Serializable) "[[]]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.lang.String str8 = serializableList0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[1]" + "'", str8, "[1]");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.io.Serializable serializable41 = serializableList6.peekFirst();
        java.lang.Object[] objArray42 = serializableList6.toArray();
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList69 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        java.lang.Object[] objArray71 = serializableList69.toArray();
        boolean boolean73 = serializableList69.removeLastOccurrence((java.lang.Object) "hi!");
        boolean boolean74 = serializableList6.offerFirst((java.io.Serializable) boolean73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList29 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList29, serializableArray28);
        java.lang.Object[] objArray31 = serializableList29.toArray();
        boolean boolean32 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList29);
        java.io.Serializable serializable33 = serializableList0.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + serializable33 + "' != '" + (byte) 0 + "'", serializable33, (byte) 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.io.Serializable serializable41 = serializableList6.peekFirst();
        java.io.Serializable serializable42 = serializableList6.element();
        java.util.LinkedList<java.io.Serializable> serializableList43 = new java.util.LinkedList<java.io.Serializable>();
        int int45 = serializableList43.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray46 = serializableList43.toArray();
        boolean boolean48 = serializableList43.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList49 = new java.util.LinkedList<java.io.Serializable>();
        int int51 = serializableList49.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList78 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList78, serializableArray77);
        java.lang.Object[] objArray80 = serializableList78.toArray();
        boolean boolean81 = serializableList49.addAll((java.util.Collection<java.io.Serializable>) serializableList78);
        boolean boolean82 = serializableList43.add((java.io.Serializable) serializableList49);
        java.io.Serializable serializable83 = serializableList49.peekLast();
        java.io.Serializable serializable84 = serializableList49.peekFirst();
        java.io.Serializable serializable85 = serializableList49.element();
        boolean boolean86 = serializableList6.contains((java.lang.Object) serializableList49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (byte) 0 + "'", serializable42, (byte) 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + serializable83 + "' != '" + (byte) 0 + "'", serializable83, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable84 + "' != '" + (byte) 0 + "'", serializable84, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 0 + "'", serializable85, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable serializable4 = null;
        serializableList0.add(0, serializable4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList41 = new java.util.LinkedList<java.io.Serializable>();
        int int43 = serializableList41.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray44 = serializableList41.toArray();
        boolean boolean46 = serializableList41.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean47 = serializableList6.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        java.util.LinkedList<java.io.Serializable> serializableList48 = new java.util.LinkedList<java.io.Serializable>();
        int int50 = serializableList48.lastIndexOf((java.lang.Object) ' ');
        System.out.println("START OF TH RETAINALL");
        boolean boolean51 = serializableList6.retainAll((java.util.Collection<java.io.Serializable>) serializableList48);
        boolean boolean52 = serializableList48.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        System.out.println("EXCEPTION IS HERE:" + boolean51 + " ");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.io.Serializable serializable41 = serializableList6.peekFirst();
        java.lang.Object[] objArray42 = serializableList6.toArray();
        boolean boolean44 = serializableList6.removeLastOccurrence((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + (byte) 0 + "'", serializable41, (byte) 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList0.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream41 = serializableList0.parallelStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableStream41);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        serializableList6.add((int) (byte) 10, (java.io.Serializable) 10);
        java.io.Serializable serializable44 = serializableList6.pollFirst();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + (byte) 0 + "'", serializable44, (byte) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray9 = serializableList6.toArray();
        boolean boolean11 = serializableList6.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean13 = serializableList6.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable14 = serializableList6.pollFirst();
        serializableList0.addFirst((java.io.Serializable) serializableList6);
        java.util.ListIterator<java.io.Serializable> serializableItor17 = serializableList0.listIterator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor17);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList29 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList29, serializableArray28);
        java.lang.Object[] objArray31 = serializableList29.toArray();
        boolean boolean32 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList29);
        java.io.Serializable serializable33 = serializableList0.removeLast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + serializable33 + "' != '" + (byte) 0 + "'", serializable33, (byte) 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean7 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList6);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator8 = serializableList0.spliterator();
        int int10 = serializableList0.lastIndexOf((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList41 = new java.util.LinkedList<java.io.Serializable>();
        int int43 = serializableList41.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray44 = serializableList41.toArray();
        boolean boolean46 = serializableList41.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean47 = serializableList6.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        java.util.LinkedList<java.io.Serializable> serializableList48 = new java.util.LinkedList<java.io.Serializable>();
        int int50 = serializableList48.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray51 = serializableList48.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList52 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean53 = serializableList48.retainAll((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable serializable54 = serializableList52.poll();
        java.lang.Object[] objArray55 = serializableList52.toArray();
        boolean boolean56 = serializableList6.retainAll((java.util.Collection<java.io.Serializable>) serializableList52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(serializable54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        System.out.println("test40 boolean56 " + boolean56);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean7 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList6);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator8 = serializableList0.spliterator();
        int int9 = serializableList0.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList26 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList26, serializableArray25);
        java.lang.Object[] objArray28 = serializableList26.toArray();
        java.lang.Object[] objArray29 = serializableList26.toArray();
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList4 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean5 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList4);
        int int7 = serializableList4.lastIndexOf((java.lang.Object) "[]");
        serializableList4.addFirst((java.io.Serializable) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList29 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList29, serializableArray28);
        java.lang.Object[] objArray31 = serializableList29.toArray();
        boolean boolean32 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList29);
        java.lang.Object[] objArray33 = serializableList29.toArray();
        java.io.Serializable serializable34 = serializableList29.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (byte) 0 + "'", serializable34, (byte) 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean7 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList6);
        java.util.LinkedList<java.io.Serializable> serializableList8 = new java.util.LinkedList<java.io.Serializable>();
        int int10 = serializableList8.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray11 = serializableList8.toArray();
        java.util.LinkedList<java.io.Serializable> serializableList12 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean13 = serializableList8.retainAll((java.util.Collection<java.io.Serializable>) serializableList12);
        java.io.Serializable serializable14 = serializableList12.poll();
        java.lang.Object[] objArray15 = serializableList12.toArray();
        boolean boolean16 = serializableList0.offerFirst((java.io.Serializable) serializableList12);
        java.lang.Object[] objArray17 = serializableList12.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.pollFirst();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList0.parallelStream();
        boolean boolean11 = serializableList0.add((java.io.Serializable) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.contains((java.lang.Object) boolean38);
        java.util.LinkedList<java.io.Serializable> serializableList40 = new java.util.LinkedList<java.io.Serializable>();
        int int42 = serializableList40.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray43 = serializableList40.toArray();
        boolean boolean45 = serializableList40.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList46 = new java.util.LinkedList<java.io.Serializable>();
        int int48 = serializableList46.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList75 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList75, serializableArray74);
        java.lang.Object[] objArray77 = serializableList75.toArray();
        boolean boolean78 = serializableList46.addAll((java.util.Collection<java.io.Serializable>) serializableList75);
        boolean boolean79 = serializableList40.add((java.io.Serializable) serializableList46);
        java.io.Serializable serializable80 = serializableList46.peekLast();
        serializableList46.add((int) (byte) 10, (java.io.Serializable) 10);
        java.io.Serializable serializable84 = serializableList46.getFirst();
        boolean boolean85 = serializableList0.removeAll((java.util.Collection<java.io.Serializable>) serializableList46);
        java.io.Serializable serializable86 = serializableList0.peekLast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + serializable80 + "' != '" + (byte) 0 + "'", serializable80, (byte) 0);
        org.junit.Assert.assertEquals("'" + serializable84 + "' != '" + (byte) 0 + "'", serializable84, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(serializable86);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList41 = new java.util.LinkedList<java.io.Serializable>();
        int int43 = serializableList41.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray44 = serializableList41.toArray();
        boolean boolean46 = serializableList41.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean47 = serializableList6.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        java.util.LinkedList<java.io.Serializable> serializableList49 = new java.util.LinkedList<java.io.Serializable>();
        int int51 = serializableList49.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray52 = serializableList49.toArray();
        boolean boolean54 = serializableList49.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean56 = serializableList49.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable57 = serializableList49.pollFirst();
        java.util.stream.Stream<java.io.Serializable> serializableStream58 = serializableList49.parallelStream();
        java.io.Serializable serializable59 = serializableList6.set((int) (short) 1, (java.io.Serializable) serializableList49);
        java.io.Serializable serializable60 = serializableList6.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + serializable57 + "' != '" + (byte) 1 + "'", serializable57, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream58);
        org.junit.Assert.assertEquals("'" + serializable59 + "' != '" + 10.0d + "'", serializable59, 10.0d);
        org.junit.Assert.assertEquals("'" + serializable60 + "' != '" + (byte) 0 + "'", serializable60, (byte) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable41 = serializableList0.remove(0);
        java.util.LinkedList<java.io.Serializable> serializableList42 = new java.util.LinkedList<java.io.Serializable>();
        int int44 = serializableList42.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray45 = serializableList42.toArray();
        boolean boolean47 = serializableList42.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean49 = serializableList42.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable50 = serializableList42.removeLast();
        serializableList0.push(serializable50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializable41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + (byte) 1 + "'", serializable50, (byte) 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray9 = serializableList6.toArray();
        boolean boolean11 = serializableList6.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean13 = serializableList6.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable14 = serializableList6.pollFirst();
        serializableList0.addFirst((java.io.Serializable) serializableList6);
        java.lang.String str16 = serializableList6.toString();
        java.util.LinkedList<java.io.Serializable> serializableList17 = new java.util.LinkedList<java.io.Serializable>();
        int int19 = serializableList17.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray20 = serializableList17.toArray();
        boolean boolean22 = serializableList17.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList23 = new java.util.LinkedList<java.io.Serializable>();
        int int25 = serializableList23.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList52 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.lang.Object[] objArray54 = serializableList52.toArray();
        boolean boolean55 = serializableList23.addAll((java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean56 = serializableList17.add((java.io.Serializable) serializableList23);
        java.io.Serializable serializable57 = serializableList23.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList58 = new java.util.LinkedList<java.io.Serializable>();
        int int60 = serializableList58.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray61 = serializableList58.toArray();
        boolean boolean63 = serializableList58.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean64 = serializableList23.containsAll((java.util.Collection<java.io.Serializable>) serializableList58);
        boolean boolean65 = serializableList6.remove((java.lang.Object) serializableList58);
        java.lang.constant.Constable[] constableArray71 = new java.lang.constant.Constable[] { (short) 10, "[]", (short) 1, (short) -1, 100.0d };
        java.lang.constant.Constable[] constableArray72 = serializableList58.toArray(constableArray71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + (byte) 1 + "'", serializable14, (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + serializable57 + "' != '" + (byte) 0 + "'", serializable57, (byte) 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray72);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.pollFirst();
        java.io.Serializable serializable9 = serializableList0.pollFirst();
        java.util.LinkedList<java.io.Serializable> serializableList10 = new java.util.LinkedList<java.io.Serializable>();
        int int12 = serializableList10.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray13 = serializableList10.toArray();
        boolean boolean15 = serializableList10.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList16 = new java.util.LinkedList<java.io.Serializable>();
        int int18 = serializableList16.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList45 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.lang.Object[] objArray47 = serializableList45.toArray();
        boolean boolean48 = serializableList16.addAll((java.util.Collection<java.io.Serializable>) serializableList45);
        boolean boolean49 = serializableList10.add((java.io.Serializable) serializableList16);
        java.io.Serializable serializable50 = serializableList16.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList51 = new java.util.LinkedList<java.io.Serializable>();
        int int53 = serializableList51.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray54 = serializableList51.toArray();
        boolean boolean56 = serializableList51.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean57 = serializableList16.containsAll((java.util.Collection<java.io.Serializable>) serializableList51);
        boolean boolean58 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList16);
        java.io.Serializable serializable59 = serializableList16.getLast();
        java.util.LinkedList<java.io.Serializable> serializableList60 = new java.util.LinkedList<java.io.Serializable>();
        int int62 = serializableList60.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray63 = serializableList60.toArray();
        boolean boolean65 = serializableList60.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean67 = serializableList60.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable68 = serializableList60.pollFirst();
        boolean boolean69 = serializableList16.retainAll((java.util.Collection<java.io.Serializable>) serializableList60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + (byte) 0 + "'", serializable50, (byte) 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + serializable59 + "' != '" + (byte) 0 + "'", serializable59, (byte) 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + serializable68 + "' != '" + (byte) 1 + "'", serializable68, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.pollFirst();
        java.io.Serializable serializable9 = serializableList0.peekLast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.pollFirst();
        java.io.Serializable serializable9 = serializableList0.pollFirst();
        boolean boolean11 = serializableList0.removeLastOccurrence((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean7 = serializableList0.offer((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable8 = serializableList0.pollFirst();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList0.parallelStream();
        java.util.LinkedList<java.io.Serializable> serializableList11 = new java.util.LinkedList<java.io.Serializable>();
        int int13 = serializableList11.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray14 = serializableList11.toArray();
        boolean boolean16 = serializableList11.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList17 = new java.util.LinkedList<java.io.Serializable>();
        int int19 = serializableList17.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList46 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.lang.Object[] objArray48 = serializableList46.toArray();
        boolean boolean49 = serializableList17.addAll((java.util.Collection<java.io.Serializable>) serializableList46);
        boolean boolean50 = serializableList11.add((java.io.Serializable) serializableList17);
        java.io.Serializable serializable51 = serializableList17.peekLast();
        java.util.LinkedList<java.io.Serializable> serializableList52 = new java.util.LinkedList<java.io.Serializable>();
        int int54 = serializableList52.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray55 = serializableList52.toArray();
        boolean boolean57 = serializableList52.removeLastOccurrence((java.lang.Object) '#');
        boolean boolean58 = serializableList17.containsAll((java.util.Collection<java.io.Serializable>) serializableList52);
        boolean boolean60 = serializableList52.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable61 = serializableList0.set((int) (byte) 100, (java.io.Serializable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) 0 + "'", serializable51, (byte) 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean7 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList6);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator8 = serializableList0.spliterator();
        java.io.Serializable serializable9 = serializableList0.pollFirst();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator8);
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.util.LinkedList<java.io.Serializable> serializableList0 = new java.util.LinkedList<java.io.Serializable>();
        int int2 = serializableList0.lastIndexOf((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = serializableList0.toArray();
        boolean boolean5 = serializableList0.removeLastOccurrence((java.lang.Object) '#');
        java.util.LinkedList<java.io.Serializable> serializableList6 = new java.util.LinkedList<java.io.Serializable>();
        int int8 = serializableList6.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList35 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList35, serializableArray34);
        java.lang.Object[] objArray37 = serializableList35.toArray();
        boolean boolean38 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList35);
        boolean boolean39 = serializableList0.add((java.io.Serializable) serializableList6);
        java.io.Serializable serializable40 = serializableList6.element();
        java.util.LinkedList<java.io.Serializable> serializableList41 = new java.util.LinkedList<java.io.Serializable>();
        int int43 = serializableList41.lastIndexOf((java.lang.Object) ' ');
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.LinkedList<java.io.Serializable> serializableList70 = new java.util.LinkedList<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList70, serializableArray69);
        java.lang.Object[] objArray72 = serializableList70.toArray();
        boolean boolean73 = serializableList41.addAll((java.util.Collection<java.io.Serializable>) serializableList70);
        boolean boolean74 = serializableList6.addAll((java.util.Collection<java.io.Serializable>) serializableList41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + (byte) 0 + "'", serializable40, (byte) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }
}

