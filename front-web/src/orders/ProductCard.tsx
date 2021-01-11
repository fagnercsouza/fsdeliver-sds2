import { Product } from './types';

type Props = {
    product: Product;
    onSelectProduct: (product: Product) => void; 
    isSelected: boolean;
}

function formatPrice(price: number){
    const formatter = new Intl.NumberFormat('pt-BR',{
        style: 'currency',
        currency: 'BRL',
        // define a quantidade de casas decimais 
        // maximumFractionDigits: 2
    })
    return formatter.format(price)
}
function ProductCard({product, onSelectProduct, isSelected}:Props){
 
    return(
        <div 
            className={`order-card-container ${isSelected  ? 'selected' : ''}`}
            onClick={() => onSelectProduct(product)}
            >
            <div className="order-card-content">
                <h3 className="order-card-title">
                { product.name}
                </h3>
                <img className="order-card-image" src={product.imageUri} alt={product.name}/>
                <h3 className="order-card-price">{formatPrice(product.price)} </h3>
                <div className="order-card-description">
                    <h3>Descrição</h3>
                    <p> {product.description}</p>
                </div>
            </div>
        </div>
    )
}

export default ProductCard;