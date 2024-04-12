class PaginationHelper {
	constructor(collection, itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
	}
	itemCount() {
    return this.collection.length;
	}
	pageCount() {
    return Math.ceil(this.collection.length / this.itemsPerPage);
	}
	pageItemCount(pageIndex) {
    let totPag = this.collection.length, qtdItensPag = this.itemsPerPage, resto = 0, cc = 0;

    if (pageIndex > (Math.ceil(totPag / qtdItensPag)) - 1) return -1;

    while(cc <= pageIndex) {
      let aux = totPag;
      totPag -= qtdItensPag; 
      if (cc === pageIndex) {
        if (totPag < 0) return aux % qtdItensPag;
        else return qtdItensPag;
      }
      cc++;
    }
    return -1;
	}
	pageIndex(itemIndex) {
    if(this.collection.length === 0) return -1;
    if(itemIndex < 0 || itemIndex >= this.collection.length) return -1;
    return Math.trunc(itemIndex / this.itemsPerPage)
	}
}
// SHITTY SOLUTION XD

var helper = new PaginationHelper(['a','b','c','d','e','f'], 4);
console.log(helper.pageCount());
console.log(helper.itemCount());
console.log(helper.pageItemCount(0));
console.log(helper.pageIndex(5));
console.log(helper.pageIndex(7))