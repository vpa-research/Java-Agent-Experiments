package org.huawei.linkedhashmap;

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
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, 100.0f, false);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap5 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean6 = strComparableMap5.isEmpty();
        java.lang.Object obj7 = strComparableMap5.clone();
        java.lang.CharSequence charSequence9 = strComparableMap5.remove((java.lang.Object) true);
        java.lang.CharSequence charSequence11 = strComparableMap5.get((java.lang.Object) 100L);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap14 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean18 = strComparableMap14.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence21 = strComparableMap14.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        int int22 = strComparableMap14.size();
        boolean boolean26 = strComparableMap14.replace((java.lang.Comparable<java.lang.String>) "{}", (java.lang.CharSequence) "{null=, =}", (java.lang.CharSequence) "{null=, =}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap28 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean29 = strComparableMap28.isEmpty();
        java.lang.Object obj30 = strComparableMap28.clone();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap32 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap34 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean35 = strComparableMap34.isEmpty();
        strComparableMap32.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap34);
        strComparableMap28.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap34);
        java.lang.CharSequence charSequence38 = strComparableMap14.get((java.lang.Object) strComparableMap34);
        boolean boolean39 = strComparableMap5.equals((java.lang.Object) strComparableMap34);
        strComparableMap3.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{}");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(charSequence38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 0, (float) 100L, true);
        java.lang.CharSequence charSequence6 = strComparableMap3.put((java.lang.Comparable<java.lang.String>) "{null=}", (java.lang.CharSequence) "{{null=, =}={}}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap8 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean9 = strComparableMap8.isEmpty();
        java.lang.CharSequence charSequence11 = strComparableMap8.get((java.lang.Object) (byte) 1);
        boolean boolean15 = strComparableMap8.replace((java.lang.Comparable<java.lang.String>) "{{}={null=, =, hi!=hi!}}", (java.lang.CharSequence) "{null=, =}", (java.lang.CharSequence) "{null=, =, hi!=hi!}");
        java.lang.CharSequence charSequence17 = strComparableMap3.getOrDefault((java.lang.Object) boolean15, (java.lang.CharSequence) "{{null=, =}={}}");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "{{null=, =}={}}" + "'", charSequence17, "{{null=, =}={}}");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        boolean boolean6 = strComparableMap1.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap8 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean9 = strComparableMap8.isEmpty();
        java.lang.Object obj10 = strComparableMap8.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection11 = strComparableMap8.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap13 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.CharSequence charSequence16 = strComparableMap13.putIfAbsent(strComparable14, (java.lang.CharSequence) "");
        boolean boolean18 = strComparableMap13.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap20 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.CharSequence charSequence23 = strComparableMap20.putIfAbsent(strComparable21, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence25 = strComparableMap20.get((java.lang.Object) true);
        int int26 = strComparableMap20.size();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection27 = strComparableMap20.values();
        boolean boolean28 = strComparableMap13.containsValue((java.lang.Object) strComparableMap20);
        boolean boolean29 = strComparableMap8.equals((java.lang.Object) strComparableMap20);
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap8);
        boolean boolean31 = strComparableMap8.isEmpty();
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet32 = strComparableMap8.entrySet();
        java.lang.Object obj33 = strComparableMap8.clone();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap35 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.CharSequence charSequence38 = strComparableMap35.putIfAbsent(strComparable36, (java.lang.CharSequence) "");
        boolean boolean40 = strComparableMap35.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap44 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) 'a', true);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap47 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean51 = strComparableMap47.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence54 = strComparableMap47.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap56 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap58 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable59 = null;
        java.lang.CharSequence charSequence61 = strComparableMap58.putIfAbsent(strComparable59, (java.lang.CharSequence) "");
        boolean boolean63 = strComparableMap58.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence66 = strComparableMap58.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap68 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean69 = strComparableMap68.isEmpty();
        java.lang.Object obj70 = strComparableMap68.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection71 = strComparableMap68.values();
        strComparableMap58.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap68);
        java.lang.String str73 = strComparableMap58.toString();
        boolean boolean74 = strComparableMap47.remove((java.lang.Object) strComparableMap56, (java.lang.Object) str73);
        boolean boolean75 = strComparableMap44.equals((java.lang.Object) strComparableMap56);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap77 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable78 = null;
        java.lang.CharSequence charSequence80 = strComparableMap77.putIfAbsent(strComparable78, (java.lang.CharSequence) "");
        boolean boolean82 = strComparableMap77.containsValue((java.lang.Object) (short) 100);
        int int83 = strComparableMap77.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap84 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence86 = strComparableMap77.getOrDefault((java.lang.Object) strComparableMap84, (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap88 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean89 = strComparableMap88.isEmpty();
        java.lang.Object obj90 = strComparableMap88.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection91 = strComparableMap88.values();
        boolean boolean92 = strComparableMap56.remove((java.lang.Object) strComparableMap84, (java.lang.Object) strComparableMap88);
        strComparableMap56.clear();
        boolean boolean94 = strComparableMap35.equals((java.lang.Object) strComparableMap56);
        boolean boolean95 = strComparableMap8.equals((java.lang.Object) strComparableMap35);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet96 = strComparableMap8.keySet();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(charSequenceCollection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{}");
        org.junit.Assert.assertNull(charSequence38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(charSequence61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(charSequence66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "{null=, =}" + "'", str73, "{null=, =}");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(charSequence80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertEquals("'" + charSequence86 + "' != '" + "" + "'", charSequence86, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strComparableSet96);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap2 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean6 = strComparableMap2.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strComparableMap2.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet10 = strComparableMap2.keySet();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap14 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 10, (float) 1L, false);
        strComparableMap2.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap14);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap19 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(10, (float) 2, false);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet20 = strComparableMap19.keySet();
        boolean boolean21 = strComparableMap14.containsKey((java.lang.Object) strComparableMap19);
        java.lang.CharSequence charSequence24 = strComparableMap19.put((java.lang.Comparable<java.lang.String>) "{null=, {null=, =}={null=}}", (java.lang.CharSequence) "{={null=, =, hi!=hi!}}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(strComparableSet10);
        org.junit.Assert.assertNotNull(strComparableSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(charSequence24);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean2 = strComparableMap1.isEmpty();
        java.lang.Object obj3 = strComparableMap1.clone();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap5 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap7 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean8 = strComparableMap7.isEmpty();
        strComparableMap5.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap7);
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap7);
        java.lang.String str11 = strComparableMap7.toString();
        java.lang.CharSequence charSequence14 = strComparableMap7.putIfAbsent((java.lang.Comparable<java.lang.String>) "{}", (java.lang.CharSequence) "{null=}");
        boolean boolean18 = strComparableMap7.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "{null=, =}", (java.lang.CharSequence) "{null=}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap20 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.CharSequence charSequence23 = strComparableMap20.putIfAbsent(strComparable21, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence25 = strComparableMap20.get((java.lang.Object) true);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet26 = strComparableMap20.entrySet();
        java.lang.CharSequence charSequence29 = strComparableMap20.put((java.lang.Comparable<java.lang.String>) "{}", (java.lang.CharSequence) "");
        boolean boolean30 = strComparableMap20.isEmpty();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap33 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean37 = strComparableMap33.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence40 = strComparableMap33.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet41 = strComparableMap33.keySet();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap45 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 10, (float) 1L, false);
        strComparableMap33.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap45);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap49 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean53 = strComparableMap49.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap54 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap49);
        strComparableMap33.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap54);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap57 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        int int58 = strComparableMap57.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap62 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) '4', false);
        strComparableMap57.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap62);
        java.lang.Comparable<java.lang.String> strComparable64 = null;
        boolean boolean67 = strComparableMap62.replace(strComparable64, (java.lang.CharSequence) "", (java.lang.CharSequence) "{null=, =}");
        boolean boolean68 = strComparableMap20.remove((java.lang.Object) strComparableMap54, (java.lang.Object) strComparable64);
        boolean boolean69 = strComparableMap7.containsKey((java.lang.Object) strComparableMap20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNotNull(strComparableEntrySet26);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(charSequence40);
        org.junit.Assert.assertNotNull(strComparableSet41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strComparableMap1.get((java.lang.Object) true);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet7 = strComparableMap1.entrySet();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap9 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        java.lang.CharSequence charSequence12 = strComparableMap9.putIfAbsent(strComparable10, (java.lang.CharSequence) "");
        boolean boolean14 = strComparableMap9.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap16 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean17 = strComparableMap16.isEmpty();
        java.lang.Object obj18 = strComparableMap16.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection19 = strComparableMap16.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap21 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.CharSequence charSequence24 = strComparableMap21.putIfAbsent(strComparable22, (java.lang.CharSequence) "");
        boolean boolean26 = strComparableMap21.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap28 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.CharSequence charSequence31 = strComparableMap28.putIfAbsent(strComparable29, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence33 = strComparableMap28.get((java.lang.Object) true);
        int int34 = strComparableMap28.size();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection35 = strComparableMap28.values();
        boolean boolean36 = strComparableMap21.containsValue((java.lang.Object) strComparableMap28);
        boolean boolean37 = strComparableMap16.equals((java.lang.Object) strComparableMap28);
        strComparableMap9.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap16);
        boolean boolean39 = strComparableMap16.isEmpty();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap41 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap43 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean44 = strComparableMap43.isEmpty();
        strComparableMap41.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap43);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet46 = strComparableMap43.entrySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection47 = strComparableMap43.values();
        boolean boolean48 = strComparableMap16.containsValue((java.lang.Object) charSequenceCollection47);
        java.lang.Class<?> wildcardClass49 = charSequenceCollection47.getClass();
        java.lang.CharSequence charSequence51 = strComparableMap1.getOrDefault((java.lang.Object) charSequenceCollection47, (java.lang.CharSequence) "");
        strComparableMap1.clear();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap55 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 10, (float) 10L);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet56 = strComparableMap55.entrySet();
        java.lang.Object obj57 = null;
        boolean boolean58 = strComparableMap1.remove((java.lang.Object) strComparableEntrySet56, obj57);
        java.lang.Class<?> wildcardClass59 = strComparableMap1.getClass();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(strComparableEntrySet7);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection19);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertNull(charSequence33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(charSequenceCollection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet46);
        org.junit.Assert.assertNotNull(charSequenceCollection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + charSequence51 + "' != '" + "" + "'", charSequence51, "");
        org.junit.Assert.assertNotNull(strComparableEntrySet56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean4 = strComparableMap3.isEmpty();
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap3);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet6 = strComparableMap3.entrySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection7 = strComparableMap3.values();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = strComparableMap3.keySet();
        boolean boolean9 = strComparableMap3.isEmpty();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection10 = strComparableMap3.values();
        boolean boolean11 = strComparableMap3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet6);
        org.junit.Assert.assertNotNull(charSequenceCollection7);
        org.junit.Assert.assertNotNull(strComparableSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charSequenceCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        boolean boolean6 = strComparableMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence9 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strComparableMap1.getOrDefault((java.lang.Object) (-1.0f), (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=, =}", (java.lang.CharSequence) "{null=}");
        boolean boolean19 = strComparableMap1.isEmpty();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection20 = strComparableMap1.values();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charSequenceCollection20);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap2 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean6 = strComparableMap2.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strComparableMap2.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str10 = strComparableMap2.toString();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap12 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        java.lang.CharSequence charSequence15 = strComparableMap12.putIfAbsent(strComparable13, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strComparableMap12.get((java.lang.Object) true);
        java.lang.Object obj18 = strComparableMap12.clone();
        java.lang.CharSequence charSequence21 = strComparableMap12.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        strComparableMap2.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap12);
        java.lang.CharSequence charSequence25 = strComparableMap12.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=, {null=}={}}", (java.lang.CharSequence) "{null=, {null=}={}}");
        java.lang.Object obj26 = strComparableMap12.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{null=}");
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{null=, =, {null=, {null=}={}}={null=, {null=}={}}}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{null=, =, {null=, {null=}={}}={null=, {null=}={}}}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{null=, =, {null=, {null=}={}}={null=, {null=}={}}}");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap5 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean6 = strComparableMap5.isEmpty();
        strComparableMap3.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap5);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet8 = strComparableMap5.entrySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection9 = strComparableMap5.values();
        boolean boolean10 = strComparableMap1.containsKey((java.lang.Object) strComparableMap5);
        strComparableMap1.clear();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet8);
        org.junit.Assert.assertNotNull(charSequenceCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap2 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '#', (float) (short) 10);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection3 = strComparableMap2.values();
        java.lang.Object obj4 = null;
        java.lang.CharSequence charSequence6 = strComparableMap2.getOrDefault(obj4, (java.lang.CharSequence) "{null=, =, hi!=hi!}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap8 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.CharSequence charSequence11 = strComparableMap8.putIfAbsent(strComparable9, (java.lang.CharSequence) "");
        boolean boolean13 = strComparableMap8.containsValue((java.lang.Object) (short) 100);
        int int14 = strComparableMap8.size();
        boolean boolean15 = strComparableMap8.isEmpty();
        java.lang.CharSequence charSequence18 = strComparableMap8.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=, =}", (java.lang.CharSequence) "{null=}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap20 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.CharSequence charSequence23 = strComparableMap20.putIfAbsent(strComparable21, (java.lang.CharSequence) "");
        boolean boolean25 = strComparableMap20.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence28 = strComparableMap20.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence31 = strComparableMap20.getOrDefault((java.lang.Object) (-1.0f), (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap33 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        int int34 = strComparableMap33.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap38 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) '4', false);
        strComparableMap33.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap38);
        int int40 = strComparableMap38.size();
        strComparableMap20.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap38);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap42 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap20);
        java.lang.CharSequence charSequence45 = strComparableMap42.put((java.lang.Comparable<java.lang.String>) "{{}={null=, =, hi!=hi!}}", (java.lang.CharSequence) "{}");
        strComparableMap8.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap42);
        java.util.LinkedHashMap<java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>, java.util.Collection<java.lang.CharSequence>> comparableEntrySetMap47 = new java.util.LinkedHashMap<java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>, java.util.Collection<java.lang.CharSequence>>();
        boolean boolean48 = strComparableMap2.remove((java.lang.Object) strComparableMap42, (java.lang.Object) comparableEntrySetMap47);
        org.junit.Assert.assertNotNull(charSequenceCollection3);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "{null=, =, hi!=hi!}" + "'", charSequence6, "{null=, =, hi!=hi!}");
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(charSequence28);
        org.junit.Assert.assertEquals("'" + charSequence31 + "' != '" + "hi!" + "'", charSequence31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(charSequence45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.LinkedHashMap<java.lang.Cloneable, java.lang.reflect.Type> cloneableMap1 = new java.util.LinkedHashMap<java.lang.Cloneable, java.lang.reflect.Type>((int) (short) 10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strComparableMap1.get((java.lang.Object) true);
        java.lang.Object obj7 = strComparableMap1.clone();
        java.lang.String str8 = strComparableMap1.toString();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap10 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap12 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean13 = strComparableMap12.isEmpty();
        strComparableMap10.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap12);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap16 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.CharSequence charSequence19 = strComparableMap16.putIfAbsent(strComparable17, (java.lang.CharSequence) "");
        boolean boolean21 = strComparableMap16.containsValue((java.lang.Object) (short) 100);
        int int22 = strComparableMap16.size();
        java.lang.CharSequence charSequence24 = strComparableMap10.getOrDefault((java.lang.Object) strComparableMap16, (java.lang.CharSequence) "hi!");
        boolean boolean25 = strComparableMap1.equals((java.lang.Object) charSequence24);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap26 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap1);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap28 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.CharSequence charSequence31 = strComparableMap28.putIfAbsent(strComparable29, (java.lang.CharSequence) "");
        boolean boolean33 = strComparableMap28.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap35 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean36 = strComparableMap35.isEmpty();
        java.lang.Object obj37 = strComparableMap35.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection38 = strComparableMap35.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap40 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable41 = null;
        java.lang.CharSequence charSequence43 = strComparableMap40.putIfAbsent(strComparable41, (java.lang.CharSequence) "");
        boolean boolean45 = strComparableMap40.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap47 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable48 = null;
        java.lang.CharSequence charSequence50 = strComparableMap47.putIfAbsent(strComparable48, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence52 = strComparableMap47.get((java.lang.Object) true);
        int int53 = strComparableMap47.size();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection54 = strComparableMap47.values();
        boolean boolean55 = strComparableMap40.containsValue((java.lang.Object) strComparableMap47);
        boolean boolean56 = strComparableMap35.equals((java.lang.Object) strComparableMap47);
        strComparableMap28.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap35);
        boolean boolean58 = strComparableMap35.isEmpty();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap59 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap35);
        boolean boolean60 = strComparableMap26.equals((java.lang.Object) strComparableMap59);
        java.lang.CharSequence charSequence63 = strComparableMap59.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=, =, {null=, =}={null=}}", (java.lang.CharSequence) "{null=, =, {null=, =}={null=}}");
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{null=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{null=}" + "'", str8, "{null=}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + charSequence24 + "' != '" + "hi!" + "'", charSequence24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection38);
        org.junit.Assert.assertNull(charSequence43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(charSequence50);
        org.junit.Assert.assertNull(charSequence52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(charSequenceCollection54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(charSequence63);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.LinkedHashMap<java.lang.reflect.AnnotatedElement, java.util.Collection<java.lang.CharSequence>> annotatedElementMap3 = new java.util.LinkedHashMap<java.lang.reflect.AnnotatedElement, java.util.Collection<java.lang.CharSequence>>((int) (short) 0, (float) 10, false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean4 = strComparableMap3.isEmpty();
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap3);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap7 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        java.lang.CharSequence charSequence10 = strComparableMap7.putIfAbsent(strComparable8, (java.lang.CharSequence) "");
        boolean boolean12 = strComparableMap7.containsValue((java.lang.Object) (short) 100);
        int int13 = strComparableMap7.size();
        java.lang.CharSequence charSequence15 = strComparableMap1.getOrDefault((java.lang.Object) strComparableMap7, (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap17 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.CharSequence charSequence20 = strComparableMap17.putIfAbsent(strComparable18, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = strComparableMap17.get((java.lang.Object) true);
        java.lang.Object obj23 = strComparableMap17.clone();
        java.lang.CharSequence charSequence26 = strComparableMap17.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.Object obj27 = null;
        java.lang.CharSequence charSequence28 = strComparableMap17.get(obj27);
        strComparableMap17.clear();
        boolean boolean30 = strComparableMap7.containsKey((java.lang.Object) strComparableMap17);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection31 = strComparableMap17.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap32 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap17);
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        boolean boolean36 = strComparableMap32.replace(strComparable33, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "{null=, {null=}={}}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{null=}");
        org.junit.Assert.assertNull(charSequence26);
        org.junit.Assert.assertEquals("'" + charSequence28 + "' != '" + "" + "'", charSequence28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charSequenceCollection31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strComparableMap1.get((java.lang.Object) true);
        java.lang.Object obj7 = strComparableMap1.clone();
        java.lang.CharSequence charSequence10 = strComparableMap1.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.Object obj11 = null;
        java.lang.CharSequence charSequence12 = strComparableMap1.get(obj11);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap14 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap16 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean17 = strComparableMap16.isEmpty();
        strComparableMap14.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap16);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet19 = strComparableMap16.entrySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection20 = strComparableMap16.values();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet21 = strComparableMap16.keySet();
        boolean boolean22 = strComparableMap1.equals((java.lang.Object) strComparableMap16);
        java.lang.String str23 = strComparableMap1.toString();
        java.lang.CharSequence charSequence26 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "{null=, =}", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap28 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.CharSequence charSequence31 = strComparableMap28.putIfAbsent(strComparable29, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence33 = strComparableMap28.get((java.lang.Object) true);
        java.lang.Object obj34 = strComparableMap28.clone();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap36 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        java.lang.CharSequence charSequence39 = strComparableMap36.putIfAbsent(strComparable37, (java.lang.CharSequence) "");
        boolean boolean41 = strComparableMap36.containsValue((java.lang.Object) (short) 100);
        int int42 = strComparableMap36.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap43 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence45 = strComparableMap36.getOrDefault((java.lang.Object) strComparableMap43, (java.lang.CharSequence) "");
        java.lang.String str46 = strComparableMap36.toString();
        boolean boolean47 = strComparableMap1.remove(obj34, (java.lang.Object) str46);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap48 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap1);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap50 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable51 = null;
        java.lang.CharSequence charSequence53 = strComparableMap50.putIfAbsent(strComparable51, (java.lang.CharSequence) "");
        boolean boolean55 = strComparableMap50.containsValue((java.lang.Object) (short) 100);
        int int56 = strComparableMap50.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap57 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence59 = strComparableMap50.getOrDefault((java.lang.Object) strComparableMap57, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence61 = strComparableMap1.getOrDefault((java.lang.Object) "", (java.lang.CharSequence) "{{}={null=, =, hi!=hi!}}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap63 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable64 = null;
        java.lang.CharSequence charSequence66 = strComparableMap63.putIfAbsent(strComparable64, (java.lang.CharSequence) "");
        boolean boolean68 = strComparableMap63.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence71 = strComparableMap63.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence74 = strComparableMap63.getOrDefault((java.lang.Object) (-1.0f), (java.lang.CharSequence) "hi!");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection75 = strComparableMap63.values();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet76 = strComparableMap63.keySet();
        boolean boolean77 = strComparableMap1.equals((java.lang.Object) strComparableSet76);
        int int78 = strComparableMap1.size();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{null=}");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet19);
        org.junit.Assert.assertNotNull(charSequenceCollection20);
        org.junit.Assert.assertNotNull(strComparableSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{null=, =}" + "'", str23, "{null=, =}");
        org.junit.Assert.assertNull(charSequence26);
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertNull(charSequence33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "{null=}");
        org.junit.Assert.assertNull(charSequence39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + charSequence45 + "' != '" + "" + "'", charSequence45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{null=}" + "'", str46, "{null=}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(charSequence53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + charSequence59 + "' != '" + "" + "'", charSequence59, "");
        org.junit.Assert.assertEquals("'" + charSequence61 + "' != '" + "" + "'", charSequence61, "");
        org.junit.Assert.assertNull(charSequence66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(charSequence71);
        org.junit.Assert.assertEquals("'" + charSequence74 + "' != '" + "hi!" + "'", charSequence74, "hi!");
        org.junit.Assert.assertNotNull(charSequenceCollection75);
        org.junit.Assert.assertNotNull(strComparableSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        boolean boolean6 = strComparableMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence9 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap11 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean12 = strComparableMap11.isEmpty();
        java.lang.Object obj13 = strComparableMap11.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection14 = strComparableMap11.values();
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap11);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap18 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean22 = strComparableMap18.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence25 = strComparableMap18.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        int int26 = strComparableMap18.size();
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap18);
        java.lang.String str28 = strComparableMap18.toString();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap31 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '#', (float) (short) 10);
        java.lang.CharSequence charSequence34 = strComparableMap31.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=, =}", (java.lang.CharSequence) "{}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap36 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        java.lang.CharSequence charSequence39 = strComparableMap36.putIfAbsent(strComparable37, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence41 = strComparableMap36.get((java.lang.Object) true);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet42 = strComparableMap36.entrySet();
        boolean boolean43 = strComparableMap18.remove((java.lang.Object) strComparableMap31, (java.lang.Object) strComparableEntrySet42);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNull(charSequence34);
        org.junit.Assert.assertNull(charSequence39);
        org.junit.Assert.assertNull(charSequence41);
        org.junit.Assert.assertNotNull(strComparableEntrySet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strComparableMap1.get((java.lang.Object) true);
        int int7 = strComparableMap1.size();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = strComparableMap1.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet9 = strComparableMap1.entrySet();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSet8);
        org.junit.Assert.assertNotNull(strComparableEntrySet9);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) 0);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.CharSequence charSequence6 = strComparableMap3.putIfAbsent(strComparable4, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = strComparableMap3.get((java.lang.Object) true);
        int int9 = strComparableMap3.size();
        java.lang.CharSequence charSequence11 = strComparableMap3.get((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence14 = strComparableMap3.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.String str15 = strComparableMap3.toString();
        java.lang.CharSequence charSequence18 = strComparableMap3.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=}", (java.lang.CharSequence) "{null=, =, hi!=hi!}");
        java.lang.CharSequence charSequence19 = strComparableMap1.remove((java.lang.Object) strComparableMap3);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap21 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.CharSequence charSequence24 = strComparableMap21.putIfAbsent(strComparable22, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence26 = strComparableMap21.get((java.lang.Object) true);
        int int27 = strComparableMap21.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap31 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) 'a', true);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap34 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean38 = strComparableMap34.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence41 = strComparableMap34.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap43 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap45 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable46 = null;
        java.lang.CharSequence charSequence48 = strComparableMap45.putIfAbsent(strComparable46, (java.lang.CharSequence) "");
        boolean boolean50 = strComparableMap45.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence53 = strComparableMap45.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap55 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean56 = strComparableMap55.isEmpty();
        java.lang.Object obj57 = strComparableMap55.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection58 = strComparableMap55.values();
        strComparableMap45.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap55);
        java.lang.String str60 = strComparableMap45.toString();
        boolean boolean61 = strComparableMap34.remove((java.lang.Object) strComparableMap43, (java.lang.Object) str60);
        boolean boolean62 = strComparableMap31.equals((java.lang.Object) strComparableMap43);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap64 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable65 = null;
        java.lang.CharSequence charSequence67 = strComparableMap64.putIfAbsent(strComparable65, (java.lang.CharSequence) "");
        boolean boolean69 = strComparableMap64.containsValue((java.lang.Object) (short) 100);
        int int70 = strComparableMap64.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap71 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence73 = strComparableMap64.getOrDefault((java.lang.Object) strComparableMap71, (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap75 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean76 = strComparableMap75.isEmpty();
        java.lang.Object obj77 = strComparableMap75.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection78 = strComparableMap75.values();
        boolean boolean79 = strComparableMap43.remove((java.lang.Object) strComparableMap71, (java.lang.Object) strComparableMap75);
        java.lang.CharSequence charSequence81 = strComparableMap21.getOrDefault((java.lang.Object) strComparableMap75, (java.lang.CharSequence) "hi!");
        java.lang.Object obj82 = strComparableMap75.clone();
        java.lang.CharSequence charSequence83 = strComparableMap3.get((java.lang.Object) strComparableMap75);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{null=, =}" + "'", str15, "{null=, =}");
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(charSequence26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(charSequence41);
        org.junit.Assert.assertNull(charSequence48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(charSequence53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "{null=, =}" + "'", str60, "{null=, =}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(charSequence67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + charSequence73 + "' != '" + "" + "'", charSequence73, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + charSequence81 + "' != '" + "hi!" + "'", charSequence81, "hi!");
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertEquals(obj82.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj82), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj82), "{}");
        org.junit.Assert.assertNull(charSequence83);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        boolean boolean6 = strComparableMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence9 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strComparableMap1.getOrDefault((java.lang.Object) (-1.0f), (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        int int16 = strComparableMap1.size();
        java.lang.CharSequence charSequence19 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "{null=, =, {null=, =}={null=}}", (java.lang.CharSequence) "{null=, =, hi!=hi!}");
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.LinkedHashMap<java.lang.Object, java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>> objMap3 = new java.util.LinkedHashMap<java.lang.Object, java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>>((int) (short) 1, (float) (byte) 100, false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        boolean boolean6 = strComparableMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence9 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap11 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean12 = strComparableMap11.isEmpty();
        java.lang.Object obj13 = strComparableMap11.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection14 = strComparableMap11.values();
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap11);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap16 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap1);
        boolean boolean17 = strComparableMap1.isEmpty();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap20 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean24 = strComparableMap20.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence27 = strComparableMap20.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet28 = strComparableMap20.keySet();
        java.lang.CharSequence charSequence31 = strComparableMap20.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence34 = strComparableMap20.putIfAbsent((java.lang.Comparable<java.lang.String>) "{}", (java.lang.CharSequence) "");
        java.lang.Object obj35 = null;
        boolean boolean36 = strComparableMap20.containsValue(obj35);
        java.lang.CharSequence charSequence38 = strComparableMap1.getOrDefault(obj35, (java.lang.CharSequence) "{{null=, =}={}}");
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNotNull(strComparableSet28);
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertNull(charSequence34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + charSequence38 + "' != '" + "" + "'", charSequence38, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) ' ', (float) 10, true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean2 = strComparableMap1.isEmpty();
        java.lang.Object obj3 = strComparableMap1.clone();
        java.lang.CharSequence charSequence5 = strComparableMap1.remove((java.lang.Object) true);
        java.lang.CharSequence charSequence7 = strComparableMap1.get((java.lang.Object) 100L);
        strComparableMap1.clear();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap10 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        java.lang.CharSequence charSequence13 = strComparableMap10.putIfAbsent(strComparable11, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strComparableMap10.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap18 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.CharSequence charSequence21 = strComparableMap18.putIfAbsent(strComparable19, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence23 = strComparableMap18.get((java.lang.Object) true);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet24 = strComparableMap18.entrySet();
        strComparableMap10.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap18);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap27 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.CharSequence charSequence30 = strComparableMap27.putIfAbsent(strComparable28, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence32 = strComparableMap27.get((java.lang.Object) true);
        int int33 = strComparableMap27.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap35 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.CharSequence charSequence38 = strComparableMap35.putIfAbsent(strComparable36, (java.lang.CharSequence) "");
        boolean boolean40 = strComparableMap35.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence43 = strComparableMap35.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap45 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap47 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable48 = null;
        java.lang.CharSequence charSequence50 = strComparableMap47.putIfAbsent(strComparable48, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence53 = strComparableMap47.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        boolean boolean54 = strComparableMap35.remove((java.lang.Object) strComparableMap45, (java.lang.Object) "hi!");
        strComparableMap27.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap45);
        boolean boolean56 = strComparableMap45.isEmpty();
        strComparableMap10.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap45);
        boolean boolean58 = strComparableMap1.containsValue((java.lang.Object) strComparableMap45);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap60 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable61 = null;
        java.lang.CharSequence charSequence63 = strComparableMap60.putIfAbsent(strComparable61, (java.lang.CharSequence) "");
        boolean boolean65 = strComparableMap60.containsValue((java.lang.Object) (short) 100);
        int int66 = strComparableMap60.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap67 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence69 = strComparableMap60.getOrDefault((java.lang.Object) strComparableMap67, (java.lang.CharSequence) "");
        java.lang.String str70 = strComparableMap60.toString();
        java.lang.Object obj71 = strComparableMap60.clone();
        strComparableMap45.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap60);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet73 = strComparableMap45.keySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNotNull(strComparableEntrySet24);
        org.junit.Assert.assertNull(charSequence30);
        org.junit.Assert.assertNull(charSequence32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(charSequence38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(charSequence43);
        org.junit.Assert.assertNull(charSequence50);
        org.junit.Assert.assertNull(charSequence53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(charSequence63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + charSequence69 + "' != '" + "" + "'", charSequence69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "{null=}" + "'", str70, "{null=}");
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "{null=}");
        org.junit.Assert.assertNotNull(strComparableSet73);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strComparableMap1.get((java.lang.Object) true);
        int int7 = strComparableMap1.size();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection8 = strComparableMap1.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap10 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        java.lang.CharSequence charSequence13 = strComparableMap10.putIfAbsent(strComparable11, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strComparableMap10.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap18 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.CharSequence charSequence21 = strComparableMap18.putIfAbsent(strComparable19, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence23 = strComparableMap18.get((java.lang.Object) true);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet24 = strComparableMap18.entrySet();
        strComparableMap10.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap18);
        java.lang.CharSequence charSequence27 = strComparableMap1.getOrDefault((java.lang.Object) strComparableMap18, (java.lang.CharSequence) "{null=, =}");
        java.lang.CharSequence charSequence30 = strComparableMap1.put((java.lang.Comparable<java.lang.String>) "{{}={null=, =, hi!=hi!}}", (java.lang.CharSequence) "{null=, hi!=hi!}");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap32 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence35 = strComparableMap32.putIfAbsent((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap39 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) 'a', true);
        strComparableMap32.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap39);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap44 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) 'a', true);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap47 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean51 = strComparableMap47.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence54 = strComparableMap47.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap56 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap58 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable59 = null;
        java.lang.CharSequence charSequence61 = strComparableMap58.putIfAbsent(strComparable59, (java.lang.CharSequence) "");
        boolean boolean63 = strComparableMap58.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence66 = strComparableMap58.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap68 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean69 = strComparableMap68.isEmpty();
        java.lang.Object obj70 = strComparableMap68.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection71 = strComparableMap68.values();
        strComparableMap58.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap68);
        java.lang.String str73 = strComparableMap58.toString();
        boolean boolean74 = strComparableMap47.remove((java.lang.Object) strComparableMap56, (java.lang.Object) str73);
        boolean boolean75 = strComparableMap44.equals((java.lang.Object) strComparableMap56);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap77 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable78 = null;
        java.lang.CharSequence charSequence80 = strComparableMap77.putIfAbsent(strComparable78, (java.lang.CharSequence) "");
        boolean boolean82 = strComparableMap77.containsValue((java.lang.Object) (short) 100);
        int int83 = strComparableMap77.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap84 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence86 = strComparableMap77.getOrDefault((java.lang.Object) strComparableMap84, (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap88 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean89 = strComparableMap88.isEmpty();
        java.lang.Object obj90 = strComparableMap88.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection91 = strComparableMap88.values();
        boolean boolean92 = strComparableMap56.remove((java.lang.Object) strComparableMap84, (java.lang.Object) strComparableMap88);
        boolean boolean93 = strComparableMap32.equals((java.lang.Object) strComparableMap88);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap95 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) 10);
        boolean boolean96 = strComparableMap32.containsValue((java.lang.Object) strComparableMap95);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap97 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap32);
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap32);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet99 = strComparableMap32.entrySet();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(charSequenceCollection8);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNotNull(strComparableEntrySet24);
        org.junit.Assert.assertEquals("'" + charSequence27 + "' != '" + "{null=, =}" + "'", charSequence27, "{null=, =}");
        org.junit.Assert.assertNull(charSequence30);
        org.junit.Assert.assertNull(charSequence35);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(charSequence61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(charSequence66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "{null=, =}" + "'", str73, "{null=, =}");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(charSequence80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertEquals("'" + charSequence86 + "' != '" + "" + "'", charSequence86, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(strComparableEntrySet99);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap8 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) 'a', true);
        strComparableMap1.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap8);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap13 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0, (float) 'a', true);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap16 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1, (float) '#');
        boolean boolean20 = strComparableMap16.replace((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence23 = strComparableMap16.replace((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap25 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap27 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.CharSequence charSequence30 = strComparableMap27.putIfAbsent(strComparable28, (java.lang.CharSequence) "");
        boolean boolean32 = strComparableMap27.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence35 = strComparableMap27.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap37 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean38 = strComparableMap37.isEmpty();
        java.lang.Object obj39 = strComparableMap37.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection40 = strComparableMap37.values();
        strComparableMap27.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap37);
        java.lang.String str42 = strComparableMap27.toString();
        boolean boolean43 = strComparableMap16.remove((java.lang.Object) strComparableMap25, (java.lang.Object) str42);
        boolean boolean44 = strComparableMap13.equals((java.lang.Object) strComparableMap25);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap46 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable47 = null;
        java.lang.CharSequence charSequence49 = strComparableMap46.putIfAbsent(strComparable47, (java.lang.CharSequence) "");
        boolean boolean51 = strComparableMap46.containsValue((java.lang.Object) (short) 100);
        int int52 = strComparableMap46.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap53 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.CharSequence charSequence55 = strComparableMap46.getOrDefault((java.lang.Object) strComparableMap53, (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap57 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean58 = strComparableMap57.isEmpty();
        java.lang.Object obj59 = strComparableMap57.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection60 = strComparableMap57.values();
        boolean boolean61 = strComparableMap25.remove((java.lang.Object) strComparableMap53, (java.lang.Object) strComparableMap57);
        boolean boolean62 = strComparableMap1.equals((java.lang.Object) strComparableMap57);
        java.lang.CharSequence charSequence65 = strComparableMap57.putIfAbsent((java.lang.Comparable<java.lang.String>) "{null=, =}", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap67 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable68 = null;
        java.lang.CharSequence charSequence70 = strComparableMap67.putIfAbsent(strComparable68, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence72 = strComparableMap67.get((java.lang.Object) true);
        int int73 = strComparableMap67.size();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection74 = strComparableMap67.values();
        java.lang.CharSequence charSequence75 = strComparableMap57.get((java.lang.Object) charSequenceCollection74);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(charSequence30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(charSequence35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{null=, =}" + "'", str42, "{null=, =}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(charSequence49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + charSequence55 + "' != '" + "" + "'", charSequence55, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(charSequence65);
        org.junit.Assert.assertNull(charSequence70);
        org.junit.Assert.assertNull(charSequence72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(charSequenceCollection74);
        org.junit.Assert.assertNull(charSequence75);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
        java.lang.CharSequence charSequence4 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "{null=, =, hi!=hi!}", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap6 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        java.lang.CharSequence charSequence9 = strComparableMap6.putIfAbsent(strComparable7, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strComparableMap6.get((java.lang.Object) true);
        int int12 = strComparableMap6.size();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = strComparableMap6.keySet();
        int int14 = strComparableMap6.size();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap15 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap6);
        java.lang.CharSequence charSequence16 = strComparableMap1.remove((java.lang.Object) strComparableMap6);
        java.lang.CharSequence charSequence19 = strComparableMap6.put((java.lang.Comparable<java.lang.String>) "{null=, {}={null=, =}}", (java.lang.CharSequence) "{null=, {null=, =}={null=}}");
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean2 = strComparableMap1.isEmpty();
        java.lang.Object obj3 = strComparableMap1.clone();
        java.lang.CharSequence charSequence5 = strComparableMap1.remove((java.lang.Object) true);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap7 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        java.lang.CharSequence charSequence10 = strComparableMap7.putIfAbsent(strComparable8, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strComparableMap7.get((java.lang.Object) true);
        java.lang.Object obj13 = strComparableMap7.clone();
        java.lang.CharSequence charSequence16 = strComparableMap7.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.Object obj17 = null;
        java.lang.CharSequence charSequence18 = strComparableMap7.get(obj17);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap20 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap22 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean23 = strComparableMap22.isEmpty();
        strComparableMap20.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap22);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet25 = strComparableMap22.entrySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection26 = strComparableMap22.values();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet27 = strComparableMap22.keySet();
        boolean boolean28 = strComparableMap7.equals((java.lang.Object) strComparableMap22);
        java.lang.String str29 = strComparableMap7.toString();
        boolean boolean30 = strComparableMap1.equals((java.lang.Object) strComparableMap7);
        boolean boolean34 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "{null=, =}", (java.lang.CharSequence) "{null=}", (java.lang.CharSequence) "{null=}");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet35 = strComparableMap1.keySet();
        int int36 = strComparableMap1.size();
        java.lang.Class<?> wildcardClass37 = strComparableMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{null=}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{null=}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{null=}");
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet25);
        org.junit.Assert.assertNotNull(charSequenceCollection26);
        org.junit.Assert.assertNotNull(strComparableSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{null=, =}" + "'", str29, "{null=, =}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strComparableSet35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strComparableMap1.get((java.lang.Object) true);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet7 = strComparableMap1.entrySet();
        java.lang.CharSequence charSequence10 = strComparableMap1.put((java.lang.Comparable<java.lang.String>) "{}", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strComparableMap1.replace((java.lang.Comparable<java.lang.String>) "{null=, =, hi!=hi!}", (java.lang.CharSequence) "{null=, =}");
        java.lang.Object obj14 = null;
        java.lang.CharSequence charSequence15 = strComparableMap1.get(obj14);
        boolean boolean16 = strComparableMap1.isEmpty();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(strComparableEntrySet7);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.CharSequence charSequence4 = strComparableMap1.putIfAbsent(strComparable2, (java.lang.CharSequence) "");
        boolean boolean6 = strComparableMap1.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence9 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strComparableMap1.getOrDefault((java.lang.Object) (-1.0f), (java.lang.CharSequence) "hi!");
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet13 = strComparableMap1.entrySet();
        java.lang.CharSequence charSequence16 = strComparableMap1.putIfAbsent((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap18 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.CharSequence charSequence21 = strComparableMap18.putIfAbsent(strComparable19, (java.lang.CharSequence) "");
        boolean boolean23 = strComparableMap18.containsValue((java.lang.Object) (short) 100);
        int int24 = strComparableMap18.size();
        boolean boolean25 = strComparableMap18.isEmpty();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection26 = strComparableMap18.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap28 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.CharSequence charSequence31 = strComparableMap28.putIfAbsent(strComparable29, (java.lang.CharSequence) "");
        boolean boolean33 = strComparableMap28.containsValue((java.lang.Object) (short) 100);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap35 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.CharSequence charSequence38 = strComparableMap35.putIfAbsent(strComparable36, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence40 = strComparableMap35.get((java.lang.Object) true);
        int int41 = strComparableMap35.size();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection42 = strComparableMap35.values();
        boolean boolean43 = strComparableMap28.containsValue((java.lang.Object) strComparableMap35);
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap45 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap47 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean48 = strComparableMap47.isEmpty();
        strComparableMap45.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap47);
        java.util.Set<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntrySet50 = strComparableMap47.entrySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection51 = strComparableMap47.values();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet52 = strComparableMap47.keySet();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection53 = strComparableMap47.values();
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap55 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        java.lang.Comparable<java.lang.String> strComparable56 = null;
        java.lang.CharSequence charSequence58 = strComparableMap55.putIfAbsent(strComparable56, (java.lang.CharSequence) "");
        boolean boolean60 = strComparableMap55.containsValue((java.lang.Object) (short) 100);
        java.lang.CharSequence charSequence63 = strComparableMap55.putIfAbsent((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap65 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean66 = strComparableMap65.isEmpty();
        java.lang.Object obj67 = strComparableMap65.clone();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection68 = strComparableMap65.values();
        strComparableMap55.putAll((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) strComparableMap65);
        boolean boolean70 = strComparableMap35.remove((java.lang.Object) charSequenceCollection53, (java.lang.Object) strComparableMap55);
        java.lang.CharSequence charSequence72 = strComparableMap18.getOrDefault((java.lang.Object) boolean70, (java.lang.CharSequence) "");
        java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap74 = new java.util.LinkedHashMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) '4');
        boolean boolean75 = strComparableMap74.isEmpty();
        java.lang.Object obj76 = strComparableMap74.clone();
        java.lang.CharSequence charSequence78 = strComparableMap74.remove((java.lang.Object) true);
        boolean boolean79 = strComparableMap1.remove((java.lang.Object) "", (java.lang.Object) charSequence78);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection80 = strComparableMap1.values();
        strComparableMap1.clear();
        java.lang.Object obj82 = strComparableMap1.clone();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(strComparableEntrySet13);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charSequenceCollection26);
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(charSequence38);
        org.junit.Assert.assertNull(charSequence40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(charSequenceCollection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strComparableEntrySet50);
        org.junit.Assert.assertNotNull(charSequenceCollection51);
        org.junit.Assert.assertNotNull(strComparableSet52);
        org.junit.Assert.assertNotNull(charSequenceCollection53);
        org.junit.Assert.assertNull(charSequence58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(charSequence63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "{}");
        org.junit.Assert.assertNotNull(charSequenceCollection68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + charSequence72 + "' != '" + "" + "'", charSequence72, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "{}");
        org.junit.Assert.assertNull(charSequence78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(charSequenceCollection80);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertEquals(obj82.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj82), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj82), "{}");
    }
}

