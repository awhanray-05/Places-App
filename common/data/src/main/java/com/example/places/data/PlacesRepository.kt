/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.places.data

import com.example.places.data.model.Place

val PLACES = listOf(
    /*
    Place(
        0,
        "Brooklyn Bridge",
        "The Brooklyn Bridge is a hybrid cable-stayed/suspension bridge in New York City, spanning the East River between the boroughs of Manhattan and Brooklyn. Opened on May 24, 1883, the Brooklyn Bridge was the first fixed crossing of the East River. It was also the longest suspension bridge in the world at the time of its opening, with a main span of 1,595.5 feet (486.3 m) and a deck 127 ft (38.7 m) above mean high water. The span was originally called the New York and Brooklyn Bridge or the East River Bridge but was officially renamed the Brooklyn Bridge in 1915.",
        40.7057,
        -73.9964
    ),
    Place(
        1,
        "Empire State Building",
        "The Empire State Building is a 102-story Art Deco skyscraper in Midtown Manhattan, New York City. The building was designed by Shreve, Lamb & Harmon and built from 1930 to 1931. Its name is derived from \"Empire State\", the nickname of the state of New York. The building has a roof height of 1,250 feet (380 m) and stands a total of 1,454 feet (443.2 m) tall, including its antenna. The Empire State Building stood as the world's tallest building until the construction of the World Trade Center in 1970; following the latter's collapse in 2001, the Empire State Building reverted to being the city's tallest skyscraper until that title was surpassed in 2012. As of 2022, the building is the seventh-tallest building in New York City, the ninth-tallest completed skyscraper in the United States, the 54th-tallest in the world, and the sixth-tallest freestanding structure in the Americas.",
        40.748333,
        -73.985278
    ),
    Place(
        2,
        "Statue of Liberty",
        "The Statue of Liberty (Liberty Enlightening the World; French: La Liberté éclairant le monde) is a colossal neoclassical sculpture on Liberty Island in New York Harbor in New York City, in the United States. The copper statue, a gift from the people of France, was designed by French sculptor Frédéric Auguste Bartholdi and its metal framework was built by Gustave Eiffel. The statue was dedicated on October 28, 1886.",
        40.689167,
        -74.044444
    ),
     */

    Place(
        0,
        "Taj Mahal",
        "The Taj Mahal is an ivory-white marble mausoleum on the southern bank of the river Yamuna in Agra, India. Commissioned in 1632 by the Mughal emperor Shah Jahan to house the tomb of his favorite wife, Mumtaz Mahal, it is regarded as one of the most beautiful buildings in the world.",
        27.1751,
        78.0421
    ),
    Place(
        1,
        "Gateway of India",
        "The Gateway of India is an arch-monument built in the early 20th century in the city of Mumbai. It was erected to commemorate the landing of King George V and Queen Mary at Apollo Bunder during their visit to India in 1911.",
        18.921984,
        72.834654
    ),
    Place(
        2,
        "Qutub Minar",
        "The Qutub Minar is a minaret and 'victory tower' that forms part of the Qutub complex, a UNESCO World Heritage Site in Delhi, India. It is one of the tallest minarets in the world made of bricks.",
        28.5244,
        77.1855
    ),
    Place(
        3,
        "India Gate",
        "India Gate is a war memorial located astride the Rajpath, on the eastern edge of the 'ceremonial axis' of New Delhi. It commemorates the 70,000 Indian soldiers who lost their lives fighting for the British Army during World War I.",
        28.6129,
        77.2295
    ),
    Place(
        4,
        "Hawa Mahal",
        "Hawa Mahal, also known as the 'Palace of Winds', is a palace in Jaipur, India. Made with red and pink sandstone, it was built in 1799 by Maharaja Sawai Pratap Singh to allow royal women to observe street festivities while unseen from outside.",
        26.9239,
        75.8267
    ),
    Place(
        5,
        "Charminar",
        "The Charminar is a monument and mosque located in Hyderabad, India. Constructed in 1591, it is a symbol of Hyderabad and is known for its four grand arches and minarets.",
        17.3616,
        78.4747
    ),
    Place(
        6,
        "Mysore Palace",
        "The Mysore Palace is a historical palace and a royal residence in Mysore, Karnataka, India. It served as the official residence of the Wadiyar dynasty and the seat of the Kingdom of Mysore.",
        12.3051,
        76.6551
    ),
    Place(
        7,
        "Meenakshi Temple",
        "The Meenakshi Temple is a historic Hindu temple located on the southern bank of the Vaigai River in the temple city of Madurai, Tamil Nadu. It is dedicated to Meenakshi, a form of Parvati, and her consort, Sundareswarar (Shiva).",
        9.9195,
        78.1191
    ),
    Place(
        8,
        "Golden Temple",
        "The Golden Temple, also known as Harmandir Sahib, is the holiest Gurdwara and the most important pilgrimage site of Sikhism, located in Amritsar, Punjab. It is known for its stunning golden architecture and spiritual significance.",
        31.6200,
        74.8765
    ),
    Place(
        9,
        "Victoria Memorial",
        "The Victoria Memorial is a large marble building in Kolkata, India, which was built between 1906 and 1921. Dedicated to the memory of Queen Victoria, it is now a museum and a major tourist destination.",
        22.5448,
        88.3426
    )

)

class PlacesRepository {
    fun getPlaces(): List<Place> {
        return PLACES
    }

    fun getPlace(placeId: Int): Place? {
        return PLACES.find { it.id == placeId }
    }
}