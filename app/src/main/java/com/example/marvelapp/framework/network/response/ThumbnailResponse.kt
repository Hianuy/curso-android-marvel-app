package com.example.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName

data class ThumbnailResponse(
    @SerializedName("path")
    val path: String,
    // como o gson funciona da seguinte forma
    // se eu quiser mapear essa propriedade aqui
    // o nome que eu escolhi para aquela propriedade extension da minha api
    // eu tenho que fornecer serializedName(Anotacao)
    // eu sei que dps eu vou nas outras camadas da minha aplicacao eu vou fazer a conversao
    // desse objeto de response para o objeto de domain que vai ser salvo no banco de dados
    // que dps vai ser consumido na nossa camada de visualizacao
    @SerializedName("extension")
    val extension: String
)