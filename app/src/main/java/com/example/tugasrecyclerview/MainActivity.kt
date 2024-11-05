package com.example.tugasrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

val adapterGame = GameAdapter(generateDataDummy()) {
            game ->
            Toast.makeText(this, "You click on ${game.nameGame}", Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            rvGame.apply {
                adapter = adapterGame
                layoutManager = GridLayoutManager(this@MainActivity, 3)
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun generateDataDummy(): List<Game> {
        return listOf(
                Game(
                    nameGame = "Minecraft",
                    image = "https://store-images.s-microsoft.com/image/apps.808.14492077886571533.be42f4bd-887b-4430-8ed0-622341b4d2b0.c8274c53-105e-478b-9f4b-41b8088210a3?q=90&w=256&h=384&mode=crop&format=jpg&background=%23FFFFFF"
                ),
        Game(
            nameGame = "Genshin Impact",
            image = "https://static-cdn.jtvnw.net/ttv-boxart/513181_IGDB-272x380.jpg"
        ),
        Game(
            nameGame = "PUBG Mobile",
            image = "https://upload.wikimedia.org/wikipedia/en/thumb/4/44/PlayerUnknown%27s_Battlegrounds_Mobile.webp/180px-PlayerUnknown%27s_Battlegrounds_Mobile.webp.png"
        ),
        Game(
            nameGame = "Mobile Legends",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg0v7EhHE9_nxt6jliJfAY10iL3oaZIH9wCw&s"
        ),
        Game(
            nameGame = "League of Legends",
            image = "https://brand.riotgames.com/static/a91000434ed683358004b85c95d43ce0/8a20a/lol-logo.png"
        ),
        Game(
            nameGame = "Valorant",
            image = "https://static.vecteezy.com/system/resources/previews/022/636/388/non_2x/valorant-logo-valorant-icon-transparent-free-png.png"
        ),
        Game(
            nameGame = "Call of Duty: Mobile",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUb67AxJQgkOwrAsV8zXpR1IryK4w4TtIWiA&s"
        ),
        Game(
            nameGame = "Free Fire",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjZuWSMCJFd54d6Uixk_fbfuw-zHEod5cwRQ&s"
        ),
        Game(
            nameGame = "Fortnite",
            image = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/FortniteLogo.svg/1280px-FortniteLogo.svg.png"
        ),
        Game(
            nameGame = "Among Us",
            image = "https://play-lh.googleusercontent.com/8ddL1kuoNUB5vUvgDVjYY3_6HwQcrg1K2fd_R8soD-e2QYj8fT9cfhfh3G0hnSruLKec"
        ),
        Game(
            nameGame = "Apex Legends",
            image = "https://media.contentapi.ea.com/content/dam/apex-legends/images/2019/01/apex-featured-image-16x9.jpg.adapt.crop16x9.1023w.jpg"
        ),
        Game(
            nameGame = "Roblox",
            image = "https://play-lh.googleusercontent.com/WNWZaxi9RdJKe2GQM3vqXIAkk69mnIl4Cc8EyZcir2SKlVOxeUv9tZGfNTmNaLC717Ht"
        ),
        Game(
            nameGame = "Clash of Clans",
            image = "https://play-lh.googleusercontent.com/LByrur1mTmPeNr0ljI-uAUcct1rzmTve5Esau1SwoAzjBXQUby6uHIfHbF9TAT51mgHm"
        ),
        Game(
            nameGame = "Clash Royale",
            image = "https://play-lh.googleusercontent.com/rIvZQ_H3hfmexC8vurmLczLtMNBFtxCEdmb2NwkSPz2ZuJJ5nRPD0HbSJ7YTyFGdADQ"
        ),
        Game(
            nameGame = "Brawl Stars",
            image = "https://play-lh.googleusercontent.com/EiElcSrd6-o-19roiswSx0AZPzsq6qF3hUGHsSWDl5UVtj7G23DHkneM8ucwqyOmEg"
        ),
        Game(
            nameGame = "Candy Crush Saga",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWEcICyb_vUXCT9z_H_eqn_HpOcv-2rq27MA&s"
        ),
        Game(
            nameGame = "Wild Rift",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIqJN4-A0id9exoLHvb4Zit8-D0Ry9Vp9E2A&s"
        ),
        Game(
            nameGame = "Pokemon GO",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRgV0U-ltBt9MhHER2e_c0kdwUv0A7K4jcKQ&s"
        ),
        Game(
            nameGame = "FIFA Mobile",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5uf8AaEhWFTnu_aOtQpsORaPs0D64TezBHA&s"
        )
        )
    }
}