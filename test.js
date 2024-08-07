function print(input) {
  let data = {};

  let rows = input.split(';');

  for (let i = 0; i < rows.length; i++) {
    if (!data['']) {
      data[''] = [];
    }
    data[''].push(rows[i].split(':')[1]);

    let columns = rows[i].split(':')[0].split(',');
    for (let j = 0; j < columns.length; j += 2) {
      if (!data[columns[j]]) {
        data[columns[j]] = [];
      }
      data[columns[j]].push(columns[j + 1]);
    }
  }

  for (let row in data) {
    console.log(row, ...data[row]);
  }
  //   console.log(data);
}

print('5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20');
