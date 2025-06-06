package edu.hotproperties.final_project.intializer;

import edu.hotproperties.final_project.entities.Property;
import edu.hotproperties.final_project.entities.PropertyImage;
import edu.hotproperties.final_project.repository.PropertyImageRepository;
import edu.hotproperties.final_project.repository.PropertyRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PropertyImageDataInitializer {
    private final PropertyImageRepository propertyImageRepository;
    private final PropertyRepository propertyRepository;
    public PropertiesDataInitializer(PropertyImageRepository propertyImageRepository, PropertyRepository propertyRepository) {
        this.propertyImageRepository = propertyImageRepository;
        this.propertyRepository = propertyRepository;
    }

    @PostConstruct
    public void init() {
        if (propertyImageRepository.count() > 0) {
            System.out.println("Skipping auto data initialization — records already exist.");
            return;
        }
        List<PropertyImage> autos = List.of(
                new PropertyImage(propertyRepository.findByTitle("334 N Jefferson St UNIT D"), "1743384015245_6a9c75de2a1a1b59e7ffb67666e34f21-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("334 N Jefferson St UNIT D"), "1743384015263_c8b7f3395049c85c63629545f9b7c628-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("334 N Jefferson St UNIT D"), "1743384015264_57e9193e3d81780a668bc762f2662ce1-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("334 N Jefferson St UNIT D"), "1743384015264_4208506e92354c9bbf08264f52214443-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("334 N Jefferson St UNIT D"), "1743384015265_feea5afd5f1e1d5ac49cbabb52ab9de0-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("334 N Jefferson St UNIT D"), "1743384015266_f1ab08cd9526db6b89869706e2326957-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061456_5817c06a023247878cad80b13437a344-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061461_7949f19564896909d78f3fcaff95b1fd-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061461_f16b81fd636cc523ace9d3bb0256552d-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061462_f727e2747ba462aa10058f56caa3557e-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061464_1fd8ed76ab9561d8997f2021f2fa36be-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061464_eebaa9c584979606b61e3357c48d8547-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("339 W Webster Ave UNIT 2B"), "1743992061465_30d9ae794d238c468c93c24e75f606ec-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060454_c24b273254041b893ccd6692111b5200-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060455_79189db1b8f663642e731eb0b01b5f39-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060456_7e771c0fb66cd751539d8d806f0ba148-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060456_08d55c9fc87e4f22d67a478fab4c9a03-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060457_0164127f87e51ea7a12bd2c305b6c2e0-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060457_a7cef31db25ea18719d4733f0b95b223-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("401 W Dickens Ave"), "1743388060457_ee5061af173e2bf0aad53eb5f26cf706-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628478_038333ffc0b2ab9b3d4beee098815cd1-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628479_e89f81a9e0c787d35f53786a26bf94db-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628480_902a62e40dfe6025619ad874c015e85e-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628480_4575349ee82303eddef14e866c03d9b6-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628481_8e1830db57e8855cc40ab1f82e7b9ddf-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628481_7445e48b3fef12706bda016fed9ead39-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628481_9945c420965cf28e99533c53f919c2a8-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("461 W Melrose St"), "1743301628482_4f93514962a2d6df83b282589ace1ba1-cc_ft_960.webp"),


                new PropertyImage(propertyRepository.findByTitle("1249 S Plymouth Ct"), "1743384199295_4542114353ac37b6202a6de33663be81-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1249 S Plymouth Ct"), "1743384199295_a55bd3c3af04d6f7ac3807af405524ae-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1249 S Plymouth Ct"), "1743384199296_8dc571649cf4b989fd10e1fda3aa1419-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1249 S Plymouth Ct"), "1743384199296_39dc5cf00542133c4df96861e635f7a7-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1249 S Plymouth Ct"), "1743384199296_210172c41c26c079efc76d51d593a82b-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1249 S Plymouth Ct"), "1743384199297_4fe190c6aef86b5e0aaa0b4fe47ae719-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("1541 W Addison St"), "1743992242724_0ca592349432a46fba99299c74267220-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1541 W Addison St"), "1743992242724_2ae7e5f1f89fcfb262f2088c53cce3b9-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1541 W Addison St"), "1743992242725_50e9c8299c9368422483ba4dff253098-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1541 W Addison St"), "1743992242725_54ea1b70cede8d606beecadf2b9c2f28-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1541 W Addison St"), "1743992242726_9ff251395613a68239c6820f4daea338-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1541 W Addison St"), "1743992242727_1376aeceae202e2bad77219dc8190cdd-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255449_cf806ba37db343ee7f0ee51d39252135-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255450_02be17d8f9ac024cf482014e592e180d-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255450_4cbdcdfef821e5dc91e7751514c6d68e-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255450_f957316337dc3918f40f7cd7383eecbf-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255451_8eb8c6eceb0e3bea3cdb9c2e9793d4e5-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255451_77be1d31e0ad3589d2bb47f7f85b924f-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1701 N Dayton St"), "1743302255451_b31d1be54f40e40242f5d5596252db0c-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("1741 N Mozart St"), "1743301809073_677b8026a3951bb4dddd94cc39af7c39-cc_ft_960 (1).webp"),
                new PropertyImage(propertyRepository.findByTitle("1741 N Mozart St"), "1743301809073_6002383c7e5af148dbf7865834c9d978-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1741 N Mozart St"), "1743301809074_4619a01b6891e0801336c0705ab189ef-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1741 N Mozart St"), "1743301809074_a12a500ba769699bc054ea0ce703e52c-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1741 N Mozart St"), "1743301809074_cac06501b21dfee3dc57906057bcc348-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1741 N Mozart St"), "1743301809075_0e9427333a0d908161e5147b7dc123ee-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271085_cbd7103d0fafdb12e7debbc0654493bd-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271086_3d168d1493c8661b69c87cc55d6099d1-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271086_5d44f3575f04874e53743a5c1718ca88-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271087_2c9fade74be1b69ca7c7cb273c6c87c2-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271087_79cac6350cb9217e7a6bcc8f5d5fd0cb-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271087_978969480d1b891918b174eb749a651d-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("1837 N Fremont St"), "1743281271088_0bd9f82b77c94edc082bb39408007973-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("2317 W Ohio St"), "1743302048220_02499d07b48dce810e28dea78a5e026f-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2317 W Ohio St"), "1743302048220_d420e4ce5c58d33e2b36b4e90fb5c56d-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2317 W Ohio St"), "1743302048221_88838f14535dd65a2cb177a59669b281-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2317 W Ohio St"), "1743302048223_eddb73c7118ac6f157503cc1218ab8e5-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2317 W Ohio St"), "1743302048225_4d8c640575f652c14501094280ca42b3-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2317 W Ohio St"), "1743302048225_53c34c82cf7f09148a98c1ad4bf8fdd2-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392201_24210295f2d05ba693adc25d1c896206-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392202_2b4d95e3030041acff0ccb66cd4bfd36-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392202_2b59c2456dce88ba36b7bcfbbdf0f85f-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392202_4a12de4cf2f21dea63628868986ae31b-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392203_4c55a56e9e17f85f2ec6eeb0086ec5d0-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392203_240789fdb44d85f5c5a8a72de4db20e3-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2779 N Kenmore Ave"), "1743384392204_db5691f807cab5e67c31f141fc3f6ac7-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("2818 W Wellington Ave"), "1743301338472_33a4f1cbdd5fb813e4696238006b7882-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2818 W Wellington Ave"), "1743301338476_0ce73eb7b856382475f51f49f79beb89-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2818 W Wellington Ave"), "1743301338476_78dd178cbaaa151772e98ddc8f157b61-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2818 W Wellington Ave"), "1743301338477_28dffdb73243072752daf3888d06e47a-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2818 W Wellington Ave"), "1743301338477_cbf60776fd416a41ea66240135d6edbe-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("2818 W Wellington Ave"), "1743301338477_dd32b92ceb6814bda0aa4e5b072887df-cc_ft_960.webp"),


                new PropertyImage(propertyRepository.findByTitle("3423 N Kedzie Ave"), "1743281104544_cc41995923da491a77509ba3c594dfbd-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3423 N Kedzie Ave"), "1743281104544_dcfa791d9108ba2825906026396b1b06-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3423 N Kedzie Ave"), "1743281104545_3d2b506d9411b5465ba886b4f8a5e236-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3423 N Kedzie Ave"), "1743281104545_97f285258a02cc3c9fb1d378463266ce-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3423 N Kedzie Ave"), "1743281104545_79540e8ca9aafe743e3c504a3fe95750-cc_ft_960.webp"),


                new PropertyImage(propertyRepository.findByTitle("3454 W Potomac Ave"), "1743301467429_a0596dd36e88cac9a64f35eaf1d8ce71-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3454 W Potomac Ave"), "1743301467429_e433d1c2b82fd5ca765a330996a33b8b-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3454 W Potomac Ave"), "1743301467430_383e06b5c9eaa15362db824c9315bb48-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3454 W Potomac Ave"), "1743301467430_445fa915603a0172fcc33ab2f4bffff5-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3454 W Potomac Ave"), "1743301467430_35771fac6f65e303b0aae04797434661-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("3818 N Christiana Ave"), "1743280986563_8c1815366539cf90fd6cb38dbb1b1e1e-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3818 N Christiana Ave"), "1743280986566_3bd01c92edfab81e6ef7702df5c5f315-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3818 N Christiana Ave"), "1743280986566_419c22f5dd1ddc1a6d861df85c941db9-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3818 N Christiana Ave"), "1743280986569_e0eeefdb3c45f55b99d1ad272a9595c3-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("3818 N Christiana Ave"), "1743280986573_b48577b143d2f0c5b79a4bb14dd7ec0d-cc_ft_960.webp"),


                new PropertyImage(propertyRepository.findByTitle("4425 N Winchester Ave"), "1743387717563_1b52d279e85865c7f0bf096a15389cde-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4425 N Winchester Ave"), "1743387717569_3bd5e5aa31981523260b921b90147af1-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4425 N Winchester Ave"), "1743387717569_ef8752d95d4a035171a9e68ea1b931b3-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4425 N Winchester Ave"), "1743387717570_a1002e32f5837499940cb388fd9564e9-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4425 N Winchester Ave"), "1743387717571_fb9d6f09ff74869a68e130639b4a6656-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4425 N Winchester Ave"), "1743387717572_4e76c9ea759f17c5117146b8e3767d59-cc_ft_960.webp"),

                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872830_3d90623319bb81e1fc9981458177dfbe-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872831_52a0b90d5ad6706b893bde00716c33d3-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872832_1dbb545e72db17e3e4f71782d804f150-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872832_02f4e0b3bf227e23803789cc22b57a51-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872832_09ed819d77efdcc01b00c5aabbaea793-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872833_9f3d06c29900d8b66f2b0cb1711621e6-cc_ft_960.webp"),
                new PropertyImage(propertyRepository.findByTitle("4511 N Saint Louis Ave"), "1743387872833_d6d09d6b56a9ada275beac058cd819ea-cc_ft_960.webp")




                );

        propertyImageRepository.saveAll(autos);
        System.out.println("Initialized 18 properties");
    }
}
