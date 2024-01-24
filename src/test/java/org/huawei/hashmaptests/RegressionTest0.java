package org.huawei.hashmaptests;

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
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault((Object) "", (Comparable<String>) "");
        Class<?> wildcardClass9 = charSequenceMap0.getClass();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "" + "'", strComparable8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.HashMap<Class<?>, java.util.AbstractMap<CharSequence, Comparable<String>>> wildcardClassMap1 = java.util.HashMap.newHashMap(0);
        org.junit.Assert.assertNotNull(wildcardClassMap1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap1 = new java.util.HashMap<CharSequence, Comparable<String>>((int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean9 = charSequenceMap0.equals((Object) 0);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj9 = null;
        Comparable<String> strComparable10 = charSequenceMap0.get(obj9);
        Comparable<String> strComparable12 = null;
        Comparable<String> strComparable13 = charSequenceMap0.putIfAbsent((CharSequence) "", strComparable12);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "" + "'", strComparable8, "");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap2 = new java.util.HashMap<CharSequence, Comparable<String>>((int) 'a', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: 0.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.HashMap<java.lang.reflect.GenericDeclaration, Class<?>> genericDeclarationMap2 = new java.util.HashMap<java.lang.reflect.GenericDeclaration, Class<?>>((int) (byte) 1, (float) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.HashMap<java.lang.reflect.AnnotatedElement, java.util.HashMap<CharSequence, Comparable<String>>> annotatedElementMap1 = java.util.HashMap.newHashMap((int) (byte) 10);
        org.junit.Assert.assertNotNull(annotatedElementMap1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj6 = null;
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault(obj6, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap9 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet10 = charSequenceMap9.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection11 = charSequenceMap9.values();
        Comparable<String> strComparable12 = charSequenceMap0.remove((Object) strComparableCollection11);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap13 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet14 = charSequenceMap13.keySet();
        boolean boolean18 = charSequenceMap13.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        String str19 = charSequenceMap13.toString();
        Comparable<String> strComparable21 = charSequenceMap0.getOrDefault((Object) str19, (Comparable<String>) "");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet10);
        org.junit.Assert.assertNotNull(strComparableCollection11);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(charSequenceSet14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "" + "'", strComparable21, "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Comparable<String> strComparable9 = charSequenceMap0.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean11 = charSequenceMap0.containsKey((Object) 10L);
        java.util.Collection<Comparable<String>> strComparableCollection12 = charSequenceMap0.values();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap13 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet14 = charSequenceMap13.keySet();
        boolean boolean18 = charSequenceMap13.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet19 = charSequenceMap13.entrySet();
        boolean boolean20 = charSequenceMap0.equals((Object) charSequenceEntrySet19);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableCollection12);
        org.junit.Assert.assertNotNull(charSequenceSet14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap9 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet10 = charSequenceMap9.keySet();
        boolean boolean14 = charSequenceMap9.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj15 = null;
        Comparable<String> strComparable17 = charSequenceMap9.getOrDefault(obj15, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap18 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet19 = charSequenceMap18.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection20 = charSequenceMap18.values();
        Comparable<String> strComparable21 = charSequenceMap9.remove((Object) strComparableCollection20);
        boolean boolean22 = charSequenceMap0.containsValue((Object) strComparable21);
        String str23 = charSequenceMap0.toString();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet19);
        org.junit.Assert.assertNotNull(strComparableCollection20);
        org.junit.Assert.assertNull(strComparable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean5 = charSequenceMap0.isEmpty();
        java.util.Map<CharSequence, Comparable<String>> charSequenceMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceMap0.putAll(charSequenceMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.size()\" because \"m\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean5 = charSequenceMap0.isEmpty();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap6 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet7 = charSequenceMap6.keySet();
        boolean boolean11 = charSequenceMap6.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet12 = charSequenceMap6.entrySet();
        Comparable<String> strComparable15 = charSequenceMap6.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean17 = charSequenceMap6.containsKey((Object) 10L);
        Class<?> wildcardClass18 = charSequenceMap6.getClass();
        Comparable<String> strComparable19 = charSequenceMap0.get((Object) charSequenceMap6);
        Comparable<String> strComparable22 = charSequenceMap6.replace((CharSequence) "hi!", (Comparable<String>) "{}");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charSequenceSet7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet12);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNull(strComparable22);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj6 = null;
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault(obj6, (Comparable<String>) "hi!");
        Class<?> wildcardClass9 = strComparable8.getClass();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection24 = charSequenceMap22.values();
        Comparable<String> strComparable26 = charSequenceMap22.remove((Object) (short) 0);
        Comparable<String> strComparable27 = charSequenceMap10.remove((Object) charSequenceMap22);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap28 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet29 = charSequenceMap28.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection30 = charSequenceMap28.values();
        Comparable<String> strComparable32 = charSequenceMap28.remove((Object) (short) 0);
        boolean boolean33 = charSequenceMap10.equals((Object) strComparable32);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertNotNull(strComparableCollection24);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(strComparable27);
        org.junit.Assert.assertNotNull(charSequenceSet29);
        org.junit.Assert.assertNotNull(strComparableCollection30);
        org.junit.Assert.assertNull(strComparable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean5 = charSequenceMap0.isEmpty();
        Comparable<String> strComparable8 = charSequenceMap0.put((CharSequence) "", (Comparable<String>) "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.HashMap<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMap1 = new java.util.HashMap<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.HashMap<java.lang.invoke.TypeDescriptor, java.util.HashMap<CharSequence, Comparable<String>>> typeDescriptorMap1 = new java.util.HashMap<java.lang.invoke.TypeDescriptor, java.util.HashMap<CharSequence, Comparable<String>>>((int) 'a');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection24 = charSequenceMap22.values();
        Comparable<String> strComparable26 = charSequenceMap22.remove((Object) (short) 0);
        Comparable<String> strComparable27 = charSequenceMap10.remove((Object) charSequenceMap22);
        charSequenceMap10.clear();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap29 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet30 = charSequenceMap29.keySet();
        boolean boolean34 = charSequenceMap29.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj35 = null;
        Comparable<String> strComparable37 = charSequenceMap29.getOrDefault(obj35, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap39 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet40 = charSequenceMap39.keySet();
        Comparable<String> strComparable43 = charSequenceMap39.replace((CharSequence) "hi!", (Comparable<String>) "");
        java.util.Set<CharSequence> charSequenceSet44 = charSequenceMap39.keySet();
        boolean boolean45 = charSequenceMap29.remove((Object) 100L, (Object) charSequenceMap39);
        charSequenceMap10.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap29);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertNotNull(strComparableCollection24);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(strComparable27);
        org.junit.Assert.assertNotNull(charSequenceSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + strComparable37 + "' != '" + "hi!" + "'", strComparable37, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet40);
        org.junit.Assert.assertNull(strComparable43);
        org.junit.Assert.assertNotNull(charSequenceSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Comparable<String> strComparable9 = charSequenceMap0.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean11 = charSequenceMap0.containsKey((Object) 10L);
        Comparable<String> strComparable14 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable16 = charSequenceMap0.get((Object) 0);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Comparable<String> strComparable9 = charSequenceMap0.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean11 = charSequenceMap0.containsKey((Object) 10L);
        Comparable<String> strComparable14 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean17 = charSequenceMap0.remove((Object) (byte) 100, (Object) (byte) 1);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap18 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap0);
//        org.junit.Assert.assertNotNull(charSequenceSet1);
//        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
//        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
//        org.junit.Assert.assertNull(strComparable9);
//        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
//        org.junit.Assert.assertNull(strComparable14);
//        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection2 = charSequenceMap0.values();
        Comparable<String> strComparable4 = charSequenceMap0.remove((Object) (short) 0);
        charSequenceMap0.clear();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNotNull(strComparableCollection2);
        org.junit.Assert.assertNull(strComparable4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj6 = null;
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault(obj6, (Comparable<String>) "hi!");
        boolean boolean9 = charSequenceMap0.isEmpty();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection24 = charSequenceMap22.values();
        Comparable<String> strComparable26 = charSequenceMap22.remove((Object) (short) 0);
        Comparable<String> strComparable27 = charSequenceMap10.remove((Object) charSequenceMap22);
        charSequenceMap22.clear();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap29 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet30 = charSequenceMap29.keySet();
        Comparable<String> strComparable33 = charSequenceMap29.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean34 = charSequenceMap29.isEmpty();
        boolean boolean36 = charSequenceMap22.remove((Object) charSequenceMap29, (Object) (short) 10);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertNotNull(strComparableCollection24);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(strComparable27);
        org.junit.Assert.assertNotNull(charSequenceSet30);
        org.junit.Assert.assertNull(strComparable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Comparable<String> strComparable9 = charSequenceMap0.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean11 = charSequenceMap0.containsKey((Object) 10L);
        boolean boolean14 = charSequenceMap0.remove((Object) (short) 0, (Object) 'a');
        boolean boolean16 = charSequenceMap0.equals((Object) 10.0d);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        Comparable<String> strComparable26 = charSequenceMap22.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable29 = charSequenceMap22.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str30 = charSequenceMap22.toString();
        java.util.Set<CharSequence> charSequenceSet31 = charSequenceMap22.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap32 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet33 = charSequenceMap32.keySet();
        boolean boolean37 = charSequenceMap32.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable40 = charSequenceMap32.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj41 = null;
        Comparable<String> strComparable42 = charSequenceMap32.get(obj41);
        charSequenceMap22.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap32);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap44 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet45 = charSequenceMap44.keySet();
        boolean boolean49 = charSequenceMap44.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet50 = charSequenceMap44.entrySet();
        Comparable<String> strComparable53 = charSequenceMap44.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean55 = charSequenceMap44.containsKey((Object) 10L);
        java.util.Collection<Comparable<String>> strComparableCollection56 = charSequenceMap44.values();
        charSequenceMap22.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap44);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap22);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(strComparable29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet31);
        org.junit.Assert.assertNotNull(charSequenceSet33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + strComparable40 + "' != '" + "" + "'", strComparable40, "");
        org.junit.Assert.assertNull(strComparable42);
        org.junit.Assert.assertNotNull(charSequenceSet45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet50);
        org.junit.Assert.assertNull(strComparable53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strComparableCollection56);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Comparable<String> strComparable9 = charSequenceMap0.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean11 = charSequenceMap0.containsKey((Object) 10L);
        java.util.Collection<Comparable<String>> strComparableCollection12 = charSequenceMap0.values();
        boolean boolean16 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "{}", (Comparable<String>) "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableCollection12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection2 = charSequenceMap0.values();
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet3 = charSequenceMap0.entrySet();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNotNull(strComparableCollection2);
        org.junit.Assert.assertNotNull(charSequenceEntrySet3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Object obj7 = charSequenceMap0.clone();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap8 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap8.keySet();
        boolean boolean13 = charSequenceMap8.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj14 = null;
        Comparable<String> strComparable16 = charSequenceMap8.getOrDefault(obj14, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap18 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet19 = charSequenceMap18.keySet();
        Comparable<String> strComparable22 = charSequenceMap18.replace((CharSequence) "hi!", (Comparable<String>) "");
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap18.keySet();
        boolean boolean24 = charSequenceMap8.remove((Object) 100L, (Object) charSequenceMap18);
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet25 = charSequenceMap8.entrySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap27 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet28 = charSequenceMap27.keySet();
        Comparable<String> strComparable30 = null;
        Comparable<String> strComparable31 = charSequenceMap27.replace((CharSequence) "{}", strComparable30);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap32 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap27);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap33 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet34 = charSequenceMap33.keySet();
        Comparable<String> strComparable36 = null;
        Comparable<String> strComparable37 = charSequenceMap33.replace((CharSequence) "{}", strComparable36);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap38 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap33);
        java.util.HashMap<java.lang.invoke.TypeDescriptor.OfField<Class<?>>, java.util.HashMap<CharSequence, Comparable<String>>> wildcardClassOfFieldMap41 = new java.util.HashMap<java.lang.invoke.TypeDescriptor.OfField<Class<?>>, java.util.HashMap<CharSequence, Comparable<String>>>((int) ' ', (float) (byte) 10);
        boolean boolean42 = charSequenceMap32.remove((Object) charSequenceMap38, (Object) ' ');
        Comparable<String> strComparable45 = charSequenceMap32.replace((CharSequence) "{}", (Comparable<String>) "");
        boolean boolean46 = charSequenceMap8.remove((Object) 100.0f, (Object) strComparable45);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap8);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{}");
        org.junit.Assert.assertEquals(String.valueOf(obj7), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet19);
        org.junit.Assert.assertNull(strComparable22);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet25);
        org.junit.Assert.assertNotNull(charSequenceSet28);
        org.junit.Assert.assertNull(strComparable31);
        org.junit.Assert.assertNotNull(charSequenceSet34);
        org.junit.Assert.assertNull(strComparable37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strComparable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj6 = null;
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault(obj6, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        Comparable<String> strComparable14 = charSequenceMap10.replace((CharSequence) "hi!", (Comparable<String>) "");
        java.util.Set<CharSequence> charSequenceSet15 = charSequenceMap10.keySet();
        boolean boolean16 = charSequenceMap0.remove((Object) 100L, (Object) charSequenceMap10);
        boolean boolean20 = charSequenceMap0.replace((CharSequence) "{}", (Comparable<String>) "{}", (Comparable<String>) "{}");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(charSequenceSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap2 = new java.util.HashMap<CharSequence, Comparable<String>>((int) (byte) 1, (float) 'a');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet16 = charSequenceMap10.entrySet();
        Comparable<String> strComparable19 = charSequenceMap10.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean21 = charSequenceMap10.containsKey((Object) 10L);
        java.util.Collection<Comparable<String>> strComparableCollection22 = charSequenceMap10.values();
        Comparable<String> strComparable23 = charSequenceMap0.get((Object) charSequenceMap10);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet16);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strComparableCollection22);
        org.junit.Assert.assertNull(strComparable23);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        boolean boolean13 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable15 = null;
        Comparable<String> strComparable16 = charSequenceMap0.getOrDefault((Object) 0L, strComparable15);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        boolean boolean27 = charSequenceMap22.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet28 = charSequenceMap22.entrySet();
        Comparable<String> strComparable31 = charSequenceMap22.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean33 = charSequenceMap22.containsKey((Object) 10L);
        java.util.Collection<Comparable<String>> strComparableCollection34 = charSequenceMap22.values();
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap22);
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet36 = charSequenceMap0.entrySet();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet28);
        org.junit.Assert.assertNull(strComparable31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strComparableCollection34);
        org.junit.Assert.assertNotNull(charSequenceEntrySet36);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        boolean boolean27 = charSequenceMap22.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet28 = charSequenceMap22.entrySet();
        Comparable<String> strComparable31 = charSequenceMap22.put((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean33 = charSequenceMap22.containsKey((Object) 10L);
        java.util.Collection<Comparable<String>> strComparableCollection34 = charSequenceMap22.values();
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap22);
        Comparable<String> strComparable38 = charSequenceMap22.putIfAbsent((CharSequence) "{}", (Comparable<String>) "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet28);
        org.junit.Assert.assertNull(strComparable31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strComparableCollection34);
        org.junit.Assert.assertNull(strComparable38);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable3 = null;
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "{}", strComparable3);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap5 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap0);
        Comparable<String> strComparable8 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean9 = charSequenceMap0.isEmpty();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet16 = charSequenceMap10.entrySet();
        boolean boolean17 = charSequenceMap0.containsValue((Object) charSequenceMap10);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap6 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet7 = charSequenceMap6.keySet();
        boolean boolean11 = charSequenceMap6.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj12 = null;
        Comparable<String> strComparable14 = charSequenceMap6.getOrDefault(obj12, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap15 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet16 = charSequenceMap15.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection17 = charSequenceMap15.values();
        Comparable<String> strComparable18 = charSequenceMap6.remove((Object) strComparableCollection17);
        boolean boolean20 = charSequenceMap6.containsValue((Object) (short) 10);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap6);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceSet7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet16);
        org.junit.Assert.assertNotNull(strComparableCollection17);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.invoke.TypeDescriptor.OfField<Class<?>>, String> wildcardClassOfFieldMap1 = new java.util.HashMap<java.lang.invoke.TypeDescriptor.OfField<Class<?>>, String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable3 = null;
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "{}", strComparable3);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap5 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap0);
        Class<?> wildcardClass6 = charSequenceMap5.getClass();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet6 = charSequenceMap0.entrySet();
        Object obj7 = charSequenceMap0.clone();
        Comparable<String> strComparable10 = charSequenceMap0.putIfAbsent((CharSequence) "hi!", (Comparable<String>) "");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap11 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet12 = charSequenceMap11.keySet();
        boolean boolean16 = charSequenceMap11.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj17 = null;
        Comparable<String> strComparable19 = charSequenceMap11.getOrDefault(obj17, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap21 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet22 = charSequenceMap21.keySet();
        Comparable<String> strComparable25 = charSequenceMap21.replace((CharSequence) "hi!", (Comparable<String>) "");
        java.util.Set<CharSequence> charSequenceSet26 = charSequenceMap21.keySet();
        boolean boolean27 = charSequenceMap11.remove((Object) 100L, (Object) charSequenceMap21);
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet28 = charSequenceMap11.entrySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap29 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet30 = charSequenceMap29.keySet();
        boolean boolean34 = charSequenceMap29.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Object obj35 = null;
        Comparable<String> strComparable37 = charSequenceMap29.getOrDefault(obj35, (Comparable<String>) "hi!");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap39 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet40 = charSequenceMap39.keySet();
        Comparable<String> strComparable43 = charSequenceMap39.replace((CharSequence) "hi!", (Comparable<String>) "");
        java.util.Set<CharSequence> charSequenceSet44 = charSequenceMap39.keySet();
        boolean boolean45 = charSequenceMap29.remove((Object) 100L, (Object) charSequenceMap39);
        charSequenceMap29.clear();
        boolean boolean47 = charSequenceMap0.remove((Object) charSequenceMap11, (Object) charSequenceMap29);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{}");
        org.junit.Assert.assertEquals(String.valueOf(obj7), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{}");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(charSequenceSet12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet22);
        org.junit.Assert.assertNull(strComparable25);
        org.junit.Assert.assertNotNull(charSequenceSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charSequenceEntrySet28);
        org.junit.Assert.assertNotNull(charSequenceSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + strComparable37 + "' != '" + "hi!" + "'", strComparable37, "hi!");
        org.junit.Assert.assertNotNull(charSequenceSet40);
        org.junit.Assert.assertNull(strComparable43);
        org.junit.Assert.assertNotNull(charSequenceSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.Set<CharSequence> charSequenceSet22 = charSequenceMap0.keySet();
        Comparable<String> strComparable25 = charSequenceMap0.putIfAbsent((CharSequence) "{}", (Comparable<String>) "");
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet22);
        org.junit.Assert.assertNull(strComparable25);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable3 = null;
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "{}", strComparable3);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap5 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap0);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap6 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet7 = charSequenceMap6.keySet();
        Comparable<String> strComparable9 = null;
        Comparable<String> strComparable10 = charSequenceMap6.replace((CharSequence) "{}", strComparable9);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap11 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap6);
        java.util.HashMap<java.lang.invoke.TypeDescriptor.OfField<Class<?>>, java.util.HashMap<CharSequence, Comparable<String>>> wildcardClassOfFieldMap14 = new java.util.HashMap<java.lang.invoke.TypeDescriptor.OfField<Class<?>>, java.util.HashMap<CharSequence, Comparable<String>>>((int) ' ', (float) (byte) 10);
        boolean boolean15 = charSequenceMap5.remove((Object) charSequenceMap11, (Object) ' ');
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap16 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet17 = charSequenceMap16.keySet();
        Comparable<String> strComparable20 = charSequenceMap16.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable23 = charSequenceMap16.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str24 = charSequenceMap16.toString();
        java.util.Set<CharSequence> charSequenceSet25 = charSequenceMap16.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap26 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet27 = charSequenceMap26.keySet();
        boolean boolean31 = charSequenceMap26.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable34 = charSequenceMap26.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj35 = null;
        Comparable<String> strComparable36 = charSequenceMap26.get(obj35);
        charSequenceMap16.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap26);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap38 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet39 = charSequenceMap38.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection40 = charSequenceMap38.values();
        Comparable<String> strComparable42 = charSequenceMap38.remove((Object) (short) 0);
        Comparable<String> strComparable43 = charSequenceMap26.remove((Object) charSequenceMap38);
        Comparable<String> strComparable46 = charSequenceMap38.putIfAbsent((CharSequence) "hi!", (Comparable<String>) "{}");
        boolean boolean47 = charSequenceMap5.containsKey((Object) "{}");
        boolean boolean48 = charSequenceMap5.isEmpty();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(charSequenceSet7);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charSequenceSet17);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNull(strComparable23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet25);
        org.junit.Assert.assertNotNull(charSequenceSet27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + strComparable34 + "' != '" + "" + "'", strComparable34, "");
        org.junit.Assert.assertNull(strComparable36);
        org.junit.Assert.assertNotNull(charSequenceSet39);
        org.junit.Assert.assertNotNull(strComparableCollection40);
        org.junit.Assert.assertNull(strComparable42);
        org.junit.Assert.assertNull(strComparable43);
        org.junit.Assert.assertNull(strComparable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable3 = null;
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "{}", strComparable3);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap5 = new java.util.HashMap<CharSequence, Comparable<String>>((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap0);
        Comparable<String> strComparable8 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "{}");
        boolean boolean9 = charSequenceMap0.isEmpty();
        java.util.Set<java.util.Map.Entry<CharSequence, Comparable<String>>> charSequenceEntrySet10 = charSequenceMap0.entrySet();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charSequenceEntrySet10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        boolean boolean5 = charSequenceMap0.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable8 = charSequenceMap0.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj9 = null;
        Comparable<String> strComparable10 = charSequenceMap0.get(obj9);
        int int11 = charSequenceMap0.size();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap12 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet13 = charSequenceMap12.keySet();
        Comparable<String> strComparable16 = charSequenceMap12.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean17 = charSequenceMap12.isEmpty();
        charSequenceMap12.clear();
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap12);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "" + "'", strComparable8, "");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charSequenceSet13);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap8 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap8.keySet();
        boolean boolean10 = charSequenceMap0.equals((Object) charSequenceMap8);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        boolean boolean5 = charSequenceMap0.isEmpty();
        boolean boolean6 = charSequenceMap0.isEmpty();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap22 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet23 = charSequenceMap22.keySet();
        java.util.Collection<Comparable<String>> strComparableCollection24 = charSequenceMap22.values();
        Comparable<String> strComparable26 = charSequenceMap22.remove((Object) (short) 0);
        Comparable<String> strComparable27 = charSequenceMap10.remove((Object) charSequenceMap22);
        charSequenceMap22.clear();
        int int29 = charSequenceMap22.size();
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(charSequenceSet23);
        org.junit.Assert.assertNotNull(strComparableCollection24);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(strComparable27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap0 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet1 = charSequenceMap0.keySet();
        Comparable<String> strComparable4 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        Comparable<String> strComparable7 = charSequenceMap0.replace((CharSequence) "hi!", (Comparable<String>) "");
        String str8 = charSequenceMap0.toString();
        java.util.Set<CharSequence> charSequenceSet9 = charSequenceMap0.keySet();
        java.util.HashMap<CharSequence, Comparable<String>> charSequenceMap10 = new java.util.HashMap<CharSequence, Comparable<String>>();
        java.util.Set<CharSequence> charSequenceSet11 = charSequenceMap10.keySet();
        boolean boolean15 = charSequenceMap10.replace((CharSequence) "", (Comparable<String>) "", (Comparable<String>) "");
        Comparable<String> strComparable18 = charSequenceMap10.getOrDefault((Object) "", (Comparable<String>) "");
        Object obj19 = null;
        Comparable<String> strComparable20 = charSequenceMap10.get(obj19);
        charSequenceMap0.putAll((java.util.Map<CharSequence, Comparable<String>>) charSequenceMap10);
        int int22 = charSequenceMap0.size();
        boolean boolean24 = charSequenceMap0.equals((Object) 100);
        org.junit.Assert.assertNotNull(charSequenceSet1);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(charSequenceSet9);
        org.junit.Assert.assertNotNull(charSequenceSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

