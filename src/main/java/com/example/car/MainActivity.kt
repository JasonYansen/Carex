package com.example.car

import android.accounts.AuthenticatorDescription
import android.content.Intent
import android.icu.text.LocaleDisplayNames
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.view.View
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageId: Array<Int>
    private lateinit var names: Array<String>
    private lateinit var description: Array<String>

    private lateinit var recView: RecyclerView
    private lateinit var itemArrayList: ArrayList<Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.about_page)
        btnMoveActivity.setOnClickListener(this)

        imageId = arrayOf(
            R.drawable.car1,
            R.drawable.car2,
            R.drawable.car3,
            R.drawable.car4,
            R.drawable.car5,
            R.drawable.car6,
            R.drawable.car7,
            R.drawable.car8,
            R.drawable.car9,
            R.drawable.car10
        )

        names = arrayOf(
            "Marci - Rudolf",
            "Surf - XX24",
            "Willow - AXL",
            "Wavy - Tsunami",
            "Roxxy - ModelX",
            "Alpha - Beast",
            "Lofi - Durt",
            "Motto - Lyric",
            "Zumse - Kusama",
            "Rock - Supreme"
        )

        description = arrayOf(
            "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A classic convertible design that combines elegance and timeless aesthetics. Its displayed against a pure white background, which highlights its beauty and detailed craftsmanship. This car boasts a soft-top convertible roof that adds a sense of luxury and freedom, perfect for a leisurely drive on a sunny day. The body of the car is painted in a deep, rich color, creating a beautiful contrast with the white backdrop and accentuating its graceful curves and sophisticated silhouette.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "An ultra-modern electric SUV, designed with a bold and innovative approach that accentuates its cutting-edge features and robust silhouette. Presented against a pure white background, the vehicle stands out, showcasing a futuristic look characterized by smooth, flowing lines and a matte finish. The subtle LED lighting elegantly outlines the SUVs shape, emphasizing its advanced design and technological prowess.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A luxurious car that transcends mere transportation to an unparalleled realm of extravagance and sophistication. Crafted with meticulous attention to detail and adorned with the finest materials, this masterpiece of engineering embodies prestige and refinement at every turn.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A futuristic car that defies convention and propels us into a realm of visionary transportation. With its sleek lines, aerodynamic contours, and cutting-edge design elements, this marvel of engineering is a testament to the boundless possibilities of tomorrow.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A fast sport car, a symphony of speed and agility that leaves everything else in the rear-view mirror. From its sleek, aerodynamic silhouette to its ferocious engine, every element of this automotive marvel is finely tuned for one purpose: to dominate the asphalt with unparalleled velocity.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A versatile and dynamic blend of functionality, style, and practicality perfectly tailored to the modern urban adventurer. With its compact dimensions and rugged design, this vehicle effortlessly navigates crowded city streets while offering ample space for both passengers and cargo.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "The fastest car on the planet, a symphony of speed, power, and engineering prowess that redefines the boundaries of performance. From its sleek, aerodynamic design to its mind-boggling acceleration, every aspect of this automotive marvel is meticulously crafted to push the limits of whats possible on four wheels.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A harmonious fusion of innovation, elegance, and cutting-edge technology that redefines the concept of luxury transportation. With its sleek lines, aerodynamic profile, and avant-garde design elements, this automotive masterpiece stands as a beacon of progress in a world of constant evolution.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.",
            "A rugged and versatile vehicle designed to conquer the great outdoors and explore the uncharted territories of the world. With its robust build, off-road capabilities, and go-anywhere attitude, this automotive marvel is the perfect companion for those who crave adrenaline-fueled escapades and crave the thrill of exploration.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look.\n" +
                    "A modern sports car with a sleek, aerodynamic design, showcased on a pure white background to emphasize its shape and features. The car has a low, wide stance, with a glossy finish that highlights its curves and lines. It features cutting-edge aerodynamic elements, like a rear spoiler and air intakes, with high-performance wheels that complement its sporty look."
        )

        recView = findViewById(R.id.recView)
        recView.layoutManager = LinearLayoutManager(this)
        recView.setHasFixedSize(true)

        itemArrayList = arrayListOf()

        getData()

        recView.adapter = RecAdapter(itemArrayList)
    }


    private fun getData(){

        for (i in imageId.indices){
            val car = Car(imageId[i], names[i], description[i])
            itemArrayList.add(car)
        }
    }
    override fun onClick(v: View?){
        when(v?.id){
            R.id.about_page -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)

            }
        }
    }
}