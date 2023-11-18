package com.example.demo.controller;

import com.example.demo.ExtraConfig;
import com.example.demo.model.domain.SysConfig;
import com.example.demo.model.domain.User;
import com.example.demo.model.enums.LangEnum;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import static org.joda.time.DateTimeConstants.SECONDS_PER_DAY;

@RestController
@RequestMapping("/v1/controller")
public class Controller {

    @Autowired
    private ExtraConfig extraConfig;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StandardEnvironment environment;

    @Autowired
    private ConversionService conversionService;

    @GetMapping(value = "/hello")
    public Map<String, String> hello() throws Exception {
        Map<String, String> map = new HashMap<>();
//        map.put("num", userService.updateName()+"");
//        map.put("num", userService.updateName("luongnv")+"");
//        map.put("luongnv", extraConfig.getLuongnv());
//        map.put("environment", environment.getProperty("luong"));
        LangEnum en = conversionService.convert("en", LangEnum.class);
        System.out.println(en.getLabel() + "4");
        map.put("en", en.getLabel());
        return map;
    }

    private static final String  FORMAT_NUMBER_AMOUNT = "###.00";

    public static void main(String[] args) {
//        Date expiryDate = Date.from(Instant.now().plusSeconds(SECONDS_PER_DAY * 3));
//        System.out.println(expiryDate);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        System.out.println(sdf.format(expiryDate));

//        NumberFormat formatter = new DecimalFormat("00");
//        DecimalFormat amountFormat = new DecimalFormat(FORMAT_NUMBER_AMOUNT);
//
//        System.out.println(amountFormat.format(234.12341234));
//        int a = 13;
//        long b = 24;
//        System.out.println(calFormatStringLength(a));
//        System.out.println(calFormatStringLength(b));
//        String test = "00020101021126490009SG.PAYNOW010120210323423434A030100408201907185204630053037025406400.005802SG5921AIA Singapore Pte Ltd6009SINGAPORE62220118PZEC201907160000776304";
//        System.out.println(getCRC16CCITT(test, 0x1021, 0xFFFF, false));

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        int result = numbers
//                .stream()
//                .reduce(0, (subtotal, element) -> subtotal + element);
//        System.out.println(result);
//        BigDecimal bigDecimal = BigDecimal.valueOf(9.123);
//
//        System.out.println("0xyz1234".toUpperCase());
        // YYYY-MM-DDTHH:MM:SS.mmm
//        final String ISO_8601_24H_FULL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
//        System.out.println(Controller.formatDate(new Date(), ISO_8601_24H_FULL_FORMAT));

//        String abc = "ab";
//        String bcd = "a";
//        String bcd = abc;
//        abc = "b";
//        System.out.println(bcd == bcd);
//        System.out.println(abc);

//        String a = new String("a");
//        String b = new String("b");
//        System.out.println(a == b);
//        a = b;
//        System.out.println(a == b);

//        User user = new User();
//        user.setName("Luongnv");
//        user.setId(1L);
//        user.setSysConfigs(new ArrayList<>());
//
//        User user1 = SerializationUtils.clone(user);
//        user1.setId(2L);
//        user1.setName("nvnv");
//        List<SysConfig> sysConfigs = new ArrayList<>();
//        sysConfigs.add(new SysConfig("1", "2"));
//
//        user1.setSysConfigs(sysConfigs);
//
//        System.out.println(user);
//        System.out.println(user1);

//        String transactionDate = new SimpleDateFormat("dd-MMM-yyyy").format((Date) ));
//        String effDate = convertToDateForMsg("01-2030");
//        System.out.println(effDate);

//        String str = "-----BEGIN PGP MESSAGE-----\n" +
//                "\n" +
//                "Version: BCPG v1.60\n" +
//                "\n" +
//                " \n" +
//                "\n" +
//                "hQEMA/LwpYqFZOCuAQf9HpTNgib/ON5nVvuY6g7IbK74D6KW2vIHsks/anLhpNv7\n" +
//                "\n" +
//                "E2s0yfTmC2kotMR0SNZ0TrS6ge8mv5B73Su6/6Zc7XEBWqDITGF9kThFXXGZ3xzf\n" +
//                "\n" +
//                "WkMXV+tkixORRghWF001zMMbU8MVRjBha+IRZuFQ2GfuI/7G6RBQCk7FnqLgpofL\n" +
//                "\n" +
//                "kB17C9ymcNrdAJX1zruYa59BlnTdinZgWzadziN8WIY+mII9mj6VLH/8XybhDZ9h\n" +
//                "\n" +
//                "dq8MLlzh9Ggr62PLqqRb6qENLV9jU1aZHnKotAg0BsFv+jDFQbs0USmSvdzYP0DO\n" +
//                "\n" +
//                "A5mgMQQqhMvXiufEBM2B4g2ne0ko4zwsDzENSIhuBNLCXgG8HclsIF0Vo+TddvTU\n" +
//                "\n" +
//                "whl8oF1myMk2HDaxo2KRzoVveuYuFIzDrVrFMRc0dCtJ4nbZ+WDZY/tGEY8/I57x\n" +
//                "\n" +
//                "fUQIKrWnmCmYonKhXsb511CElhTfOUchxtD3zaZKtl/JKgF5gfzBRMM077XnpSnk\n" +
//                "\n" +
//                "51pxnWHCln8nz37clLW4El1dSAMTqucoQEADqON0+69wdalp7GokHMFUMGJ5DfKK\n" +
//                "\n" +
//                "MlLfLUquoJ9Fc7kBqAeCSF8etowQl4gJsiGBD6H8tGQs563OqhGwxSks8Urv5jos\n" +
//                "\n" +
//                "jJ2tiNQb8BDVckTN1cmQwsOh/VZt7PzFNDp8GXstKUKawkZh/cvs57hjH2v0M6vT\n" +
//                "\n" +
//                "hDBrwtU+ykiX/UPX9LIK1Z7LpPsOC/veqhyPuzr2pzZDn0nE26lMqcrLHH19FnVd\n" +
//                "\n" +
//                "2KBNsfAFkuN8L1Xwh6Zlv28SPsXisBgvQatVo7J9/mMMYCsNwu1MGtFa5F/iSUA+\n" +
//                "\n" +
//                "3jBhzWGlWnCP3yJB8uy4ZSAEkh7u006GMbVdnx399VpC8rPRIddGrKzPoR6xobQb\n" +
//                "\n" +
//                "e1kUV9SXMlq7W7+070IzyKkf/k+fyq52fImROjxcYHiIUrmc6Bezn9Z4560p4Ro9\n" +
//                "\n" +
//                "tONEshINouYuwVUWD2xcm4gNTlEzG/39iEGd8f5CvXR/ogEuF2zxrT02IpfXfhfo\n" +
//                "\n" +
//                "qNXT7HltlAKNeDjFtuwVytkz+ta8UdXyRQVZWI6vUMPb8uIgWGIItyyb/tQRRbRO\n" +
//                "\n" +
//                "+AsmxRdXspQ7whZ9n7TrC7WKX+bJG+GXS62MZLH6qvHEksOnbevyXrTfnLHlrFZK\n" +
//                "\n" +
//                "jDRbRhPhTRx9f3wzZX8zzDqb4vdfrxuhv503K5vVwCuAg4EQzKxU7z7rBW8WqE8Y\n" +
//                "\n" +
//                "IZbYaG1KjgggX4qMLdgvdX+efjUT0PO7cRP6gSQlH1GRTqtldgZOULSG/LA02mHC\n" +
//                "\n" +
//                "+7nE98gMiPnVKQhJMiR8vipvRQRUElRJgJGbWZVtQq3dstoB+8nd55rcBKYe6Xm4\n" +
//                "\n" +
//                "2UC5uIpzPrOKE3fqSnSUxvKniJPK1BSdJ6mePpak50vH0xbbELKYdbcgPY/d02On\n" +
//                "\n" +
//                "SkIFpRcZSYP1iwMhiWBj6Q==\n" +
//                "\n" +
//                "=wpEO\n" +
//                "\n" +
//                "-----END PGP MESSAGE-----";
////        System.out.println(Arrays.toString(str.split("\n")));
//        String[] strArr = str.split("\n");
//        List<String> strings = Arrays.stream(strArr).filter( arr -> StringUtils.isNotEmpty(arr.trim())).collect(Collectors.toList());
//        strings.set(1, strings.get(1) + "\n");
//
//        System.out.println(String.join("\n", strings));

//        String str = "028-4-996948";
//        System.out.println(str.replace("-",""));

            List<String> strings = Arrays.asList("ABC", "XYZ", "LMN");
            List<String> list = new LinkedList<>(strings);
            List<String> strings1 = Arrays.asList("ABC");
            list.removeAll(strings1);
            System.out.println(list.get(0).startsWith("X"));
//        System.out.println(stringBuilder.deleteCharAt(str.indexOf("\n")));

    }

