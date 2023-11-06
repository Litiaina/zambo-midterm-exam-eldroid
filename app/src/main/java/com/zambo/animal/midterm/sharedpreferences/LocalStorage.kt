package com.zambo.animal.midterm.sharedpreferences

import android.content.SharedPreferences
import com.zambo.animal.midterm.data.AnimalData

class LocalStorage {
    companion object {
        val animals = arrayListOf(
            AnimalData("Armadillo", "Armadillos are small mammals with armored shells."),
            AnimalData("Baboon", "Baboons are primates known for their distinctive faces."),
            AnimalData("Cheetah", "Cheetahs are the fastest land animals, known for their speed and agility."),
            AnimalData("Dolphin", "Dolphins are highly intelligent marine mammals known for their playful behavior."),
            AnimalData("Elephant", "Elephants are the largest land animals and known for their long trunks."),
            AnimalData("Fennec Fox", "Fennec foxes are small desert foxes with large ears."),
            AnimalData("Gazelle", "Gazelles are graceful antelopes known for their speed."),
            AnimalData("Hippopotamus", "Hippos are large, mostly herbivorous mammals found near water."),
            AnimalData("Iguana", "Iguanas are reptiles known for their colorful scales."),
            AnimalData("Jaguar", "Jaguars are big cats known for their powerful jaws."),
            AnimalData("Kangaroo", "Kangaroos are marsupials known for their hopping locomotion."),
            AnimalData("Lemur", "Lemurs are small, arboreal primates native to Madagascar."),
            AnimalData("Meerkat", "Meerkats are small mammals known for their social behavior."),
            AnimalData("Nightingale", "Nightingales are small birds known for their beautiful songs."),
            AnimalData("Ocelot", "Ocelots are small wild cats with distinctive spotted coats."),
            AnimalData("Pangolin", "Pangolins are mammals with protective keratin scales."),
            AnimalData("Quokka", "Quokkas are small marsupials known for their friendly appearance."),
            AnimalData("Red Panda", "Red pandas are small mammals with reddish fur."),
            AnimalData("Sloth", "Sloths are slow-moving mammals known for their tree-dwelling lifestyle."),
            AnimalData("Tiger", "Tigers are big cats known for their striped patterns."),
            AnimalData("Uakari", "Uakaris are primates with bald faces and red faces."),
            AnimalData("Vulture", "Vultures are scavenging birds known for their bald heads."),
            AnimalData("Wallaby", "Wallabies are small marsupials similar to kangaroos."),
            AnimalData("X-ray Tetra", "X-ray Tetras are small fish with transparent bodies."),
            AnimalData("Yak", "Yaks are domesticated bovids native to the Himalayas."),
            AnimalData("Zebra", "Zebras are known for their black and white stripes.")
        )
        var sharedPreferences: SharedPreferences? = null
    }
}