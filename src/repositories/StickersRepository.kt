package repositories

import data.Sticker

object StickersRepository {

    private val stickers = mutableListOf<Sticker>()

    init {
        stickers.add(
            Sticker(
                1L,
                "Allosaurus",
                "Allosaurus es un gran terópodo típico, con un cráneo grande y un cuello corto, una cola larga y miembros superiores reducidos.",
                9.0,
                2.5,
                "https://cdn.paleo.gg/games/jwpo/images/dino/allosaurus.png"
            )
        )
        stickers.add(
            Sticker(
                2L,
                "Tyrannosaurus Rex",
                "Uno de los depredadores más grandes que jamás haya existido, con una mordida poderosa y una presencia imponente.",
                12.3,
                8.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/tyrannosaurusrex.png"
            )
        )

        stickers.add(
            Sticker(
                3L,
                "Triceratops",
                "Dinosaurio herbívoro conocido por sus tres cuernos faciales y su gran gola ósea.",
                3.0,
                6.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/triceratops.png"
            )
        )

        stickers.add(
            Sticker(
                4L,
                "Velociraptor",
                "Pequeño pero ágil carnívoro, famoso por su velocidad y agilidad en la caza.",
                0.5,
                0.015,
                "https://cdn.paleo.gg/games/jwe2/images/dino/velociraptor.png"
            )
        )

        stickers.add(
            Sticker(
                5L,
                "Brachiosaurus",
                "Saurópodo de cuello largo que se alimentaba de las copas de los árboles más altos.",
                13.0,
                56.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/brachiosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                6L,
                "Stegosaurus",
                "Reconocido por las placas óseas en su espalda y su cola con púas defensivas.",
                4.0,
                5.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/stegosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                7L,
                "Spinosaurus",
                "Carnívoro semiacuático con una distintiva vela en su espalda.",
                6.0,
                7.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/spinosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                8L,
                "Ankylosaurus",
                "Dinosaurio acorazado con una maza ósea en la cola para defensa.",
                1.7,
                6.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/ankylosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                9L,
                "Diplodocus",
                "Saurópodo de cuello y cola largos, uno de los más largos de su época.",
                4.6,
                15.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/diplodocus.png"
            )
        )

        stickers.add(
            Sticker(
                10L,
                "Iguanodon",
                "Uno de los primeros dinosaurios descubiertos, conocido por su pulgar en forma de espina.",
                3.0,
                3.5,
                "https://cdn.paleo.gg/games/jwe2/images/dino/iguanodon.png"
            )
        )

        stickers.add(
            Sticker(
                11L,
                "Pachycephalosaurus",
                "Dinosaurio herbívoro con un cráneo abovedado y grueso.",
                1.5,
                0.45,
                "https://cdn.paleo.gg/games/jwe2/images/dino/pachycephalosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                12L,
                "Carnotaurus",
                "Depredador bípedo con cuernos distintivos sobre sus ojos.",
                3.0,
                1.5,
                "https://cdn.paleo.gg/games/jwpo/images/dino/carnotaurus.png"
            )
        )

        stickers.add(
            Sticker(
                13L,
                "Parasaurolophus",
                "Dinosaurio herbívoro conocido por su cresta tubular en la cabeza.",
                4.0,
                2.5,
                "https://cdn.paleo.gg/games/jwe2/images/dino/parasaurolophus.png"
            )
        )

        stickers.add(
            Sticker(
                14L,
                "Pteranodon",
                "Reptil volador con una envergadura impresionante y una cresta craneal.",
                1.8,
                0.02,
                "https://cdn.paleo.gg/games/jwe2/images/dino/pteranodon.png"
            )
        )

        stickers.add(
            Sticker(
                15L,
                "Apatosaurus",
                "Saurópodo de gran tamaño con un cuello largo y una cola poderosa.",
                4.5,
                22.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/apatosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                16L,
                "Compsognathus",
                "Pequeño dinosaurio carnívoro ágil y rápido.",
                0.3,
                0.003,
                "https://cdn.paleo.gg/games/jwe2/images/dino/compsognathus.png"
            )
        )

        stickers.add(
            Sticker(
                17L,
                "Giganotosaurus",
                "Uno de los terópodos más grandes, superando en tamaño al T. rex.",
                4.0,
                8.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/giganotosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                18L,
                "Megalosaurus",
                "Primer dinosaurio nombrado científicamente, un carnívoro robusto.",
                3.0,
                1.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/majungasaurus.png"
            )
        )

        stickers.add(
            Sticker(
                19L,
                "Therizinosaurus",
                "Dinosaurio terópodo conocido por sus enormes garras en forma de hoz.",
                4.5,
                5.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/therizinosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                20L,
                "Styracosaurus",
                "Ceratopsiano con grandes cuernos y espinas alrededor del cuello.",
                2.2,
                2.7,
                "https://cdn.paleo.gg/games/jwe2/images/dino/styracosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                21L,
                "Gallinimus",
                "Pequeño dinosaurio con pico sin dientes, inicialmente pensado como ladrón de huevos.",
                1.6,
                0.03,
                "https://cdn.paleo.gg/games/jwe2/images/dino/gallimimus.png"
            )
        )

        stickers.add(
            Sticker(
                22L,
                "Deinonychus",
                "Primo del Velociraptor, famoso por su garra curva en el pie y comportamiento en grupo.",
                3.4,
                0.08,
                "https://cdn.paleo.gg/games/jwe2/images/dino/deinonychus.png"
            )
        )

        stickers.add(
            Sticker(
                23L,
                "Corythosaurus",
                "Dinosaurio herbívoro con una cresta en forma de casco.",
                3.0,
                2.5,
                "https://cdn.paleo.gg/games/jwe2/images/dino/corythosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                24L,
                "Mononykus",
                "Pequeño terópodo con un solo dedo funcional en cada mano.",
                1.0,
                0.005,
                "https://cdn.paleo.gg/games/jwe2/images/dino/archaeornithomimus.png"
            )
        )

        stickers.add(
            Sticker(
                25L,
                "Ouranosaurus",
                "Herbívoro con una vela dorsal, similar al Spinosaurus pero pacífico.",
                2.7,
                4.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/ouranosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                26L,
                "Troodon",
                "Dinosaurio pequeño e inteligente, con grandes ojos para ver en la oscuridad.",
                2.0,
                0.05,
                "https://cdn.paleo.gg/games/jwe2/images/dino/troodon.png"
            )
        )

        stickers.add(
            Sticker(
                27L,
                "Maiasaura",
                "Dinosaurio herbívoro conocido por su comportamiento de cuidado parental.",
                2.5,
                3.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/maiasaura.png"
            )
        )

        stickers.add(
            Sticker(
                28L,
                "Euoplocephalus",
                "Dinosaurio acorazado con una gran maza en la cola, similar al Ankylosaurus.",
                2.4,
                2.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/euoplocephalus.png"
            )
        )

        stickers.add(
            Sticker(
                29L,
                "Dilophosaurus",
                "Carnívoro ágil con una doble cresta en la cabeza, famoso por su rol en películas.",
                2.0,
                0.4,
                "https://cdn.paleo.gg/games/jwe2/images/dino/dilophosaurus.png"
            )
        )

        stickers.add(
            Sticker(
                30L,
                "Edmontosaurus",
                "Uno de los hadrosaurios más grandes, con un hocico similar al de un pato.",
                3.4,
                4.0,
                "https://cdn.paleo.gg/games/jwe2/images/dino/edmontosaurus.png"
            )
        )


    }

}