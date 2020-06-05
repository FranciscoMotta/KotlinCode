package modelo

class  Shoe {
    var size: Int = 34 // Min 34
    set(value) {
        if (value >= 34)
        field = value
        else
            field = 34
    }
    var color: String = "White"
    var model: String = "Boots" // No sean tenis
    set(value) {
        if (value.equals("Tenis"))
            field = "Boots"
        else
            field = value
    }
}