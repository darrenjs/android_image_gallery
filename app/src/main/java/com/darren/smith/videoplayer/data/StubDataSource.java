package com.darren.smith.videoplayer.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporary data source
 */
public class StubDataSource implements DataSource {

    private final List<String> imageUrls = new ArrayList<String>() {{
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/c11f66ec0451a36f5aae494b1509b069_bf869227-c34a-449c-83ff-ed093d341dd3_480x.progressive.jpg?v=1573616179");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/4940c5878babf3dc5d2ca567b7558178_9e62fc4c-4116-48e5-a4f5-3a99c73ae7b1_240x360_crop_center.progressive.jpg?v=1573651499");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/950e439404c3d5eddd86ae876cec83bf_949b5045-2503-4883-bcd2-ff1f31f5b14c_240x360_crop_center.progressive.jpg?v=1573588746");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/wonder_woman_nineteen_eighty_four_ver6_240x360_crop_center.progressive.jpg?v=1598648531");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/parasite_ver3_xlg_240x360_crop_center.progressive.jpg?v=1581309216");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/no-time-to-die_krgsl7mv_240x360_crop_center.progressive.jpg?v=1604419849");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/9d8e73e436b536a7c81644c6e9877c7a_1c9d0f90-9991-4326-8f37-3dd980abeacf_240x360_crop_center.progressive.jpg?v=1573590262");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/top_gun_maverick_ver2_240x360_crop_center.progressive.jpg?v=1578430896");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/no_time_to_die_ver2_xlg_240x360_crop_center.progressive.jpg?v=1579790602");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/4969a4ebae4f48174949f62858744b6e_90d7dcec-b75c-4351-9f76-648fe988d934_240x360_crop_center.progressive.jpg?v=1573616160");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/8e5246d5f90632343a5ea3fa05c7255c_240x360_crop_center.progressive.jpg?v=1573618736");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/6b6a6ee4e4836ec59a764697bceedcf7_8c7f1dce-85a3-43a1-b36c-bc19eb61ca8b_240x360_crop_center.progressive.jpg?v=1573588670");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/1e15fbd887fc10991ab4e72a2e13204b_57f09e53-0aa1-4ac8-b911-e96d8ccb011d_240x360_crop_center.progressive.jpg?v=1573655061");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/24306c2e18861ddce67c3aa4d596b0e8_02fe0085-16f5-466a-a5b4-5cc8749940e2_240x360_crop_center.progressive.jpg?v=1573585470");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/0cffa2f8c6675d8dcf3c35b2c3b7ecc6_871ce4a1-11c2-4e9e-81c2-bdb3348c59b2_240x360_crop_center.progressive.jpg?v=1573618943");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/d9f6067d2406a7cfbf42a5fc4ae4cd9d_8174831c-db77-4608-9ae2-44aca8f2a6f5_240x360_crop_center.progressive.jpg?v=1573585461");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/4b8e2ff292ce6647d01538728266bd1e_2caa92eb-5dbd-4670-aaf1-fb0fe4a6be70_240x360_crop_center.progressive.jpg?v=1573593748");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/e43b6a65affe0a92f28bec1f2ba14c99_8f89b55a-6c3f-40f6-8ba1-c889ca04f73d_240x360_crop_center.progressive.jpg?v=1573587544");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/0ef9ae788e37c28023f50540549919e3_ce9c2c0a-d08e-4218-b313-6942e22efc15_240x360_crop_center.progressive.jpg?v=1573585426");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/ac0a6dacf9057374d621f3c407a38cfc_76d70549-bcf3-460b-a436-e4311d90c695_240x360_crop_center.progressive.jpg?v=1573654002");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/MPW-125796.jpg?v=1573856203");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/4f9d50ae4a6fa6d8850a778499dbbdfc_1774a7d7-eb4f-40e1-9ca9-9c5cff63a1d7.jpg?v=1573588757");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/108b520c55e3c9760f77a06110d6a73b_c27382ee-3919-461a-844d-03093fbdb8f7.jpg?v=1573593947");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/7dfddd911b8040729896c5be83f8e139_6e2f4149-8cb4-414c-a33b-9e0065c55af3.jpg?v=1573585216");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/a500a77c20007cc1a2b15bbb2f591e9b_796ba879-2793-4f78-938a-929863147150.jpg?v=1573585491");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/44b26f88e0fb3f1bf0a0660c099b8b19_b27d3a0c-9867-4ef1-a59d-f5304521c18d.jpg?v=1573594939");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/onceuponatimehollywood.flo.ar_a78d8781-be8f-4789-8527-6a0fe6a776bb.jpg?v=1597169479");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/2f3ce7bec424b234f13f395c3874bd72_3d56a288-2170-409a-96c7-931d1b9f26a7.jpg?v=1573588823");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/b4a0e6a811db22d64f5abd9c10661717_480x.progressive_3a39d700-4526-432d-bdff-6a4f9adc66ca.jpg?v=1606337024");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/edbeb65039c72e0138363d8b8d7e5f12_79d814f7-9ff1-437e-b1fa-7749fc6fd0eb.jpg?v=1573587463");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/6357015dc021635df93b388e4c87f945_61651485-0dad-4fa3-ad6c-09187b548df8.jpg?v=1573588795");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/ba725a04a0416d8959f38334f6af0c33_2c5acc58-11b0-41ff-8220-37b69ae0e5e5.jpg?v=1573588849");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/a367af8b717f224288f8664c7cf100f3_25dbee12-b1ad-4923-9984-28fe7b112ee0.jpg?v=1573587273");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/e9d0df80d465962cac9d802f050f10dd_3fcf490b-744f-4a4c-9727-02da5bf6be64.jpg?v=1573617238");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/ecb033e6d05abfda9b808f52823b0a2e_b5f776cf-7c8a-49d3-8055-b8a8f92c20b9.jpg?v=1573587562");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/ff3aa8492a1058e0e5e57fdfdd801a5c_a967eddc-f5fe-4ed2-b200-9e3cedcba082.jpg?v=1573585387");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/6294ae3e57013170bfffc9e8d77379c3.jpg?v=1573617350");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/5e5eaa0513fdf9a98283bc97cb3d082f_ff0f4923-3c8f-49cb-b91b-a85b430543eb.jpg?v=1573594875");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/558590bffb31f6b0be870ff9a46e2cbb.jpg?v=1573587254");
        add("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/9b69c0d073be29d0ddca371a222fab61_3bd6b7ca-40c4-4739-84ad-e9e01df9bd46.jpg?v=1573617262");
    }};


    public List<String> getImages() {
        return imageUrls;
    }
}
