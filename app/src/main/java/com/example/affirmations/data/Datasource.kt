/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.car_name1, R.string.car_description1, R.drawable.car_image1),
            Affirmation(R.string.car_name2, R.string.car_description2, R.drawable.car_image2),
            Affirmation(R.string.car_name3, R.string.car_description3, R.drawable.car_image3),
            Affirmation(R.string.car_name4, R.string.car_description4, R.drawable.car_image4),
            Affirmation(R.string.car_name5, R.string.car_description5, R.drawable.car_image5),
            Affirmation(R.string.car_name6, R.string.car_description6, R.drawable.car_image6),
            Affirmation(R.string.car_name7, R.string.car_description7, R.drawable.car_image7),
            Affirmation(R.string.car_name8, R.string.car_description8, R.drawable.car_image8),
            Affirmation(R.string.car_name9, R.string.car_description9, R.drawable.car_image9),
            Affirmation(R.string.car_name10, R.string.car_description10, R.drawable.car_image10),
            Affirmation(R.string.car_name11, R.string.car_description11, R.drawable.car_image11),
            Affirmation(R.string.car_name12, R.string.car_description12, R.drawable.car_image12),
            Affirmation(R.string.car_name13, R.string.car_description13, R.drawable.car_image13),
            Affirmation(R.string.car_name14, R.string.car_description14, R.drawable.car_image14),
            Affirmation(R.string.car_name15, R.string.car_description15, R.drawable.car_image15),
            Affirmation(R.string.car_name16, R.string.car_description16, R.drawable.car_image16),
            Affirmation(R.string.car_name17, R.string.car_description17, R.drawable.car_image17),
            Affirmation(R.string.car_name18, R.string.car_description18, R.drawable.car_image18),
            Affirmation(R.string.car_name19, R.string.car_description19, R.drawable.car_image19),
            Affirmation(R.string.car_name20, R.string.car_description20, R.drawable.car_image20),
            Affirmation(R.string.car_name21, R.string.car_description21, R.drawable.car_image21),
            Affirmation(R.string.car_name22, R.string.car_description22, R.drawable.car_image22),
            Affirmation(R.string.car_name23, R.string.car_description23, R.drawable.car_image23),
            Affirmation(R.string.car_name24, R.string.car_description24, R.drawable.car_image24),
            Affirmation(R.string.car_name25, R.string.car_description25, R.drawable.car_image25),
            Affirmation(R.string.car_name26, R.string.car_description26, R.drawable.car_image26),
            Affirmation(R.string.car_name27, R.string.car_description27, R.drawable.car_image27),
            Affirmation(R.string.car_name28, R.string.car_description28, R.drawable.car_image28),
            Affirmation(R.string.car_name29, R.string.car_description29, R.drawable.car_image29),
            Affirmation(R.string.car_name30, R.string.car_description30, R.drawable.car_image30)

        )
    }
}
