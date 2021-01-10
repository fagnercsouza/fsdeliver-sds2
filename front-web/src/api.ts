import axios from "axios"

const API_URL = 'https://fsdeliver-sds2.herokuapp.com'
// const API_URL_LOCAL = 'http://localhost:8080'

const mapboxToken = process.env.REACT_APP_ACCESS_TOKEN_MAP_BOX

export function fetchProducts(){
    return axios(`${API_URL}/products` )
    // return axios(`${API_URL_LOCAL}/products` )
}

export function fetchLocalMapBox(local: string){
    return axios(`https://api.mapbox.com/geocoding/v5/mapbox.places/${local}.json?access_token=${mapboxToken}

    `)
}