    private static String convertToDateForMsg(String date) {
        DateTime dateConvert = DateTime.parse(date, DateTimeFormat.forPattern("MM-yyyy"));
        DateTime dateMSG = dateConvert.dayOfMonth().withMaximumValue();
        return dateMSG.toString("yyyyMMdd");
    }

    private static <T extends Number> String calFormatStringLength(T x){
        DecimalFormat lengthFormat = new DecimalFormat("00");
        return lengthFormat.format(x);
    }

    public static String getCRC16CCITT(String inputStr, int polynomial,
                                       int crc, boolean isHex) {

        int strLen = inputStr.length();
        int[] intArray;

        if (isHex) {
            if (strLen % 2 != 0) {
                inputStr = inputStr.substring(0, strLen - 1) + "0"
                        + inputStr.substring(strLen - 1, strLen);
                strLen++;
            }

            intArray = new int[strLen / 2];
            int ctr = 0;
            for (int n = 0; n < strLen; n += 2) {
                intArray[ctr] = Integer.valueOf(inputStr.substring(n, n + 2), 16);
                ctr++;
            }
        } else {
            intArray = new int[inputStr.getBytes().length];
            int ctr=0;
            for(byte b : inputStr.getBytes()){
                intArray[ctr] = b;
                ctr++;
            }
        }

        // main code for computing the 16-bit CRC-CCITT
        for (int b : intArray) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((crc >> 15 & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit)
                    crc ^= polynomial;
            }
        }

        crc &= 0xFFFF;
        String crcStr = Integer.toHexString(crc).toUpperCase();
        int n = crcStr.length();
        for(int i=0; i<(4-n); i++){
            crcStr = "0" + crcStr;
        }
        return crcStr;
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
//        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
        return sdf.format(date);
    }
}
