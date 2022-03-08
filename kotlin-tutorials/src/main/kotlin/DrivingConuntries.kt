fun main() {
    // Genewskiej - жинева
    val first: String = """
                    Albania / Albania
                    Algieria / Algeria
                    Argentyna / Argentina
                    Australia / Australia
                    Austria / Austria
                    Bangladesz / Bangladesh
                    Barbados / Barbados
                    Belgia / Belgium
                    Benin / Benin
                    Botswana / Botswana
                    Bułgaria / Bulgaria
                    Burkina Faso / Burkina Faso
                    Kambodża / Cambodia
                    Kanada / Canada
                    Republika Środkowoafrykańska / Central African Republic
                    Chile / Chile
                    Kongo / Congo
                    Wybrzeże Kości Słoniowej / Côte d'Ivoire
                    Kuba / Cuba
                    Cypr / Cyprus
                    Czechy / Czech Republic
                    Kongo / Democratic Republic of the Congo
                    Dania / Denmark
                    Dominikana / Dominican Republic
                    Ekwador / Ecuador
                    Egipt / Egypt
                    Fidżi / Fiji
                    Finlandia / Finland
                    Francja / France
                    Gruzja / Georgia
                    Ghana / Ghana
                    Grecja / Greece
                    Gwatemala / Guatemala
                    Haiti / Haiti
                    Watykan / Holy See
                    Węgry / Hungary
                    Islandia / Iceland
                    Indie / India
                    Irlandia / Ireland
                    Izrael / Israel
                    Włochy / Italy
                    Jamajka / Jamaica
                    Japonia / Japan
                    Kirgistan / Kyrgyzstan
                    Laos / Lao People's Democratic Republic
                    Liban / Lebanon
                    Lesotho / Lesotho
                    Luksemburg / Luxembourg
                    Madagaskar / Madagascar
                    Malawi / Malawi
                    Malezja / Malaysia
                    Mali / Mali
                    Malta / Malta
                    Monako / Monaco
                    Czarnogóra / Montenegro
                    Maroko / Morocco
                    Namibia / Namibia
                    Holandia / Netherlands
                    Nowa Zelandia / New Zealand
                    Niger / Niger
                    Nigeria / Nigeria
                    Norwegia / Norway
                    Papua Nowa Gwinea / Papua New Guinea
                    Paragwaj / Paraguay
                    Peru / Peru
                    Filipiny / Philippines
                    Polska / Poland
                    Portugalia / Portugal
                    Korea Południowa / Republic of Korea
                    Rumunia / Romania
                    Rosja / Russian Federation
                    Rwanda / Rwanda
                    San Marino / San Marino
                    Senegal / Senegal
                    Serbia / Serbia
                    Sierra Leone / Sierra Leone
                    Singapur / Singapore
                    Słowacja / Slovakia
                    Południowa Afryka / South Africa
                    Hiszpania / Spain
                    Sri Lanka / Sri Lanka
                    Szwecja / Sweden
                    Syria / Syrian Arab Republic
                    Tajlandia / Thailand
                    Togo / Togo
                    Trynidad i Tobago / Trinidad and Tobago
                    Tunezja / Tunisia
                    Turcja / Turkey
                    Uganda / Uganda
                    Zjednoczone Emiraty Arabskie / United Arab Emirates
                    Wielka Brytania / United Kingdom of Great Britain and Northern Ireland
                    Stany Zjednoczone / United States of America
                    Wenezuela / Venezuela (Bolivarian Republic of)
                    Wietnam / Viet Nam
                    Zimbabwe / Zimbabwe
                """

    // Wiedeńskiej -
    val second: String = """
                    Albania / Albania
                    Armenia / Armenia
                    Austria / Austria
                    Azerbejdżan / Azerbaijan
                    Bahamy / Bahamas
                    Bahrajn / Bahrain
                    Białoruś / Belarus
                    Belgia / Belgium
                    Bośnia i Herzegovina / Bosnia and Herzegovina
                    Brazylia / Brazil
                    Bułgaria / Bulgaria
                    Republika Środkowoafrykańska / Central African Republic
                    Wybrzeże Kości Słoniowej / Côte d'Ivoire
                    Chorwacja / Croatia
                    Kuba / Cuba
                    Czechy / Czech Republic
                    Demokratyczna Republika Konga / Democratic Republic of the Congo
                    Dania / Denmark
                    Estonia / Estonia
                    Finlandia / Finland
                    Francja / France
                    Gruzja / Georgia
                    Niemcy / Germany
                    Grecja / Greece
                    Gujana / Guyana
                    Węgry / Hungary
                    Iran / Iran (Islamic Republic of)
                    Izrael / Israel
                    Włochy / Italy
                    Kazachstan / Kazakhstan
                    Kenia / Kenya
                    Kuwejt / Kuwait
                    Kirgistan / Kyrgyzstan
                    Łotwa / Latvia
                    Liberia / Liberia
                    Litwa / Lithuania
                    Luksemburg / Luxembourg
                    Mołdawia / Moldova
                    Monako / Monaco
                    Mongolia / Mongolia
                    Czarnogóra / Montenegro
                    Maroko / Morocco
                    Holandia / Netherlands
                    Niger / Niger
                    Norwegia / Norway
                    Pakistan / Pakistan
                    Peru / Peru
                    Filipiny / Philippines
                    Polska / Poland
                    Portugalia / Portugal
                    Katar / Qatar
                    Rumunia / Romania
                    Rosja / Russian Federation
                    San Marino / San Marino
                    Arabia Saudyjska / Saudi Arabia
                    Senegal / Senegal
                    Serbia / Serbia
                    Seszele / Seychelles
                    Słowacja / Slovakia
                    Słowenia / Slovenia
                    Południowa Afryka / South Africa
                    Szwecja / Sweden
                    Szwajcaria / Switzerland
                    Tadżykistan / Tajikistan
                    Macedonia / The Former Yugoslav Republic of Macedonia
                    Tunezja / Tunisia
                    Turcja / Turkey
                    Turkmenistan / Turkmenistan
                    Ukraina / Ukraine
                    Zjednoczone Emiraty Arabskie / United Arab Emirates
                    Urugwaj / Uruguay
                    Uzbekistan / Uzbekistan
                    Wietnam / Viet Nam
                    Zimbabwe / Zimbabwe
                """

    val firstA = first.splitToSequence("\n")
    val secondA = second.splitToSequence("\n")

    val count = secondA.filterNot {
        firstA.contains(it)
    }.count()
    println(count)
/*        .forEach {
        println(it)
    }*/

    println("\t\t\t\t\t-----------------")

    val count2 = firstA.filterNot {
        secondA.contains(it)
    }.count()

    println(count2)
/*        .forEach {
        println(it)
    }*/

}